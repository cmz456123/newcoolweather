package com.itheima.android.db;

import org.litepal.crud.DataSupport;

/*
 *  @项目名：  NewCoolWeather 
 *  @包名：    com.itheima.android.db
 *  @文件名:   County
 *  @创建者:   lenovo
 *  @创建时间:  2017/2/7 13:07
 *  @描述：    县类
 */
public class County extends DataSupport {
    private int id;
    private String weatherId;
    private String countyName;
    private int cityId;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getWeatherId() {
        return weatherId;
    }

    public void setWeatherId(String weatherId) {
        this.weatherId = weatherId;
    }

    public String getCountyName() {
        return countyName;
    }

    public void setCountyName(String countyName) {
        this.countyName = countyName;
    }

    public int getCityId() {
        return cityId;
    }

    public void setCityId(int cityId) {
        this.cityId = cityId;
    }
}
