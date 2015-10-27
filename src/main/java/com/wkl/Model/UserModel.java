package com.wkl.Model;

/**
 * Created by wklmogujie on 15/10/24.
 */
public class UserModel {
    private String Username;
    private String password;
    private String realName;
    private WorkInfoModel workInfo;
    private SchoolInfoModel schoolInfo;

    public String getPassword() {
        return password;
    }

    public String getRealName() {
        return realName;
    }

    public WorkInfoModel getWorkInfo() {
        return workInfo;
    }

    public SchoolInfoModel getSchoolInfo() {
        return schoolInfo;
    }

    public void setWorkInfo(WorkInfoModel workInfo) {
        this.workInfo = workInfo;
    }

    public void setSchoolInfo(SchoolInfoModel schoolInfo) {
        this.schoolInfo = schoolInfo;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setRealName(String realName) {
        this.realName = realName;
    }

    public String getUsername() {
        return Username;
    }

    public void setUsername(String username) {
        Username = username;
    }
}
