package com.bjsxt.orderprovider.service.impl;

import com.bjsxt.orderprovider.pojo.Orders;
import com.bjsxt.orderprovider.service.OrderService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class OrdersServiceIml implements OrderService {
    @Override
    public Orders ordersService(Integer id) {
        Orders orders = new Orders();
        orders.setId(1);
        orders.setRemark("中午配送");
        orders.setTotal(20);
        return orders;
    }

    @Override
    public List<Orders> ordersList() {
        List<Orders> list = new ArrayList<>();
        Orders orders = new Orders();
        orders.setId(2);
        orders.setRemark("晚餐配送");
        orders.setTotal(30);
        list.add(orders);
        return list;
    }
}
