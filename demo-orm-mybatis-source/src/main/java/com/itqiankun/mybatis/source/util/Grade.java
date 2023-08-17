package com.itqiankun.mybatis.source.util;

import lombok.Setter;

/**
 * @author: ma_qiankun
 * @date: 2023/8/15
 **/
@Setter
public class Grade {
	private String subject;
	private double score;

	public Grade(String subject, double score) {
		this.subject = subject;
		this.score = score;
	}
}
