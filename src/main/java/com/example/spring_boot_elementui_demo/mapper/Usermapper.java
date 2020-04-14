package com.example.spring_boot_elementui_demo.mapper;

import com.example.spring_boot_elementui_demo.entity.TblUsersInfo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;
@Mapper
public interface Usermapper {
    @Select("select *from tbl_users_info")
    List<TblUsersInfo> findall();

}
