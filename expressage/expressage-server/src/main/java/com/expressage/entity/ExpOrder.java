package com.expressage.entity;

import lombok.Data;

import java.util.Date;

@Data
public class ExpOrder {
    private String orderId;
    private String createrUserId;
    private String orderStatus;
    private String accepterUserId;
    private Date createrTime;
    private Date updateTime;
}
