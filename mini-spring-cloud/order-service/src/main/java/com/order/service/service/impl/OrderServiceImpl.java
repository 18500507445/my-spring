package com.order.service.service.impl;

import com.alibaba.fastjson2.JSONObject;
import com.order.service.biz.PayClient;
import com.order.service.entity.Order;
import com.order.service.service.OrderService;
import com.pay.service.entity.PayOrder;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.math.BigDecimal;

/**
 * @description:
 * @author: wzh
 * @date: 2023/4/28 22:49
 */
@Slf4j(topic = "OrderServiceImpl")
@RequiredArgsConstructor
@Service
public class OrderServiceImpl implements OrderService {

    @Resource
    private PayClient payClient;

    @Override
    public Order getOrder(Long id) {
        final PayOrder payOrder = payClient.getPayOrder(id);
        log.info("payClient:{}", JSONObject.toJSONString(payOrder));
        return new Order().setId(id).setGoodsId(id).setPrice(BigDecimal.valueOf(10)).setPayStatus(0).setUserId(id);
    }
}
