package com.itheima.android.db;

import org.litepal.crud.DataSupport;

/*
 *  @项目名：  NewCoolWeather 
 *  @包名：    com.itheima.android.db
 *  @文件名:   Province
 *  @创建者:   lenovo
 *  @创建时间:  2017/2/7 12:53
 *  @描述：    省类
 */
public class Province extends DataSupport {
    private static final String TAG = "Province";
    private int id;
    private String provinceName;
    private int provinceCode;

    public int getId() {
        return id;
    }

    public String getProvinceName() {
        return provinceName;
    }

    public int getProvinceCode() {
        return provinceCode;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setProvinceName(String provinceName) {
        this.provinceName = provinceName;
    }

    public void setProvinceCode(int provinceCode) {
        this.provinceCode = provinceCode;
    }
}
