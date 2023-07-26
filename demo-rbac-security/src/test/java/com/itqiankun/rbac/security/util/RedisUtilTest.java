package com.itqiankun.rbac.security.util;

import cn.hutool.json.JSONUtil;
import com.itqiankun.rbac.security.SpringBootDemoRbacSecurityApplicationTests;
import com.itqiankun.rbac.security.common.Consts;
import com.itqiankun.rbac.security.common.PageResult;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * <p>
 * 测试RedisUtil
 * </p>
 *
 * @author ma_qiankun
 * @date Created in 2018-12-11 20:44
 */
@Slf4j
public class RedisUtilTest extends SpringBootDemoRbacSecurityApplicationTests {
    @Autowired
    private RedisUtil redisUtil;

    @Test
    public void findKeysForPage() {
        PageResult pageResult = redisUtil.findKeysForPage(Consts.REDIS_JWT_KEY_PREFIX + Consts.SYMBOL_STAR, 2, 1);
        log.info("【pageResult】= {}", JSONUtil.toJsonStr(pageResult));
    }
}
