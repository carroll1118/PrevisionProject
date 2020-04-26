package com.it666.web;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.it666.domain.Books;
import com.it666.service.BooksService;

@WebServlet("/BooksDelServlet")
public class BooksDelServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//1.接受参数id
		String id = request.getParameter("id");
		//2.调用服务层，让其删除商品
		BooksService booksService = new BooksService();
	    try {
			booksService.deleteBooks(id);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    //转发
	    request.getRequestDispatcher("/BooksaListServlet").forward(request, response);
	}

}
