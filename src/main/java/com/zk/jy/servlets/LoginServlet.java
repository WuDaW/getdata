package com.zk.jy.servlets;

import com.zk.jy.dao.AdminUserDao;
import com.zk.jy.models.AdminUser;
import com.zk.jy.utils.ZkDB;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.sql.Connection;

public class LoginServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String username = request.getParameter("username");
        String password = request.getParameter("password");

        AdminUser au = new AdminUser(username, password);
        Connection conn = null;
        try {
            conn = ZkDB.getConn();
            AdminUser reAu = AdminUserDao.adminUserLogin(conn, au);
            if(reAu == null) {
                request.setAttribute("error", "用户名或密码错误！");
                //服务器跳转
                request.getRequestDispatcher("index.jsp").forward(request, response);
            }else {
                //获取Session
                HttpSession session = request.getSession();
                session.setAttribute("reAu", reAu);
                //客户端跳转
                response.sendRedirect("main.jsp");
            }
        }catch (Exception e) {
            e.printStackTrace();
        }
    }
}
