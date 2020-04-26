package com.it666.servlet;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.sql.SQLException;
import java.util.Map;
import java.util.UUID;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.beanutils.BeanUtils;
import org.apache.commons.dbutils.QueryRunner;

import com.it666.domain.User;
import com.it666.utils.JdbcUtil;

@WebServlet("/RegistServlet")
public class RegistServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");
//		//��ȡ����  ��֤��
//		String code = request.getParameter("code");
//		//��ȡ���������ɵ���֤��
//		String word = (String) this.getServletContext().getAttribute("checkCode");
//		
//		if(code.equals(word)) {
//			response.getWriter().write("");
//		}else {
//			response.getWriter().write("��֤�����");
//			response.setHeader("refresh", "3,url=/Mystore/regist.html");
//		}
		
		//1.�������в���
		Map<String, String[]> parameterMap = request.getParameterMap();
		User u = new User();
		//2.�ѽ��ܵĲ�����װ��User����
		try {
			BeanUtils.populate(u,parameterMap);
		} catch (IllegalAccessException | InvocationTargetException e) {
			e.printStackTrace();
		}
		//3.����Uid
		u.setUid(UUID.randomUUID().toString());
		//4.д�����ݿ�
		QueryRunner qr = new QueryRunner(JdbcUtil.getDataSource());
		String sql = "insert into user value(?,?,?,?)";
		try {
			qr.update(sql,u.getUid(),u.getUsername(),u.getPassword(),u.getPhone());
		} catch (SQLException e) {
			e.printStackTrace();
		}
		//��ת��¼ҳ��
		response.setHeader("refresh", "3,url=/Mystore/login.html");
	}

}
