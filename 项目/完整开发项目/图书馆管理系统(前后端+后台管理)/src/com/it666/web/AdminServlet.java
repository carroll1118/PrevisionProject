package com.it666.web;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.it666.domain.Admin;
import com.it666.service.AdminService;

@WebServlet("/AdminServlet")
public class AdminServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//接收用户名和密码
		String name = request.getParameter("username");
		String pwd = request.getParameter("password");
	   // System.out.println(name + pwd);
		
		AdminService adminService = new AdminService();
		try {
		    Admin admin = adminService.login(name,pwd);
			//System.out.println("登录成功");
		    //1.把用户保存到session
		    HttpSession  session = request.getSession();
		    session.setAttribute("admin", admin);
		    //2.跳转到后台首页
		    //重定向，让浏览器去跳转到指定地址
		    response.sendRedirect(request.getContextPath()+"/admin/admin_index.jsp");
			
			
			
		} catch (Exception e) {
			
			if(e.getMessage().equals("用户名或密码错误")) {
				System.out.println("登录失败");
				//跳转登录页面，回显错误信息
				request.setAttribute("err", e.getMessage());
				//服务器内部转发
				request.getRequestDispatcher("admin/admin_login.jsp").forward(request, response);
	
			}else {
				e.printStackTrace();
			}
			
		}
		
	}

}
