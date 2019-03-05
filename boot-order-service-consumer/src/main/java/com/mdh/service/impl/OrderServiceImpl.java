package com.mdh.service.impl;

import bean.UserAddress;
import com.alibaba.dubbo.config.annotation.Reference;
import org.springframework.stereotype.Service;
import service.OrderService;
import service.UserService;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

import java.util.List;

/**
 * 1、将服务提供者注册到注册中心（暴露服务）
 * 		1）、导入dubbo依赖（2.6.2）\操作zookeeper的客户端(curator)
 * 		2）、配置服务提供者
 *
 * 2、让服务消费者去注册中心订阅服务提供者的服务地址
 * @Author: madonghao
 * @Date: 2019/3/4 19:24
 */
@Service
public class OrderServiceImpl implements OrderService {

    //@Reference(loadbalance="random",timeout=1000) //dubbo直连
    @Reference
    UserService userService;

    @HystrixCommand(fallbackMethod="hello")
    @Override
    public List<UserAddress> initOrder(String userId) {
        System.out.println("用户id:" + userId);
        List<UserAddress> list = userService.getUserAddressList(userId);
        return list;
    }

    public String hello(){
        return "";
    }
}
