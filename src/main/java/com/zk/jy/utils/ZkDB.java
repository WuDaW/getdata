package com.zk.jy.utils;

import java.sql.Connection;
import java.sql.DriverManager;

public class ZkDB {

    final private static String url = "jdbc:mysql://localhost:3306/db_mydata?useUnicode=true&characterEncoding=UTF-8&useSSL=false";
    final private static String user = "root";
    final private static String password = "123456";

    static {
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    /**
     * 获取数据库连接
     * @return 数据库连接对象
     * @throws Exception
     */
    public static Connection getConn() throws Exception {
        Connection conn = DriverManager.getConnection(url,user,password);
        return conn;
    }

    /**
     * 关闭数据库连接
     * @param conn 数据库连接
     * @throws Exception
     */
    public static void closeConn(Connection conn) throws Exception {
        if(conn != null) {
            conn.close();
        }
    }
}
