package com.expressage.service;

import com.expressage.entity.User;
import org.apache.ibatis.annotations.Param;

public interface UserService {

    /**
     * 查询用户信息
     * @param userId 用ID
     * @return
     */
    User queryById(String userId);
}
