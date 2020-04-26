package com.it666.web;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.sound.midi.Soundbank;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import com.it666.domain.Books;
import com.it666.service.BooksService;
import com.it666.utils.JdbcUtil;

@WebServlet("/BooksInfoServlet")
public class BooksInfoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//1.接受参数id
		Integer id = Integer.valueOf(request.getParameter("id"));
		System.out.println(id+"---------------");
		
		BooksService booksService = new  BooksService();
		Books books = null;
		try {
		    books = booksService.getBooksWithId(id);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//3.把数据库取出来的数据存到request域
		request.setAttribute("books", books);
		/*System.out.println(allBooks);*/
				
				
		//4.转发到商品列表页面,转发时把request对象传入
		request.getRequestDispatcher("/book_info.jsp").forward(request, response);
	}

}
