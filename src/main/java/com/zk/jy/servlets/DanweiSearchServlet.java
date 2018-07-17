package com.zk.jy.servlets;

import com.sun.org.apache.regexp.internal.RE;
import com.zk.jy.dao.DanweiDao;
import com.zk.jy.utils.JsonUtil;
import com.zk.jy.utils.ResponseUtil;
import com.zk.jy.utils.ZkDB;
import org.json.JSONArray;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;

public class DanweiSearchServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        //获取任务action，任务包括：显示所有单位（showall）、通过名称查找单位（findbyname）、通过地址查找单位（findbyaddress）
        String action = request.getParameter("action");
        try {
            Connection conn = ZkDB.getConn();
            ResultSet rs = DanweiDao.allDanwei(conn);
            JSONArray result = JsonUtil.formatRsToJsonArray(rs);
            ResponseUtil.write(response,result);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
