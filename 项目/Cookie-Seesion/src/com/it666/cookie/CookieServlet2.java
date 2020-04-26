package com.it666.cookie;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/CookieServlet2")
public class CookieServlet2 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		System.out.println("--------------");
		
        /*
                         删除cookie
          Cookie cookie = new Cookie("it","it666");
		  cookie.setMaxAge(0);
		   response.addCookie(cookie);
          */
		
		//获取所有的cookies
		Cookie[] cookies = request.getCookies();
		if(cookies != null) {
			for(Cookie cookie : cookies) {
				String name = cookie.getName();
				if(name.equals("lk")) {
					response.getWriter().write("lk = "+cookie.getValue());
				}
			}
		}
		
	}

}
