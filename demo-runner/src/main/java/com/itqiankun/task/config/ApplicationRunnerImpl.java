package com.itqiankun.task.config;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

/**
 * @author: ma_qiankun
 * @date: 2023/8/8
 **/
@Component
public class ApplicationRunnerImpl implements ApplicationRunner {
	@Override
	public void run(ApplicationArguments args) {
		System.out.println("ApplicationRunner启动重启服务");
	}
}
