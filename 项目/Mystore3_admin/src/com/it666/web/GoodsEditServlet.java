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

@WebServlet("/GoodsEditServlet")
public class GoodsEditServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		request.setCharacterEncoding("utf-8");
		//1获取所有的参数
		Map<String, String[]> parameterMap = request.getParameterMap();
		Goods goods = new Goods();
		//2.封装成goods对象
		try {
			BeanUtils.populate(goods, parameterMap);
			//根据id更新数据
			
			//4.调用服务层
			GoodsService goodsService = new GoodsService();
			goodsService.updateGoods(goods);
			
			//5.跳转列表页
			request.getRequestDispatcher("/GoodsListServlet").forward(request, response);;

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
