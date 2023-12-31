package com.itqiankun.pay;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 * 启动类
 * </p>
 *
 * @author ma_qiankun
 * @date Created in 2020-10-26 11:12
 */
@SpringBootApplication
@RestController
public class SpringBootDemoPayApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootDemoPayApplication.class, args);
    }

}
