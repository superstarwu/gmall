package com.yitong.gmall.user.service.impl;

import com.yitong.gmall.user.bean.UserInfo;
import com.yitong.gmall.user.mapper.UserInfoMapper;
import com.yitong.gmall.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserInfoMapper userInfoMapper;

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
}
