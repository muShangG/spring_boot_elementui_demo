package com.example.spring_boot_elementui_demo.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.example.spring_boot_elementui_demo.dao.MenuDao;
import com.example.spring_boot_elementui_demo.entity.SysMenuList;
import com.example.spring_boot_elementui_demo.mapper.SysMenuListDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import sun.security.util.AuthResources_zh_CN;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@RestController
public class MenuController {
    @Autowired
    private SysMenuListDao sysMenuListDao;

    @RequestMapping("/index/data")
    public String getUserMap(){
        sdfsdf a =new sdfsdf();
        a.setTitle("首页");
        a.setHref("page/welcome-1.html?t=1");
        sdfsdf b =new sdfsdf();
        b.setTitle("LAYUI MINI");
        b.setImage("Layui/images/logo.png");




        List<SysMenuList> menu = sysMenuListDao.find_menu(263);
        //大括号

        JSONObject obj=new JSONObject();
        //中
        List<JSONObject> jsonObject = new ArrayList<JSONObject>();
        List<JSONObject> jsonObjects = new ArrayList<JSONObject>();

      /*  for (int i = 0; i <menu.size() ; i++) {
            if (menu.get(i).getMenuParentid()==null ){
                JSONObject objx=new JSONObject();
                objx.put("title",menu.get(i).getMenuName());
                objx.put("href",menu.get(i).getMenuUrl());
                objx.put("icon","");
                objx.put("target","_self");
                int finalI = i;
              *//*  List<SysMenuList> menu_z= menu.stream().allMatch(e->e.getMenuParentid()==menu.get(finalI).getMenuParentid());

                List<JSONObject> jsonObjects_x = new ArrayList<JSONObject>();
                JSONObject objx_xj=new JSONObject();
                for (int j = 0; j <menu_z.size() ; j++) {
                    objx_xj.put("title",menu.get(i).getMenuName());
                    objx_xj.put("href",menu.get(i).getMenuUrl());
                    objx_xj.put("icon","");
                    objx_xj.put("target","_self");

                }*//*
                jsonObjects_x.add(objx_xj);
                objx.put("child",jsonObjects_x);
                jsonObject.add(objx);
            }
        }*/

        obj.put("child",jsonObject);
        jsonObjects.add(obj);

        JSONObject objmenu=new JSONObject();
        objmenu.put("homeInfo",a);
        objmenu.put("logoInfo",b);
        objmenu.put("menuInfo",jsonObjects);
        String string = JSON.toJSONString(objmenu);
        System.out.println(string);
        return string;
    }


}
