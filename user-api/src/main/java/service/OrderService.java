package service;

import bean.UserAddress;

import java.util.List;

/**
 * @Author: madonghao
 * @Date: 2019/3/4 17:11
 */
public interface OrderService {

    /**
     * 初始化订单
     * @param userId
     */
    public List<UserAddress> initOrder(String userId);
}
