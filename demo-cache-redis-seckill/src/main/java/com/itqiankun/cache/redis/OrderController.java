package com.itqiankun.cache.redis;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

/**
 * @author: ma_qiankun
 * @date: 2023/8/9
 **/
@Controller
public class OrderController {

	@Resource
	private OrderService orderService;

	@RequestMapping("/seckill")
	@ResponseBody
	public String secKill(){
		return orderService.secKill();
	}
	@RequestMapping("/secKillLua")
	@ResponseBody
	public String secKillLua(){
		return orderService.secKillLua();
	}
}
