package com.yitong.gmall.service;


import com.yitong.gmall.bean.UserAddress;
import com.yitong.gmall.bean.UserInfo;

import java.util.List;

public interface UserService {
    /**
     * 查询所有的用户列表
     */
    List<UserInfo> getUserList();

    /**
     * 根据用户id查询用户
     */
    UserInfo getUserInfoById(String id);

    /**
     * 保存用户
     */
    Integer saveUserInfo(UserInfo userInfo);

    /**
     * 根据用户id删除用户
     */
    Integer removeUserInfoById(String id);

    /**
     * 修改用户
     */
    Integer updateUserInfoById(UserInfo userInfo);

    /**
     * 查询用户所有的收货地址信息
     */
    List<UserAddress> getUserAddressByUserId(String userId);

    /**
     * 新增用户收货地址信息
     */
    Integer saveUserAddress(UserAddress userAddress);

    /**
     * 删除收货地址
     */
    Integer removeUserAddressById(String id);

    /**
     * 修改收货地址
     */
    Integer updateUserAddressById(UserAddress userAddress);
}
