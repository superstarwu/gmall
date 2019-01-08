package com.yitong.gmall.user.controller;

import com.yitong.gmall.bean.UserInfo;
import com.yitong.gmall.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import java.util.List;

@Controller
public class UserController {

    @Autowired
    private UserService userService;

    /*@RequestMapping("/index")
    public String userList(){

        List<UserInfo> userList = userService.getUserList();
        return "index";
    }*/
    @RequestMapping("/userlist")
    @ResponseBody
    public List<UserInfo> userList(){

        List<UserInfo> userList = userService.getUserList();
        return userList;
    }
}
