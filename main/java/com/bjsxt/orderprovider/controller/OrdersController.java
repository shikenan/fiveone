package com.bjsxt.orderprovider.controller;

import com.bjsxt.orderprovider.pojo.Order;
import com.bjsxt.orderprovider.pojo.Orders;
import com.bjsxt.orderprovider.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;

@RestController
public class OrdersController {
    @Autowired
    private OrderService orderService;

    @GetMapping("/test")
    public String test(@RequestParam int[] a){
        String s ="0";
        for(int b: a){
            s=s+b;
        }
        return s ;
    }

    @PostMapping("/vip")
    public String add(){
        try {
            Thread.sleep(50000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return "hello";
    }

    @PostMapping("/t/he")
    public String say(){
        return "say \"hello\"";
    }



}
