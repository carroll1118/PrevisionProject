package com.it666.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.it666.domain.User;

@WebServlet("/QuitServlet")
public class QuitServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		User u = null;
		HttpSession session = request.getSession();
	    session.setAttribute("user", u);
		//Ìø×ªµ½µÇÂ¼Ò³Ãæ
		response.setHeader("refresh", "1,url=/Mystore2/index.jsp");
	}

}
