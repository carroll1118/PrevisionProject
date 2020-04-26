package com.it666.web;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.it666.domain.Category;
import com.it666.service.CategoryService;

@WebServlet("/GoodsAddUIServlet")
public class GoodsAddUIServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//1.ȡ�����еķ���
		CategoryService categoryService = new CategoryService();
		try {
			List<Category> allCategory = categoryService.findCategory();
			//2.�ѷ���浽����
			request.setAttribute("allCategory", allCategory);
			//3.ת��add.jsp
			request.getRequestDispatcher("admin/add.jsp").forward(request, response);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
		
	}

}
