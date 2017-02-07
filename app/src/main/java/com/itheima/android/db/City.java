package com.itheima.android.db;

import org.litepal.crud.DataSupport;

/*
 *  @项目名：  NewCoolWeather 
 *  @包名：    com.itheima.android.db
 *  @文件名:   Province
 *  @创建者:   lenovo
 *  @创建时间:  2017/2/7 12:53
 *  @描述：    市类
 */
public class City extends DataSupport{
    private int id;
    private int cityCode;
    private String cityName;
    private int provinceId;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCityCode() {
        return cityCode;
    }

    public void setCityCode(int cityCode) {
        this.cityCode = cityCode;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public int getProvinceId() {
        return provinceId;
    }

    public void setProvinceId(int provinceId) {
        this.provinceId = provinceId;
    }
}
