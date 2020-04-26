package com.it666.web;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.beanutils.BeanUtils;

import com.it666.domain.Books;
import com.it666.service.BooksService;


@WebServlet("/BooksEditServlet")
public class BooksEditServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		request.setCharacterEncoding("utf-8");
		//1��ȡ���еĲ���
		Map<String, String[]> parameterMap = request.getParameterMap();
		Books books = new Books();
		//2.��װ��goods����
		try {
			BeanUtils.populate(books, parameterMap);
			//����id��������
			
			//4.���÷����
			BooksService booksService = new BooksService();
			booksService.updateBooks(books);
			
			//5.��ת�б�ҳ
			request.getRequestDispatcher("/BooksListServlet").forward(request, response);;

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
