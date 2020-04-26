package com.it666.web;

import java.io.IOException;
import java.sql.SQLException;
import java.util.Collections;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.it666.domain.Books;
import com.it666.service.BooksService;

@WebServlet("/BooksListServlet")
public class BooksListServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//1.���÷����
		BooksService booksServi1ce = new BooksService();
		try {
			List<Books> allBooks = booksServi1ce.getAllBooks();
			//�Լ��Ͻ��з�ת
			Collections.reverse(allBooks);
			//������д��request��
			request.setAttribute("allBooks", allBooks);
			//ת��
			request.getRequestDispatcher("admin/main.jsp").forward(request, response);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
