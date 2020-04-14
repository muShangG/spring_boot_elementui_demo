package com.example.spring_boot_elementui_demo.entity;

import java.io.Serializable;

/**
 * (City)实体类
 *
 * @author makejava
 * @since 2020-04-13 17:44:26
 */
public class City implements Serializable {
    private static final long serialVersionUID = 538354058670302586L;
    
    private String cityId;
    
    private String cityName;
    
    private Integer regionId;


    public String getCityId() {
        return cityId;
    }

    public void setCityId(String cityId) {
        this.cityId = cityId;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public Integer getRegionId() {
        return regionId;
    }

    public void setRegionId(Integer regionId) {
        this.regionId = regionId;
    }

}