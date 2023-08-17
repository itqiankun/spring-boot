package com.itqiankun.interceptor.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
    @GetMapping("/itqk")
    public String hello() {
        return "welcome itqiankun.com";
    }
}
