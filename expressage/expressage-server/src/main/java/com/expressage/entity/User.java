package com.expressage.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import lombok.experimental.Accessors;

import java.util.Date;

/**
 *  用户信息表
 */
@Data
@ToString
@Accessors(chain = true)  //链式写法
@NoArgsConstructor
@AllArgsConstructor
public class User {
    private String userId;
    private String userName;
    private String password;
    private String address;
    private String phone;
    private String landlinePhone;
    private Date createTime;
    private Date updateTime;
    private String status;
}
