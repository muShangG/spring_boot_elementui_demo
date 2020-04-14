package com.example.spring_boot_elementui_demo.mapper;

import com.example.spring_boot_elementui_demo.entity.TblUsersInfo;

import java.util.List;


public interface TblUsersInfoDao {
    int deleteByPrimaryKey(String yggh);

    int insert(TblUsersInfo record);

    int insertSelective(TblUsersInfo record);

    TblUsersInfo selectByPrimaryKey();

    int updateByPrimaryKeySelective(TblUsersInfo record);

    int updateByPrimaryKey(TblUsersInfo record);

    List<TblUsersInfo> Find_ALL();

}