package com.example.spring_boot_elementui_demo.entity;

import java.io.Serializable;
import lombok.Data;

/**
 * sys_menu_list
 * @author 
 */
@Data
public class SysMenuList implements Serializable {
    private Integer menuId;

    private String menuName;

    private String menuUrl;

    private Integer menuParentid;

    private Integer menuOrder;

    private Integer moduleId;

    private Integer menuLevel;

    private Boolean menuStatus;

    private String menuIco;

    private static final long serialVersionUID = 1L;


}