package com.wkl.Model;

/**
 * Created by wklmogujie on 15/10/24.
 */
public class SchoolInfoModel {
    private String schoolType; //学校类型：高中、中专、大学
    private String schoolName; //学校名称
    private String specialty; //专业

    public String getSchoolType() {
        return schoolType;
    }

    public String getSchoolName() {
        return schoolName;
    }

    public String getSpecialty() {
        return specialty;
    }

    public void setSchoolType(String schoolType) {
        this.schoolType = schoolType;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    public void setSpecialty(String specialty) {
        this.specialty = specialty;
    }
}
