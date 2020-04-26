package com.it666.web;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.it666.domain.Books;
import com.it666.domain.Category;
import com.it666.service.BooksService;
import com.it666.service.CategoryService;

@WebServlet("/BooksEditUIServlet")
public class BooksEditUIServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//获取商品id
		Integer id  = Integer.valueOf(request.getParameter("id"));
		
		try {
			
			BooksService booksService = new BooksService();
			Books books = booksService.getBooksWithId(id);
			//把商品写到域
			request.setAttribute("books", books);
			
			//获取所有的分类
			CategoryService categoryService = new CategoryService();
			
			List<Category> allCategory = categoryService.findCategory();
			request.setAttribute("allCategory", allCategory);
			
			//转发edit.jsp
			request.getRequestDispatcher("/admin/edit.jsp").forward(request, response);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
