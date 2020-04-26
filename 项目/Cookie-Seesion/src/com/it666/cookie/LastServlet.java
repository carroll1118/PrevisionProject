package com.it666.cookie;

import java.io.IOException;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/LastServlet")
public class LastServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//1.��ȡ��ǰ������
	     Date date = new Date();
	     SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
	     String formatDate = sdf.format(date);
	     //2.������д��cookie
	     Cookie cookie = new Cookie("lastTime",URLEncoder.encode(formatDate, "UTF-8"));
	     //3.��Ӧ�������
	     System.out.println(cookie.getValue());
	     response.addCookie(cookie);
	     
	     String lastTime = null;
	     //ȡ��cookie
	     Cookie[] cookies = request.getCookies();
		 if(cookies != null) {
				for(Cookie c : cookies) {
					if(c.getName().equals("lastTime")) {
						lastTime = c.getValue();
					}
				}
			}
		 
		  response.setContentType("text/html;charset=utf-8"); 
		  if(lastTime != null ) {
			  response.getWriter().write("��һ�εĵ�¼ʱ��Ϊ ��"+  URLDecoder.decode(lastTime, "UTF-8"));
		  }else {
			  response.getWriter().write("���ǵ�һ�ε�¼");
		  }
	     
	}

}
