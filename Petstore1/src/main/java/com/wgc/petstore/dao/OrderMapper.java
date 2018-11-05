package com.wgc.petstore.dao;

import com.wgc.petstore.entity.Order;
import java.util.List;

public interface OrderMapper {
    int deleteByPrimaryKey(Integer orderId);

    int insert(Order record);

    Order selectByPrimaryKey(Integer orderId);

    List<Order> selectAll();

    int updateByPrimaryKey(Order record);

    Order selectByNumber(String number);
}