package com.example.spring_boot_elementui_demo.controller;

import com.alibaba.fastjson.JSON;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class MenuController {
    @RequestMapping("/index/data")
    public String getUserMap(){
        sdfsdf a =new sdfsdf();
        a.setTitle("首页");
        a.setHref("page/welcome-1.html?t=1");
        sdfsdf b =new sdfsdf();
        b.setTitle("LAYUI MINI");
        b.setImage("Layui/images/logo.png");
        Map<String,sdfsdf> map = new HashMap<>();
        map.put("homeInfo",a);
        map.put("logoInfo",b);
        String string = JSON.toJSONString(map);
        System.out.println(string);
        return string;
    }
}
