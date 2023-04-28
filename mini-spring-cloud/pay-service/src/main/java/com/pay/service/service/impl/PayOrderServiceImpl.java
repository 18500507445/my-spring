package com.pay.service.service.impl;

import com.pay.service.entity.PayOrder;
import com.pay.service.service.PayOrderService;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;

/**
 * @description:
 * @author: wzh
 * @date: 2023/4/28 22:51
 */
@Service
public class PayOrderServiceImpl implements PayOrderService {

    @Override
    public PayOrder getPayOrder(Long orderId) {
        return new PayOrder().setOrderId(String.valueOf(orderId)).setPayWay(1).setPayConfigId(1L).setFee(BigDecimal.TEN).setBusinessCode(0).setUserName(String.valueOf(orderId));
    }
}
