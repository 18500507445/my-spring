package com.order.service.service.imple;

import com.order.service.entity.Order;
import com.order.service.service.OrderService;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;

/**
 * @description:
 * @author: wzh
 * @date: 2023/4/28 22:49
 */
@Service
public class OrderServiceImpl implements OrderService {

    @Override
    public Order getOrder(Long id) {
        return new Order().setId(id).setGoodsId(id).setPrice(BigDecimal.valueOf(10)).setPayStatus(0).setUserId(id);
    }
}
