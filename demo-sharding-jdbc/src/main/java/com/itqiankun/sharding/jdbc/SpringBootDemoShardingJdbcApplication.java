package com.itqiankun.sharding.jdbc;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * <p>
 * 启动器
 * </p>
 *
 * @author ma_qiankun
 * @date Created in 2019-01-23 22:05
 */
@SpringBootApplication
@EnableTransactionManagement(proxyTargetClass = true)
@MapperScan("com.itqiankun.sharding.jdbc.mapper")
public class SpringBootDemoShardingJdbcApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootDemoShardingJdbcApplication.class, args);
    }

}

