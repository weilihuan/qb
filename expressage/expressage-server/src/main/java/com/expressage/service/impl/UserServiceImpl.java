package com.expressage.service.impl;

import com.expressage.dao.UserDAO;
import com.expressage.entity.User;
import com.expressage.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class UserServiceImpl implements UserService {

    @Resource
    private UserDAO userDAO;

    @Override
    public User queryById(String userId) {
        return userDAO.queryById(userId);
    }
}
