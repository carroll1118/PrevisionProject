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
		
		//1.1��ȡ����ʽ  get  post
		String method = request.getMethod();
		System.out.println(method);
		
		//1.2������Դ  URL  URI
		StringBuffer requestURL = request.getRequestURL();
		String requestURI = request.getRequestURI();
		System.out.println(requestURL);
		System.out.println(requestURI);
		
		//1.3��ȡget�������
		String queryString = request.getQueryString();
		System.out.println(queryString);
		//1.4 ��ȡ��ǰwebӦ������
		String contextPath = request.getContextPath();
		System.out.println(contextPath);
		
		//2.1��ȡȫ��������ͷ����
		Enumeration<String> headerNames = request.getHeaderNames();
		while(headerNames.hasMoreElements()) {
			System.out.println("name  = "+ headerNames.nextElement());
		}
		//2.2 ����ָ�����ƻ�ȡͷ��Ϣ
		String header = request.getHeader("referer");
		System.out.println("referer =  " + header);
		
		//2.3 ��ӡ���Ե�����ͷ��ͷ����
		Enumeration<String> headerNames2 = request.getHeaderNames();
		while(headerNames2.hasMoreElements()) {
			String name = headerNames2.nextElement();
			String value = request.getHeader(name);
			System.out.println(name  +":"+ value);
		}
		//3.1��ȡ�������һ��ֵ
		String name = request.getParameter("username");
		System.out.println(name);
		//3.2��ȡ���ֵ
		String[] parameterVales = request.getParameterValues("hobby");
		System.out.println(Arrays.toString(parameterVales));
		//3.3��ȡ�����������
		Map<String, String[]>  parameterMap = request.getParameterMap();
		
		for(Map.Entry<String, String[]> entry: parameterMap.entrySet()) {
			System.out.println(entry.getKey());
			System.out.println(Arrays.toString(entry.getValue()));
		}
		
		
		
	}

}
