package com.itqiankun.interceptor.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;


@Configuration
public class WebConfig implements WebMvcConfigurer {


    @Autowired
    private SimpleInterceptor screenAuthInterceptor;

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(screenAuthInterceptor).addPathPatterns("/**")
                // swagger页面
                .excludePathPatterns("/doc.html")
                .excludePathPatterns("/swagger-resources/**")
                .excludePathPatterns("/v2/api-docs")
                .excludePathPatterns("/v2/api-docs-ext")
                // swagger 静态资源
                .excludePathPatterns("/webjars/**")
        ;
    }



}
