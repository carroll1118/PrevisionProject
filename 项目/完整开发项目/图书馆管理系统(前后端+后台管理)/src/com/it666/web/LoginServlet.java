package com.it666.web;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;

import com.it666.domain.User;
import com.it666.utils.JdbcUtil;

@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//��ȡ�û���������
		String name = request.getParameter("username");
		String pwd = request.getParameter("password");
		System.out.println(name);
		System.out.println(pwd);
		
		//�����ݿ��ѯ���û��Ƿ����
		QueryRunner qr = new QueryRunner(JdbcUtil.getDataSource());
		String sql = "select user_name,user_password from user where user_name=? and user_password=?";
		System.out.println(sql);
		User u = null;
		try {
			u = qr.query(sql, new BeanHandler<User>(User.class),name,pwd);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		response.setContentType("text/html;charset=utf-8");
		if(u != null) {
			//response.getWriter().write("��¼�ɹ�");
			//���û�����
			HttpSession session = request.getSession();
		    session.setAttribute("user", u);
		    
			//��ת����¼ҳ��
		    response.sendRedirect(request.getContextPath()+"/index.jsp");
		//	response.setHeader("refresh", "url=/Mystore3/index.jsp");
		}else {
			//response.getWriter().write("��¼ʧ��");
			//response.setHeader("refresh", "url=/Mystore3/login.jsp");
			response.sendRedirect(request.getContextPath()+"/login.jsp");
		}
		
		
		
		
	}

}
