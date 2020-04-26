package com.myxq.web;

import java.io.IOException;
import java.sql.SQLException;
import java.util.Collections;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.beanutils.BeanUtils;

import com.myxq.domain.Category;
import com.myxq.domain.Goods;
import com.myxq.service.CategoryService;
import com.myxq.service.GoodsService;

@WebServlet("/GoodsServlet")
public class GoodsServlet extends BaseServlet {

	//添加商品
	public String add(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		//获取所有参数
		Map<String, String[]> parameterMap = request.getParameterMap();
		System.out.println(parameterMap);
		//把参数封装对象
		Goods goods = new Goods();
		try {
			BeanUtils.populate(goods, parameterMap);
			goods.setImage("goods_11.png");
			System.out.println(goods);
			//调用服务层
			GoodsService goodsService = new  GoodsService(); 
			goodsService.addGoods(goods);
			//跳转列表，
			return "/GoodsServlet?action=getListGoods";
			
		}  catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	
	
	// 添加商品UI
	public String addUI(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		//1.取出所有的分类  
		 CategoryService categoryService = new CategoryService();
		 try {
			List<Category> allCategory = categoryService.findCategory();
			//2.把分类存域 当中
			request.setAttribute("allCategory", allCategory);
			System.out.println(allCategory);
			//3.转发add.jsp
			return  "admin/add.jsp";
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return null;
	}
	// 编辑商品
	public String edit(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		request.setCharacterEncoding("utf-8");
		// 1.获取所有的参数
		Map<String, String[]> parameterMap = request.getParameterMap();
		Goods goods = new Goods();
		// 2.封装成goods对象
		try {
			BeanUtils.populate(goods, parameterMap);
			// 3.根据id更新数据
			System.out.println(goods);
			// 4.调用服务层，更新数据
			GoodsService goodsService = new GoodsService();
			goods.setImage("goods_10.png");
			goodsService.updateGoods(goods);
			// 5.跳转回main.jsp 列表
			return "/GoodsServlet?action=getListGoods";
		} catch (Exception e) {
			e.printStackTrace();
		}

		return null;
	}

	// 编辑商品UI
	public String editUI(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// 获取当前商品的id
		String id = request.getParameter("id");
		try {
			// 1.获取当前商品
			GoodsService goodsService = new GoodsService();
			Goods goods = goodsService.getGoodsWithId(id);
			// 把商品写到域
			request.setAttribute("goods", goods);
			// 2.获取所有的分类
			CategoryService categoryService = new CategoryService();
			List<Category> allCategory = categoryService.findCategory();
			request.setAttribute("allCategory", allCategory);
			// 转发到edit.jsp
			return "/admin/edit.jsp";

		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	// 删除商品
	public String delGoods(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// 1.接收参数 id
		String id = request.getParameter("id");
		// 2.调用服务层，让其删除商品
		GoodsService goodsService = new GoodsService();
		try {
			goodsService.deleteGoods(id);
			return "/GoodsServlet?action=getListGoods";
		} catch (Exception e) {
			e.printStackTrace();
		}

		return null;
	}

	// 获取所有的商品
	public String getListGoods(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// 1.调用服务层
		GoodsService goodsService = new GoodsService();
		try {
			List<Goods> allGoods = goodsService.getAllGoods();
			// 对集合进行反转
			Collections.reverse(allGoods);
			// 把数据写到request域
			request.setAttribute("allGoods", allGoods);
			// 转发
			return "admin/main.jsp";
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

}
