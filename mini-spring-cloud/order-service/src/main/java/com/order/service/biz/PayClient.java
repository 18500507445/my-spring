package com.order.service.biz;

import com.pay.service.entity.PayOrder;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @description:
 * @author: wzh
 * @date: 2023/4/29 09:54
 */
@FeignClient("payService")
public interface PayClient {

    @RequestMapping("/api/getPayOrder/{id}")
    PayOrder getPayOrder(@PathVariable("id") Long id);
}
