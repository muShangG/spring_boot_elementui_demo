package com.example.spring_boot_elementui_demo.entity;

import lombok.Data;

import java.io.Serializable;

/**
 * (TblUserInfo)实体类
 *
 * @author makejava
 * @since 2020-03-07 16:36:19
 */
@Data
public class TblUserInfo implements Serializable {
    private static final long serialVersionUID = -60364162757428704L;
    
    private Integer id;
    
    private String name;
    
    private String pwd;
    
    private String gender;
    
    private String addres;
    
    private Integer sex;



}