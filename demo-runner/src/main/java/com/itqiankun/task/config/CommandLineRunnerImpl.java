package com.itqiankun.task.config;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

/**
 * @author: ma_qiankun
 * @date: 2023/8/8
 **/
@Component
public class CommandLineRunnerImpl implements CommandLineRunner {
	@Override
	public void run(String... args)  {
		System.out.println("CommandLineRunner重启服务");
	}
}
