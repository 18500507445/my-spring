package com.pay.service.service;

import com.pay.service.entity.PayOrder;

/**
 * @description:
 * @author: wzh
 * @date: 2023/4/28 22:51
 */
public interface PayOrderService {

    PayOrder getPayOrder(Long orderId);
}
