package com.itqiankun;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

/**
 * <p>
 * 启动器
 * </p>
 *
 * @author ma_qiankun
 * @date Created in 2018-11-08 16:48
 */
@SpringBootApplication
@MapperScan("com.itqiankun")
@EnableScheduling
public class SpringBootDemoMybatisPlusQuickApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootDemoMybatisPlusQuickApplication.class, args);
    }
}
