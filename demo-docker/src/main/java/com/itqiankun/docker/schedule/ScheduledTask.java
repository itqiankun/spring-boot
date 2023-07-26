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
    @Scheduled(cron = "* * * * * ?")
    public void cutTaskPush() {
      log.info("线程数:{}", Runtime.getRuntime().availableProcessors());
    }

}
