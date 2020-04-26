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
		//1��ȡ���еĲ���
		Map<String, String[]> parameterMap = request.getParameterMap();
		Goods goods = new Goods();
		//2.��װ��goods����
		try {
			BeanUtils.populate(goods, parameterMap);
			//����id��������
			
			//4.���÷����
			GoodsService goodsService = new GoodsService();
			goodsService.updateGoods(goods);
			
			//5.��ת�б�ҳ
			request.getRequestDispatcher("/GoodsListServlet").forward(request, response);;

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
