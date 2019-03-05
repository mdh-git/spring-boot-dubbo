package com.mdh.controller;

import bean.UserAddress;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import service.OrderService;

import java.util.List;

/**
 * @Author: madonghao
 * @Date: 2019/3/4 19:26
 */
@RestController
public class OrderController {

    @Autowired
    OrderService orderService;

    @RequestMapping("/initOrder")
    public List<UserAddress> order(@RequestParam("uid") String userId){
        List<UserAddress> list = orderService.initOrder(userId);
        return list;
    }
}
