package com.expressage.service;

import java.util.Map;

public interface OrderService {

    /**
     * 保存信息
     * @param paramMap 单信息
     */
    boolean saveOrder(Map<String,Object> paramMap);
}
