package com.bosssoft.hr.bes.exam.pojo.pojo;

import java.util.Date;
/**
 * @Author yzq
 * @Description //TODO
 * @Date 下午 08:18 2019/11/25 0025
 **/
public class Resource {
    private Integer resourceId;

    private String pointName;

    private String number;

    private Integer id;

    private Integer parentId;

    private String url;

    private String openIcon;

    private String closeIcon;

    private Byte type;

    private Byte childId;

    private String remarks;

    private Byte status;

    private Date createdTime;

    private Date updatedTime;

    private String version;

    public Integer getResourceid() {
        return resourceId;
    }

    public void setResourceid(Integer resourceid) {
        this.resourceId = resourceid;
    }

    public String getPointname() {
        return pointName;
    }

    public void setPointname(String pointname) {
        this.pointName = pointname == null ? null : pointname.trim();
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number == null ? null : number.trim();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getParentid() {
        return parentId;
    }

    public void setParentid(Integer parentid) {
        this.parentId = parentid;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url == null ? null : url.trim();
    }

    public String getOpenicon() {
        return openIcon;
    }

    public void setOpenicon(String openicon) {
        this.openIcon = openicon == null ? null : openicon.trim();
    }

    public String getCloseicon() {
        return closeIcon;
    }

    public void setCloseicon(String closeicon) {
        this.closeIcon = closeicon == null ? null : closeicon.trim();
    }

    public Byte getType() {
        return type;
    }

    public void setType(Byte type) {
        this.type = type;
    }

    public Byte getChildid() {
        return childId;
    }

    public void setChildid(Byte childid) {
        this.childId = childid;
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
        return "Resource{" +
                "resourceId=" + resourceId +
                ", pointName='" + pointName + '\'' +
                ", number='" + number + '\'' +
                ", id=" + id +
                ", parentId=" + parentId +
                ", url='" + url + '\'' +
                ", openIcon='" + openIcon + '\'' +
                ", closeIcon='" + closeIcon + '\'' +
                ", type=" + type +
                ", childId=" + childId +
                ", remarks='" + remarks + '\'' +
                ", status=" + status +
                ", createdTime=" + createdTime +
                ", updatedTime=" + updatedTime +
                ", version='" + version + '\'' +
                '}';
    }
}