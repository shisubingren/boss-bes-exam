package com.bosssoft.hr.bes.exam.pojo.pojo;

import java.util.Date;

public class Role {
    private Integer roleId;

    private String name;

    private String code;

    private String remarks;

    private Byte status;

    private Date createdTime;

    private Date updatedTime;

    private String version;

    public Integer getRoleid() {
        return roleId;
    }

    public void setRoleid(Integer roleid) {
        this.roleId = roleid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code == null ? null : code.trim();
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
        return "Role{" +
                "roleId=" + roleId +
                ", name='" + name + '\'' +
                ", code='" + code + '\'' +
                ", remarks='" + remarks + '\'' +
                ", status=" + status +
                ", createdTime=" + createdTime +
                ", updatedTime=" + updatedTime +
                ", version='" + version + '\'' +
                '}';
    }
}