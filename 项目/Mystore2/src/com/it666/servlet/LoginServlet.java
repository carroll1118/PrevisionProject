package com.it666.servlet;

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

	protected <HttpSession> void service(HttpServletRequest request, HttpServletResponse response) throws Exception {
		//��ȡ�û���������
		String name = request.getParameter("username");
		String pwd = request.getParameter("password");
		
		//�����ݿ��ѯ���û��Ƿ����
		QueryRunner qr = new QueryRunner(JdbcUtil.getDataSource());
		String sql = "select * from user where username=? and password=?";
		User u = null;
		try {
			u = qr.query(sql, new BeanHandler<User>(User.class),name,pwd);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		response.setContentType("text/html;charset=utf-8");
		if(u != null) {
			response.getWriter().write("��¼�ɹ�");
			//���û�����
			HttpSession session = request.getSession();
		    session.setAttribute("user", u);
			//��ת����¼ҳ��
			response.setHeader("refresh", "3,url=/Mystore2/index.jsp");
		}else {
			response.getWriter().write("��¼ʧ��");
			response.setHeader("refresh", "3,url=/Mystore2/login.jsp");
		}
		
		
		
		
	}

}
