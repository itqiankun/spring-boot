package com.itqiankun.docker.schedule;

import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.net.URL;
import java.util.Enumeration;

@Component
@Slf4j
public class ScheduledTask {
//    @Scheduled(cron = "* * * * * ?")
    public void classLoader() throws IOException {
      ClassLoader classLoader = Thread.currentThread().getContextClassLoader();

      URL resource = classLoader.getResource("logback-test.xml");
      log.info("logback-test.xml查询结果:{}", resource);
      URL classLoaderResource = classLoader.getResource("classloader-resource.xml");
      log.info("classloader-resource.xml查询结果:{}", classLoaderResource);
    }

}
