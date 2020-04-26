package com.it666.cookie;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/CookieServlet")
public class CookieServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//1.创建cookie
		Cookie cookie = new Cookie("it","it666");
		
		//设置Cookie在客户端的存储时间
//		cookie.setMaxAge(60);
//		cookie.setPath("/Cookie-Seesion");
//		cookie.setPath("/Cookie-Seesion/CookieServlet2");
		//2.响应给浏览器
		response.addCookie(cookie);
	}

}
