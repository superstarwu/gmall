package com.yitong.gmall.manager.controller;

import com.yitong.gmall.bean.BaseCatalog1;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

@Controller
public class AttributeController {

    @RequestMapping("/getCatalog1")
    @ResponseBody
    public List<BaseCatalog1> getBaseCatalog1List(){

        List<BaseCatalog1> list = new ArrayList<>();
        list.add(new BaseCatalog1("1","手机"));
        list.add(new BaseCatalog1("2","电脑"));
        list.add(new BaseCatalog1("3","笔记本"));

        return list;
    }

    @RequestMapping("/getCatalog2")
    @ResponseBody
    public List<BaseCatalog1> getBaseCatalog2List(String catalog1Id){


        return null;
    }

}
