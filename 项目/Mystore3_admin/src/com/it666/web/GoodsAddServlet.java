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

import com.it666.domain.Goods;
import com.it666.service.GoodsService;


@WebServlet("/GoodsAddServlet")
public class GoodsAddServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		 request.setCharacterEncoding("utf-8");
		 Map<String, String[]> parameterMap = request.getParameterMap();
		 
		 //把参数封装成对象
		 Goods goods = new Goods();
		 try {
		    BeanUtils.populate(goods, parameterMap);
			goods.setImage("goods11.png");
			//调用服务层
			GoodsService goodsService = new GoodsService();
			goodsService.addGoods(goods);
			//跳转到列表，取出最新数据
			request.getRequestDispatcher("/GoodsListServlet").forward(request, response);
		    
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		 
	}

}
