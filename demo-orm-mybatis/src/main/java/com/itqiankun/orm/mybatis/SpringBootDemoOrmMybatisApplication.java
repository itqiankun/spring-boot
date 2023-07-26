package com.itqiankun.orm.mybatis;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * <p>
 * 启动类
 * </p>
 *
 * @author ma_qiankun
 * @date Created in 2018-11-08 10:52
 */
@MapperScan(basePackages = {"com.itqiankun.orm.mybatis.mapper"})
@SpringBootApplication
public class SpringBootDemoOrmMybatisApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootDemoOrmMybatisApplication.class, args);
    }
}
