package com.itqiankun.scheduled;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.EnableScheduling;

/**
 * <p>
 * 启动器
 * </p>
 *
 * @author ma_qiankun
 * @date Created in 2018-12-29 10:28
 */
@EnableScheduling
@SpringBootApplication
public class SpringBootDemoAnnotationApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootDemoAnnotationApplication.class, args);
    }

}

