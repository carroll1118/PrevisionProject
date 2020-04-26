package com.study.login;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;

import com.study.domain.User;
import com.study.utils.JdbcUtil;

@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//1.��ȡ�������
		String username = request.getParameter("username");
		String pwd = request.getParameter("pwd");
		
		//2.ʹ��dbutils�������ݿ�
		 QueryRunner qr = new QueryRunner(JdbcUtil.getDataSource());
		 String sql = "select * from user where name=? and pwd=?";
		 User user = null;
		 try {
			   user = qr.query(sql, new BeanHandler<User>(User.class),username,pwd);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		 
		//3.����û����������Ƿ���ȷ
		 if(user != null) {
			 response.getWriter().write("login success"+user.getName());
		 }
		 else {
			 response.getWriter().write("login fail");
		 }
	}

}
