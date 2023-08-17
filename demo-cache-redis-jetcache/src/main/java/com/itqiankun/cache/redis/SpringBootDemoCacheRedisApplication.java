package com.itqiankun.cache.redis;

import com.alicp.jetcache.anno.config.EnableCreateCacheAnnotation;
import com.alicp.jetcache.anno.config.EnableMethodCache;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@EnableCreateCacheAnnotation
@EnableMethodCache(basePackages = "com.itqiankun")
public class SpringBootDemoCacheRedisApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootDemoCacheRedisApplication.class, args);
    }
}
