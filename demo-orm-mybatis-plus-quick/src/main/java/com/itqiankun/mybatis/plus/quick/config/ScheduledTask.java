package com.itqiankun.mybatis.plus.quick.config;

import cn.hutool.core.io.FileUtil;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.nio.charset.StandardCharsets;

@Component
@Slf4j
public class ScheduledTask {
    @Autowired
    private ResourceLoader resourceLoader;
//    @Scheduled(cron = "* * * * * ?")
    public void cutTaskPush() {
        Resource resource = resourceLoader.getResource("classpath:mapper/OrmRoleMapper.xml");
        try (InputStream inputStream = resource.getInputStream()) {
            byte[] bytes = new byte[1024];

            while (inputStream.read(bytes) !=-1){
                System.out.println(new String(bytes, StandardCharsets.UTF_8));
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}
