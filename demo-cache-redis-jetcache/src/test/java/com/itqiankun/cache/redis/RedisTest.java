package com.itqiankun.cache.redis;

import com.alibaba.fastjson.JSONObject;
import com.google.common.base.Stopwatch;
import com.google.common.collect.Lists;
import com.itqiankun.cache.redis.entity.User;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.data.redis.core.ValueOperations;

import java.util.List;
import java.util.concurrent.TimeUnit;

/**
 * <p>
 * Redis测试
 * </p>
 *
 * @author ma_qiankun
 * @date Created in 2018-11-15 17:17
 */
@Slf4j
public class RedisTest extends SpringBootDemoCacheRedisApplicationTests {

  @Autowired
  private StringRedisTemplate stringRedisTemplate;

  @Autowired
  private RedisTemplate redisTemplate;


  @Test
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


  @Test
  public void testStringObj() {
    Stopwatch started = Stopwatch.createStarted();
    User user=new User("aa@126.com", "aa", "aa123456", "aa","123");
    ValueOperations<String, String> stringStringValueOperations = stringRedisTemplate.opsForValue();
    stringStringValueOperations.set("com.itqiankunx", JSONObject.toJSONString(user));
    System.out.println("存储消耗时间:"+started.elapsed(TimeUnit.MILLISECONDS));
    started.reset();
    started.start();
    String s = stringRedisTemplate.opsForValue().get("com.itqiankunx");
    System.out.println(s);
    System.out.println("查询消耗时间:"+started.elapsed(TimeUnit.MILLISECONDS));
  }

  @Test
  public void testStringListObj() {
    Stopwatch started = Stopwatch.createStarted();
    List<User> objects = Lists.newArrayList();
    for (int i = 0; i < 100; i++) {
      User user=new User("aa@126.com", "aa", "aa123456", "aa","123");
      objects.add(user);
    }
    ValueOperations<String, String> stringStringValueOperations = stringRedisTemplate.opsForValue();
    stringStringValueOperations.set("testStringListObj", JSONObject.toJSONString(objects));
    System.out.println("存储消耗时间:"+started.elapsed(TimeUnit.MILLISECONDS));
    started.reset();
    started.start();
    String s = stringRedisTemplate.opsForValue().get("testStringListObj");
    System.out.println(s);
    System.out.println("查询消耗时间:"+started.elapsed(TimeUnit.MILLISECONDS));
  }



  @Test
  public void testStreamObj()  {
    Stopwatch started = Stopwatch.createStarted();
    User user=new User("aa@126.com", "aa", "aa123456", "aa","123");
    ValueOperations<String, User> operations=redisTemplate.opsForValue();
    operations.set("testStreamObj", user);
    System.out.println("存储消耗时间:"+started.elapsed(TimeUnit.MILLISECONDS));
    started.reset();
    started.start();
    Object o = redisTemplate.opsForValue().get("testStreamObj");
    System.out.println(JSONObject.toJSON(o));
    System.out.println("查询消耗时间:"+started.elapsed(TimeUnit.MILLISECONDS));
  }


  @Test
  public void testStreamListObj()  {
    Stopwatch started = Stopwatch.createStarted();
    List<User> objects = Lists.newArrayList();
    for (int i = 0; i < 100; i++) {
      User user=new User("aa@126.com", "aa", "aa123456", "aa","123");
      objects.add(user);
    }
    User user=new User("aa@126.com", "aa", "aa123456", "aa","123");
    ValueOperations<String, List<User>> operations=redisTemplate.opsForValue();
    operations.set("testStreamListObj", objects);
    System.out.println("存储消耗时间:"+started.elapsed(TimeUnit.MILLISECONDS));
    started.reset();
    started.start();
    Object o = redisTemplate.opsForValue().get("testStreamListObj");
    System.out.println(JSONObject.toJSON(o));
    System.out.println("查询消耗时间:"+started.elapsed(TimeUnit.MILLISECONDS));
  }

}
