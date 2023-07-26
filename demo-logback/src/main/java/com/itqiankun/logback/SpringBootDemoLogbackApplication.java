package com.itqiankun.logback;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.scheduling.annotation.EnableScheduling;

/**
 * <p>
 * 启动类
 * </p>
 *
 * @author ma_qiankun
 * @date Created in 2018-09-30 23:16
 */
@SpringBootApplication
@EnableScheduling
public class SpringBootDemoLogbackApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootDemoLogbackApplication.class, args);
    }
}
