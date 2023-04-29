package com.pay.server.controller;

import com.pay.server.entity.PayOrder;
import com.pay.server.service.PayOrderService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @description: payOrderController
 * @author: wzh
 * @date: 2023/4/29 09:17
 */
@RestController
@RequiredArgsConstructor
@RequestMapping("/api/pay/")
public class PayOrderController {

    private final PayOrderService payOrderService;

    @RequestMapping("getPayOrder/{id}")
    PayOrder getPayOrder(@PathVariable("id") Long id) {
        return payOrderService.getPayOrder(id);
    }
}
