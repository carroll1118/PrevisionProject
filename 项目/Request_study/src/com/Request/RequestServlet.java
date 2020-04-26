package com.Request;

import java.io.IOException;
import java.util.Arrays;
import java.util.Enumeration;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



@WebServlet("/RequestServlet")
public class RequestServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("6666");
		
		//1.1获取请求方式  get  post
		String method = request.getMethod();
		System.out.println(method);
		
		//1.2请求资源  URL  URI
		StringBuffer requestURL = request.getRequestURL();
		String requestURI = request.getRequestURI();
		System.out.println(requestURL);
		System.out.println(requestURI);
		
		//1.3获取get请求参数
		String queryString = request.getQueryString();
		System.out.println(queryString);
		//1.4 获取当前web应用名称
		String contextPath = request.getContextPath();
		System.out.println(contextPath);
		
		//2.1获取全部的请求头名称
		Enumeration<String> headerNames = request.getHeaderNames();
		while(headerNames.hasMoreElements()) {
			System.out.println("name  = "+ headerNames.nextElement());
		}
		//2.2 根据指定名称获取头信息
		String header = request.getHeader("referer");
		System.out.println("referer =  " + header);
		
		//2.3 打印所以的请求头和头内容
		Enumeration<String> headerNames2 = request.getHeaderNames();
		while(headerNames2.hasMoreElements()) {
			String name = headerNames2.nextElement();
			String value = request.getHeader(name);
			System.out.println(name  +":"+ value);
		}
		//3.1获取请求体的一个值
		String name = request.getParameter("username");
		System.out.println(name);
		//3.2获取多个值
		String[] parameterVales = request.getParameterValues("hobby");
		System.out.println(Arrays.toString(parameterVales));
		//3.3获取所有请求参数
		Map<String, String[]>  parameterMap = request.getParameterMap();
		
		for(Map.Entry<String, String[]> entry: parameterMap.entrySet()) {
			System.out.println(entry.getKey());
			System.out.println(Arrays.toString(entry.getValue()));
		}
		
		
		
	}

}
