package com.it666.servlet;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import com.it666.domain.Goods;
import com.it666.utils.JdbcUtil;

@WebServlet("/GoodsServlet")
public class GoodsServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//1.�������ݿ�
		QueryRunner qr = new QueryRunner(JdbcUtil.getDataSource());
		//2.�����ݿ��ȡ����
		String sql = "select * from goods";
		List<Goods> allGoods = null;   //????
		try {
			allGoods = qr.query(sql, new BeanListHandler<Goods>(Goods.class));
		} catch (SQLException e) {
			e.printStackTrace();
		}
//		System.out.println(allGoods);
		//3.�����ݿ�ȡ���������ݴ浽request��
		request.setAttribute("allGoods", allGoods);
		
		
		//4.ת������Ʒ�б�ҳ��,ת��ʱ��request������
		request.getRequestDispatcher("/goods_list.jsp").forward(request, response);
	}

}
