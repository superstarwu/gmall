package com.yitong.gmall.manager.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ManagerController {

    @RequestMapping("/index")
    public String toIndexPage(){

        return "index";
    }

    @RequestMapping("/attribute")
    public String toAttrPage(){

        return "attribute";
    }
}
