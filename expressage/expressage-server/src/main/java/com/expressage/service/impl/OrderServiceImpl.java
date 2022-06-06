package com.expressage.service.impl;

import com.expressage.dao.OrderDAO;
import com.expressage.service.OrderService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Date;
import java.util.Map;

@Service
public class OrderServiceImpl implements OrderService {

    @Resource
    private OrderDAO expOrderDAO;

    @Override
    public boolean saveOrder(Map<String, Object> paramMap) {
        paramMap.put("createrTime", new Date());
        paramMap.put("orderStatus", "1");
        return expOrderDAO.saveOrder(paramMap);
    }
}
