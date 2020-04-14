package com.example.spring_boot_elementui_demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.HashMap;
import java.util.Map;

@Controller

public class IndexController {
    @GetMapping("/")
    public String Index() {
        return "Index";
    }

    @GetMapping("/page/{page}")
    public String page(@PathVariable(name = "page") String page) {
        System.out.println(page.split(".html")[0]);
        Map<String, String> map = new HashMap<String, String>();
        map.put("msg", "10");
        map.put("data", "20");


        return "page/" + page.split(".html")[0];
    }




}
