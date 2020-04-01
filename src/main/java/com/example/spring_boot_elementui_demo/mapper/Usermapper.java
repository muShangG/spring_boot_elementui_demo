package com.example.spring_boot_elementui_demo.mapper;

import com.example.spring_boot_elementui_demo.entity.TblUserInfo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;
@Mapper
public interface Usermapper {
    @Select("select *from tbl_user_info")
    List<TblUserInfo> findall();

}
