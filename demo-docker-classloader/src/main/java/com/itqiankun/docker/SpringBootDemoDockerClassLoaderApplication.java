package com.itqiankun.docker;

import com.itqiankun.docker.utils.ClassLoaderUtils;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

import java.net.URLClassLoader;

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
@Slf4j
public class SpringBootDemoDockerClassLoaderApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootDemoDockerClassLoaderApplication.class, args);
    }
}
