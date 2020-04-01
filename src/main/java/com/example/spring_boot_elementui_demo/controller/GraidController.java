package com.example.spring_boot_elementui_demo.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.example.spring_boot_elementui_demo.entity.TblUserInfo;
import com.example.spring_boot_elementui_demo.mapper.Usermapper;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class GraidController {
    @Autowired
    private Usermapper usermapper;
    @RequestMapping("/index/grid")
    public String findall(@RequestParam(name = "page")Integer page,
                          @RequestParam(name = "limit")Integer limit){

        PageHelper.startPage(page, limit);
        List<TblUserInfo> userInfos=usermapper.findall();
        PageInfo pageInfo = new PageInfo(userInfos);
        JSONObject object=new JSONObject();
        object.put("code",0);
        object.put("count",pageInfo.getTotal());
        object.put("data",pageInfo.getList());
        System.out.println(object.toJSONString());
        return object.toJSONString();
    }

}
