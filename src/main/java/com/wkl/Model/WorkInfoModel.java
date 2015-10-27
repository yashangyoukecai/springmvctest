package com.wkl.Model;

/**
 * Created by wklmogujie on 15/10/24.
 */
public class WorkInfoModel {
    private String city; //所在城市
    private String job; //职位
    private String year; //工作年限

    public String getCity() {
        return city;
    }

    public String getJob() {
        return job;
    }

    public String getYear() {
        return year;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public void setYear(String year) {
        this.year = year;
    }
}
