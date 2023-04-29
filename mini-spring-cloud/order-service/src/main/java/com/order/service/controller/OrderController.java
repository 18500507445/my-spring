package com.order.service.controller;

import com.order.service.entity.Order;
import com.order.service.service.OrderService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @description: orderController
 * @author: wzh
 * @date: 2023/4/29 09:14
 */
@RestController
@RequiredArgsConstructor
@RequestMapping("/api/")
public class OrderController {

    private final OrderService orderService;

    @RequestMapping("getOrder/{id}")
    Order getOrder(@PathVariable("id") Long id) {
        return orderService.getOrder(id);
    }

}
