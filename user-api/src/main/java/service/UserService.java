package service;

import bean.UserAddress;

import java.util.List;

/**
 * @Author: madonghao
 * @Date: 2019/3/4 19:04
 */
public interface UserService {

    /**
     * 按照用户id返回所有的收货地址
     * @param userId
     * @return
     */
    public List<UserAddress> getUserAddressList(String userId);
}
