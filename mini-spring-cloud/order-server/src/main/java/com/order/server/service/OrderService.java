package com.order.server.service;

import com.order.server.entity.Order;

/**
 * @description:
 * @author: wzh
 * @date: 2023/4/28 22:48
 */
public interface OrderService {

    Order getOrder(Long id);
}
