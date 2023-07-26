package com.itqiankun.docker.controller;

import com.alibaba.fastjson.JSONObject;
import com.itqiankun.docker.SpringBootDemoDockerClassLoaderApplication;
import com.itqiankun.docker.utils.ClassLoaderUtils;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.net.URLClassLoader;
import java.util.Objects;

/**
 * <p>
 * Hello Controller
 * </p>
 *
 * @author ma_qiankun
 * @date Created in 2018-11-29 14:58
 */
@RestController
@RequestMapping
@Slf4j
public class HelloController {
    @GetMapping("/")
    public String hello() {
        JSONObject jsonObject = new JSONObject();
        ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
        jsonObject.put("classLoader", classLoader.toString());
        jsonObject.put("classLoaderUrl", ClassLoaderUtils.urls((URLClassLoader)classLoader));

        jsonObject.put("classLoaderParent", classLoader.getParent().toString());
        jsonObject.put("classLoaderParentUrl", ClassLoaderUtils.urls((URLClassLoader) classLoader.getParent()));

        jsonObject.put("classLoaderParentParent", classLoader.getParent().getParent().toString());
        jsonObject.put("classLoaderParentParentUrl", ClassLoaderUtils.urls((URLClassLoader)classLoader.getParent().getParent()));
        if(Objects.isNull(classLoader.getParent().getParent().getParent())){
            log.info("对象为空");
        }else {
            jsonObject.put("classLoaderParentParentParent", classLoader.getParent().getParent().getParent().toString());
            jsonObject.put("classLoaderParentParentParentUrl", ClassLoaderUtils.urls((URLClassLoader)classLoader.getParent().getParent().getParent()));
        }

        return jsonObject.toJSONString() ;
    }
}
