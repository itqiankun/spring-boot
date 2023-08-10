package com.itqiankun.cache.redis;

import cn.hutool.core.util.ObjectUtil;
import com.google.common.base.Stopwatch;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.BoundValueOperations;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.data.redis.core.script.DefaultRedisScript;
import org.springframework.data.redis.serializer.StringRedisSerializer;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.util.Collections;
import java.util.concurrent.TimeUnit;

/**
 * @author: ma_qiankun
 * @date: 2023/8/9
 **/
@Slf4j
@Component
public class OrderService {

	@Autowired
	private StringRedisTemplate stringRedisTemplate;


	public void testStringKey() {
		Stopwatch started = Stopwatch.createStarted();
		stringRedisTemplate.opsForValue().set("aaa", "111");
		System.out.println("存储消耗时间:"+started.elapsed(TimeUnit.MILLISECONDS));
		started.reset();
		started.start();
		String s = stringRedisTemplate.opsForValue().get("aaa");
		System.out.println(s);
		System.out.println("查询消耗时间:"+started.elapsed(TimeUnit.MILLISECONDS));
	}


	public String secKill() {
		// secKillKey值是50
		String redisKey = "secKillKey";
		// 加锁，保证线程顺序消费秒杀key。
        synchronized (OrderService.class){
			BoundValueOperations<String, String> stringStringBoundValueOperations = stringRedisTemplate.boundValueOps(redisKey);
			Object o = stringStringBoundValueOperations.get();
			if(ObjectUtil.isNotNull(o)){
				int integer = Integer.parseInt(o.toString());
				int i = integer - 1;
				if(i >= 0){
					stringStringBoundValueOperations.set(String.valueOf(i));
					log.info("获取原订单数:{},之后订单数:{}, 当前线程:{}", integer,i, Thread.currentThread().getName());

				} else {
					return "false";
				}

			}
        }


		try {
			// 执行数据库逻辑
			TimeUnit.SECONDS.sleep(1);
		} catch (InterruptedException e) {
			throw new RuntimeException(e);
		}


		return "success";
	}


	public String secKillLua() {
		// secKillKey值是100
		String redisKey = "secKillKey";
		String luaScript = "local currentQuantity = tonumber(redis.call(\"GET\",  KEYS[1]))\n" +
				"if currentQuantity <= 0 then\n" +
				"    return \"false\"\n" +
				"end\n" +
				"redis.call(\"DECR\",  KEYS[1])\n" +
				"return \"true\"\n";
		DefaultRedisScript<String> script = new DefaultRedisScript<>(luaScript, String.class);
		// 执行Lua脚本，加锁，保证线程顺序消费秒杀key。
		synchronized (OrderService.class){
			String execute = stringRedisTemplate.execute(script, Collections.singletonList(redisKey));
			log.info("lua执行结果:{}", execute);
			if(ObjectUtil.equal(execute, "false")){
				return "false";
			}
		}

		try {
			// 执行数据库逻辑
			TimeUnit.SECONDS.sleep(1);
		} catch (InterruptedException e) {
			throw new RuntimeException(e);
		}
		return "success";
	}
}
