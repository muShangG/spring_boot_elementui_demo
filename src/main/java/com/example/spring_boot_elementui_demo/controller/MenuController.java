package com.example.spring_boot_elementui_demo.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.example.spring_boot_elementui_demo.entity.SysMenuList;
import com.example.spring_boot_elementui_demo.mapper.SysMenuListDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

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
        b.setHref("/");
        b.setImage("Layui/images/logo.png");




        List<SysMenuList> menu = sysMenuListDao.find_menu(263,null );

        //大括号

        JSONObject obj=new JSONObject();
        //中
        List<JSONObject> jsonObject = new ArrayList<JSONObject>();
        List<JSONObject> jsonObjects = new ArrayList<JSONObject>();

      
        for (int i = 0; i <menu.size() ; i++) {
            if (menu.get(i).getMenuParentid()==null ){
                JSONObject objx=new JSONObject();
                objx.put("title",menu.get(i).getMenuName());
                objx.put("href",menu.get(i).getMenuUrl());
                objx.put("icon","");
                objx.put("target","_self");
               List<SysMenuList> menu_z = sysMenuListDao.find_menu(263,menu.get(i).getMenuId());
                if (menu_z.size()>0){
                    List<JSONObject> jsonObjects_x = new ArrayList<JSONObject>();
                    for (SysMenuList sysMenuList : menu_z) {
                        JSONObject objx_xj=new JSONObject();
                        objx_xj.put("title",sysMenuList.getMenuName());
                        objx_xj.put("href",sysMenuList.getMenuUrl());
                        objx_xj.put("icon","");
                        objx_xj.put("target","_self");
                        jsonObjects_x.add(objx_xj);
                    }
                    objx.put("child",jsonObjects_x);
                }
                jsonObject.add(objx);
            }
        }

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
