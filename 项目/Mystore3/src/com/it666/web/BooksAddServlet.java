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


@WebServlet("/BooksAddServlet")
public class BooksAddServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		 request.setCharacterEncoding("utf-8");
		 Map<String, String[]> parameterMap = request.getParameterMap();
		 
		 //�Ѳ�����װ�ɶ���
		 Books books = new Books();
		 try {
		    BeanUtils.populate(books, parameterMap);
			//books.setImage_id(1);
			//���÷����
			BooksService goodsService = new BooksService();
			goodsService.addBooks(books);
			//��ת���б�ȡ����������
			request.getRequestDispatcher("/BooksListServlet").forward(request, response);
		    
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		 
	}

}
