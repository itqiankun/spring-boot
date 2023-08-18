package com.itqiankun.resttemplate.config;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.TimeUnit;

/**
 * <p>
 * Hello Controller
 * </p>
 *
 * @author ma_qiankun
 * @date Created in 2018-11-29 14:58
 */
@RestController
@RequestMapping
public class HelloController {
    @PostMapping("/hello")
    public String hello() throws InterruptedException {
        TimeUnit.SECONDS.sleep(10);
        return "Hello,From Docker!";
    }
}
