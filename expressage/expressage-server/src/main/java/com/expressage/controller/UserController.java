package com.expressage.controller;

import com.expressage.entity.User;
import com.expressage.service.UserService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("/user")
public class UserController {

    @Resource
    private UserService userService;

    /**
     * 查询用户信息
     *
     * @param userId 用ID
     * @return
     */
    @RequestMapping("/queryById")
    public User queryById(@RequestParam String userId) {
        return userService.queryById(userId);
    }
}
