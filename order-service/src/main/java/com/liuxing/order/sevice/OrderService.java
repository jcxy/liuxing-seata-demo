package com.liuxing.order.sevice;


import com.liuxing.order.entity.Order;

public interface OrderService {

    /**
     * 创建订单
     */
    Long create(Order order);
}