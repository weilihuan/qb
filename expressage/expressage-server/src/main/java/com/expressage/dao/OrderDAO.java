package com.expressage.dao;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.Map;
@Mapper
@Repository
public interface OrderDAO {

    /**
     * 保存信息
     * @param paramMap 单信息
     */
    boolean saveOrder(Map<String,Object> paramMap);
}
