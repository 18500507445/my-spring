package com.order.server.client;

import com.pay.server.entity.PayOrder;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @description:
 * @author: wzh
 * @date: 2023/4/29 09:54
 */
@FeignClient("payServer")
public interface PayClient {

    @RequestMapping("/api/pay/getPayOrder/{id}")
    PayOrder getPayOrder(@PathVariable("id") Long id);
}
