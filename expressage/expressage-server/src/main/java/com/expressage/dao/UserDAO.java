package com.expressage.dao;

import com.expressage.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface UserDAO {

    /**
     * 查询用户信息
     * @param userId 用ID
     * @return
     */
    User queryById(@Param("userId") String userId);
}
