package com.example.spring_boot_elementui_demo.mapper;

import com.example.spring_boot_elementui_demo.entity.SysMenuList;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface SysMenuListDao {
    int deleteByPrimaryKey(Integer menuId);

    int insert(SysMenuList record);

    int insertSelective(SysMenuList record);

    SysMenuList selectByPrimaryKey(Integer menuId);

    int updateByPrimaryKeySelective(SysMenuList record);

    int updateByPrimaryKey(SysMenuList record);

    List<SysMenuList>find_menu(Integer ygid,Integer menu_parentid);
}