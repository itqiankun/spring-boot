package com.itqiankun.classloader;

import com.itqiankun.classloader.utils.ClassLoaderUtils;
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
 * @date Created in 2018-12-29 10:28
 */
@EnableScheduling
@SpringBootApplication
public class SpringBootDemoClassLoaderApplication {

    public static void main(String[] args) {
      System.out.println("========= ClassLoader Tree=============");
      System.out.println(ClassLoaderUtils.tree());

      System.out.println("========= Spring Boot Application ClassLoader Urls =============");
      System.out.println(ClassLoaderUtils.urls((URLClassLoader) SpringBootDemoClassLoaderApplication.class.getClassLoader()));

      System.out.println("========= System ClassLoader Urls =============");
      System.out.println(ClassLoaderUtils.urls((URLClassLoader) ClassLoader.getSystemClassLoader()));


      SpringApplication.run(SpringBootDemoClassLoaderApplication.class, args);
    }

}

