package com.zk.jy.dao;

import java.sql.Connection;
import java.sql.ResultSet;

public class DanweiDao {

    public static ResultSet allDanwei(Connection conn) throws Exception{
        String sql = "select * from t_anwei order by dlevel";
        return null;
    }
}
