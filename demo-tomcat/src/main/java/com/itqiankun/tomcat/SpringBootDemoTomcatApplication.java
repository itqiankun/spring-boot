package com.itqiankun.tomcat;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

/**
 * <p>
 * 启动器
 * </p>
 *
 * @author ma_qiankun
 * @date Created in 2018-11-29 14:59
 */
@EnableScheduling
@SpringBootApplication
public class SpringBootDemoTomcatApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootDemoTomcatApplication.class, args);
    }
}
