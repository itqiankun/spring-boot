package com.itqiankun.rbac.shiro.controller;

import com.itqiankun.rbac.shiro.common.R;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 * 测试Controller
 * </p>
 *
 * @author ma_qiankun
 * @date Created in 2019-03-21 16:13
 */
@RestController
@RequestMapping("/test")
public class TestController {

    @GetMapping("")
    public R test() {
        return R.success();
    }
}
