package com.zk.jy.dao;

import com.zk.jy.utils.ZkDB;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class DanweiDao {

    public static ResultSet allDanwei(Connection conn) throws Exception{
        String sql = "select * from t_danwei_info order by dlevel";
        PreparedStatement pstmt = conn.prepareStatement(sql);
        ResultSet rs = pstmt.executeQuery();
        return rs;
    }

}
