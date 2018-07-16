package com.zk.jy.models;

/**
 * 一级单位数据模型
 * 创建时间：2018-07-13
 * 创建人：武大卫
 * 说明：此数据模型包括一级单位的ID、名称、地址、电话、单位等级
 */

public class YijiDanwei {

    private int dID;
    private String dName;
    private String dAddress;
    private String dTel;
    private int dLevel;

    public YijiDanwei() {
    }

    public YijiDanwei(int dId, String dName, String dAddress, String dTel, int dLevel) {
        this.dID = dId;
        this.dName = dName;
        this.dAddress = dAddress;
        this.dTel = dTel;
        this.dLevel = dLevel;
    }

    public int getdId() {
        return dID;
    }

    public void setdId(int dId) {
        this.dID = dId;
    }

    public String getdName() {
        return dName;
    }

    public void setdName(String dName) {
        this.dName = dName;
    }

    public String getdAddress() {
        return dAddress;
    }

    public void setdAddress(String dAddress) {
        this.dAddress = dAddress;
    }

    public String getdTel() {
        return dTel;
    }

    public void setdTel(String dTel) {
        this.dTel = dTel;
    }

    public int getdLevel() {
        return dLevel;
    }

    public void setdLevel(int dLevel) {
        this.dLevel = dLevel;
    }
}
