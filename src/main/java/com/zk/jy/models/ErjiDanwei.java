package com.zk.jy.models;

/**
 * 二级单位数据模型
 *
 * 创建时间：2018-07-13
 * 创 建 人：武大卫
 *
 * 说明：此数据模型包括二级单位的ID、上级单位ID、名称、地址、电话、单位等级
 */

public class ErjiDanwei {

    private int dID;
    private int sID;    //上级单位ID
    private String dName;
    private String dAddress;
    private String dTel;
    private int dLevel;

    public ErjiDanwei() {
    }

    public ErjiDanwei(int dID, int sID, String dName, String dAddress, String dTel, int dLevel) {
        this.dID = dID;
        this.sID = sID;
        this.dName = dName;
        this.dAddress = dAddress;
        this.dTel = dTel;
        this.dLevel = dLevel;
    }

    public int getdID() {
        return dID;
    }

    public void setdID(int dID) {
        this.dID = dID;
    }

    public int getsID() {
        return sID;
    }

    public void setsID(int sID) {
        this.sID = sID;
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
