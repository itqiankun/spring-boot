package com.itqiankun.resttemplate;

import com.alibaba.fastjson.JSONObject;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.http.client.HttpComponentsClientHttpRequestFactory;
import org.springframework.http.client.SimpleClientHttpRequestFactory;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.web.client.RestTemplate;

@RunWith(SpringRunner.class)
@SpringBootTest
public class RestTemplateTest {

    @Test
    public void it_qk_resttemplate_connect_time_out() {
        HttpHeaders httpHeaders = new HttpHeaders();
        httpHeaders.setContentType(MediaType.APPLICATION_JSON);
        SimpleClientHttpRequestFactory httpRequestFactory = new SimpleClientHttpRequestFactory();
        httpRequestFactory.setConnectTimeout(5 * 1000);
        httpRequestFactory.setReadTimeout(5 * 1000);

        JSONObject jsonObject = new JSONObject();
        jsonObject.put("hello", "world");
        // HttpEntity里面的String和restTemplate最后一个参数String.class没有关系的，HttpEntity的String表示http请求请求参数的类型，然后下面的String表示使用什么类型类接受返回的参数
        HttpEntity<String> stringHttpEntity = new HttpEntity<>(jsonObject.toString(), httpHeaders);

        RestTemplate restTemplate = new RestTemplate();
        restTemplate.setRequestFactory(httpRequestFactory);
        ResponseEntity<String> responseEntity = restTemplate.postForEntity("http://127.0.0.1:9999/hello", stringHttpEntity, String.class);
        String body = responseEntity.getBody();
    }

}
