package com.it666.web;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.it666.domain.Admin;
import com.it666.service.AdminService;

@WebServlet("/AdminServlet")
public class AdminServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//�����û���������
		String name = request.getParameter("username");
		String pwd = request.getParameter("password");
	   // System.out.println(name + pwd);
		
		AdminService adminService = new AdminService();
		try {
		    Admin admin = adminService.login(name,pwd);
			//System.out.println("��¼�ɹ�");
		    //1.���û����浽session
		    HttpSession  session = request.getSession();
		    session.setAttribute("admin", admin);
		    //2.��ת����̨��ҳ
		    //�ض����������ȥ��ת��ָ����ַ
		    response.sendRedirect(request.getContextPath()+"/admin/admin_index.jsp");
			
			
			
		} catch (Exception e) {
			
			if(e.getMessage().equals("�û������������")) {
				System.out.println("��¼ʧ��");
				//��ת��¼ҳ�棬���Դ�����Ϣ
				request.setAttribute("err", e.getMessage());
				//�������ڲ�ת��
				request.getRequestDispatcher("admin/admin_login.jsp").forward(request, response);
	
			}else {
				e.printStackTrace();
			}
			
		}
		
	}

}
