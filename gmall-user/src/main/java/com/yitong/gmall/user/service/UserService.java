package com.yitong.gmall.user.service;

import com.yitong.gmall.user.bean.UserInfo;

import java.util.List;

public interface UserService {

    List<UserInfo> getUserList();

    UserInfo getUserInfoById(String id);

    Integer saveUserInfo(UserInfo userInfo);

    Integer removeUserInfoById(String id);

    Integer updateUserInfoById(UserInfo userInfo);





}
