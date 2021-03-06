package com.yitong.gmall.user.service;

import com.yitong.gmall.bean.UserAddress;
import com.yitong.gmall.bean.UserInfo;
import com.yitong.gmall.service.UserService;
import com.yitong.gmall.user.mapper.UserAddressMapper;
import com.yitong.gmall.user.mapper.UserInfoMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional(rollbackFor = Exception.class)
public class UserServiceImpl implements UserService {

    @Autowired
    private UserInfoMapper userInfoMapper;

    @Autowired
    private UserAddressMapper userAddressMapper;

    @Override
    public Integer saveUserInfo(UserInfo userInfo) {
        return userInfoMapper.insert(userInfo);
    }

    @Override
    public Integer removeUserInfoById(String id) {
        return userInfoMapper.deleteByPrimaryKey(id);
    }

    @Override
    public Integer updateUserInfoById(UserInfo userInfo) {
        return userInfoMapper.updateByPrimaryKey(userInfo);
    }

    @Override
    public List<UserInfo> getUserList() {
        return userInfoMapper.selectAll();
    }

    @Override
    public UserInfo getUserInfoById(String id) {
        return userInfoMapper.selectByPrimaryKey(id);
    }

    @Override
    public List<UserAddress> getUserAddressByUserId(String userId) {
        return userAddressMapper.selectByExample(userId);
    }

    @Override
    public Integer saveUserAddress(UserAddress userAddress) {
        return userAddressMapper.insert(userAddress);
    }

    @Override
    public Integer removeUserAddressById(String id) {
        return userAddressMapper.deleteByPrimaryKey(id);
    }

    @Override
    public Integer updateUserAddressById(UserAddress userAddress) {
        return userAddressMapper.updateByPrimaryKey(userAddress);
    }
}
