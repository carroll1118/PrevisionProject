package com.dispatcher;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Servlet1")
public class Servlet1 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//请求转发
		//1.获取转发器
		RequestDispatcher disP = request.getRequestDispatcher("/Servlet2");
		//域对象  能够存储数据
		request.setAttribute("1K", "it6666");
		//2.转发
		disP.forward(request, response);
		
	}

}
