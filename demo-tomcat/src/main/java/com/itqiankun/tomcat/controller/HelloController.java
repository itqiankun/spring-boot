package com.itqiankun.tomcat.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
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
@Slf4j
public class HelloController {
    @GetMapping("/hello")
    public String hello() {
      try {
        TimeUnit.SECONDS.sleep(10);
      } catch (InterruptedException e) {
        throw new RuntimeException(e);
      }
      log.info("打印日志");
      return "tomcat ";
    }
}
