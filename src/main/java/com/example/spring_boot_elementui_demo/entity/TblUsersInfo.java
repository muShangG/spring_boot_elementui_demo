package com.example.spring_boot_elementui_demo.entity;

import java.io.Serializable;
import java.util.Date;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

/**
 * tbl_users_info
 * @author
 */
@Data
public class TblUsersInfo implements Serializable {
    private String yggh;

    private Integer ygid;

    private String ygxm;

    private Integer ksid;

    private String pwd;

    private Integer roleId;

    private String photourl;
    @JSONField(format="yyyy-MM-dd")//数据库导出页面时json格式化
    private Date pwdupdatetime;

    private Integer ygzt;

    private static final long serialVersionUID = 1L;

    public TblUsersInfo() {
    }
}