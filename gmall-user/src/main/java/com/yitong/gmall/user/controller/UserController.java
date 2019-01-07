package com.yitong.gmall.user.controller;

import com.yitong.gmall.user.bean.UserInfo;
import com.yitong.gmall.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("/userList")
    @ResponseBody
    public List<UserInfo> userList(){

        return userService.getUserList();
    }
}
