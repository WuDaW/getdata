package com.zk.jy.dao;

import com.zk.jy.models.AdminUser;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class AdminUserDao {

    public static AdminUser adminUserLogin(Connection conn, AdminUser au) throws Exception {
        AdminUser reAu = null;
        String sql = "select * from t_admin_user where username=? and password=?";
        PreparedStatement pstmt = conn.prepareStatement(sql);
        pstmt.setString(1, au.getUsername());
        pstmt.setString(2, au.getPassword());
        ResultSet rs = pstmt.executeQuery();
        if(rs.next()) {
            reAu = new AdminUser();
            reAu.setUsername(rs.getString("username"));
        }
        return reAu;
    }
}
