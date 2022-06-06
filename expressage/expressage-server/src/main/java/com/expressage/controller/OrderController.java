package com.expressage.controller;

import com.expressage.service.OrderService;
import com.expressage.utils.ResultBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.Map;

@RestController
@RequestMapping("/order")
public class OrderController {

    @Resource
    private OrderService expOrderService;

    @RequestMapping("/save")
    public ResultBody save(@RequestParam Map<String,Object> paramMap){
        expOrderService.saveOrder(paramMap);
        return ResultBody.success();
    }
}
