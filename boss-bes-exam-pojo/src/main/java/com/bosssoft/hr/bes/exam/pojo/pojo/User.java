package com.bosssoft.hr.bes.exam.pojo.pojo;

import java.util.Date;

public class User {
    private Integer userId;

    private String jobNum;

    private String password;

    private String name;

    private String headPhoto;

    private Byte sex;

    private Date birth;

    private String telePhone;

    private String email;

    private String otherPhone;

    private String remarks;

    private Byte status;

    private Date createdTime;

    private Date updatedTime;

    private String version;

    public Integer getUserid() {
        return userId;
    }

    public void setUserid(Integer userid) {
        this.userId = userid;
    }

    public String getJobnum() {
        return jobNum;
    }

    public void setJobnum(String jobnum) {
        this.jobNum = jobnum == null ? null : jobnum.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getHeadphoto() {
        return headPhoto;
    }

    public void setHeadphoto(String headphoto) {
        this.headPhoto = headphoto == null ? null : headphoto.trim();
    }

    public Byte getSex() {
        return sex;
    }

    public void setSex(Byte sex) {
        this.sex = sex;
    }

    public Date getBirth() {
        return birth;
    }

    public void setBirth(Date birth) {
        this.birth = birth;
    }

    public String getTelephone() {
        return telePhone;
    }

    public void setTelephone(String telephone) {
        this.telePhone = telephone == null ? null : telephone.trim();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    public String getOtherphone() {
        return otherPhone;
    }

    public void setOtherphone(String otherphone) {
        this.otherPhone = otherphone == null ? null : otherphone.trim();
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks == null ? null : remarks.trim();
    }

    public Byte getStatus() {
        return status;
    }

    public void setStatus(Byte status) {
        this.status = status;
    }

    public Date getCreatedtime() {
        return createdTime;
    }

    public void setCreatedtime(Date createdtime) {
        this.createdTime = createdtime;
    }

    public Date getUpdatedtime() {
        return updatedTime;
    }

    public void setUpdatedtime(Date updatedtime) {
        this.updatedTime = updatedtime;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version == null ? null : version.trim();
    }

    @Override
    public String toString() {
        return "User{" +
                "userId=" + userId +
                ", jobNum='" + jobNum + '\'' +
                ", password='" + password + '\'' +
                ", name='" + name + '\'' +
                ", headPhoto='" + headPhoto + '\'' +
                ", sex=" + sex +
                ", birth=" + birth +
                ", telePhone='" + telePhone + '\'' +
                ", email='" + email + '\'' +
                ", otherPhone='" + otherPhone + '\'' +
                ", remarks='" + remarks + '\'' +
                ", status=" + status +
                ", createdTime=" + createdTime +
                ", updatedTime=" + updatedTime +
                ", version='" + version + '\'' +
                '}';
    }
}