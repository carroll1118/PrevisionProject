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
		
		//1.连接数据库
		QueryRunner qr = new QueryRunner(JdbcUtil.getDataSource());
		//2.从数据库获取数据
		String sql = "select * from goods";
		List<Goods> allGoods = null;   //????
		try {
			allGoods = qr.query(sql, new BeanListHandler<Goods>(Goods.class));
		} catch (SQLException e) {
			e.printStackTrace();
		}
//		System.out.println(allGoods);
		//3.把数据库取出来的数据存到request域
		request.setAttribute("allGoods", allGoods);
		
		
		//4.转发到商品列表页面,转发时把request对象传入
		request.getRequestDispatcher("/goods_list.jsp").forward(request, response);
	}

}
