package com.expressage.controller;

import com.expressage.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("exp/consumer")//通过模板去获取提供者的服务
public class ComsumerController {
    @Autowired
    private RestTemplate restTemplate; //提供一些便利的方法直接访问http请求
    private String url_prefix="http://provider-exp";//"http://localhost:8001";

    @RequestMapping("/queryById")
    public Object queryById(@RequestParam String userId) {
        String uri = url_prefix + "/user/queryById?userId=" + userId ;
        return restTemplate.getForObject(uri, User.class);
    }
}
