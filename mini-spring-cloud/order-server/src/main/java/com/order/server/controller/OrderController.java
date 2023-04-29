package com.order.server.controller;

import com.alibaba.fastjson2.JSONObject;
import com.order.server.entity.Order;
import com.order.server.service.OrderService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @description: orderController
 * @author: wzh
 * @date: 2023/4/29 09:14
 */
@RestController
@RequiredArgsConstructor
@RequestMapping("/api/order/")
public class OrderController {

    private final OrderService orderService;

    @RequestMapping(value = "getOrder/{id}", method = RequestMethod.GET, name = "查询订单信息")
    Order getOrder(@PathVariable("id") Long id) {
        return orderService.getOrder(id);
    }

    @RequestMapping("/blocked")
    JSONObject blocked() {
        JSONObject object = new JSONObject();
        object.put("code", 403);
        object.put("success", false);
        object.put("massage", "您的请求频率过快，请稍后再试！");
        return object;
    }

}
