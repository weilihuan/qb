package com.expressage.controller;

import com.expressage.service.ExpFeignService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("exp/feign")
public class ConsumerFeignController {

    @Resource
    private ExpFeignService expFeignService;

}
