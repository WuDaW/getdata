package com.zk.jy.models;

public class AdminUser {

    private int auid;
    private String username;
    private String password;

    public AdminUser() {
    }

    public AdminUser(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public int getAuid() {
        return auid;
    }

    public void setAuid(int auid) {
        this.auid = auid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
