package com.bjsxt.orderprovider.service;

import com.bjsxt.orderprovider.pojo.Orders;

import java.util.List;

public interface OrderService {

    Orders ordersService(Integer id);
    List<Orders> ordersList();

}
