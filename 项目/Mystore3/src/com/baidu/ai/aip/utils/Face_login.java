package com.baidu.ai.aip.utils;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;

import com.it666.domain.User;
import com.it666.utils.JdbcUtil;


public class Face_login extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//获取用户名和密码
		
		face_detection1 face_detection = new face_detection1();
		String face_name = null;
		
		try {
			Thread.sleep(500);
			face_name=face_detection.search();
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		

		
		if(face_name.equals("GGQ"))
		{
			face_name="郭高勤";
		}
		else if(face_name.equals("LHB"))
		{
			face_name="廖海波";
		}
		else if(face_name.equals("LSM"))
		{
			
			face_name="刘山铭";
		}
		
		System.out.println(face_name);
		
		
		//到数据库查询该用户是否存在
		QueryRunner qr = new QueryRunner(JdbcUtil.getDataSource());
		String sql = "select user_name,user_password from user where user_name=?";
		System.out.println(sql);
		User u = null;
		try {
			u = qr.query(sql, new BeanHandler<User>(User.class),face_name);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		response.setContentType("text/html;charset=utf-8");
		if(u != null) {
			//response.getWriter().write("登录成功");
			//把用户保存
			HttpSession session = request.getSession();
		    session.setAttribute("user", u);
		    
			//跳转到登录页面
		    response.sendRedirect(request.getContextPath()+"/Mystore3/BooksHotServlet");
		//	response.setHeader("refresh", "url=/Mystore3/index.jsp");
		}else {
			//response.getWriter().write("登录失败");
			//response.setHeader("refresh", "url=/Mystore3/login.jsp");
			response.sendRedirect(request.getContextPath()+"/login.jsp");
		}
		
		
		
		
	}

}
