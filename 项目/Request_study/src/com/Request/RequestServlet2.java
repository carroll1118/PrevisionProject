package com.Request;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.beanutils.BeanUtils;


@WebServlet("/RequestServlet2")
public class RequestServlet2 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//现在使用的提交方法只适用post   get不能用也没有效果
		request.setCharacterEncoding("UTF-8");
		//获取所以的请求参数
		Map<String, String[]> allP = request.getParameterMap();
		// 把获取的请求参数 封装成对象    对象可以直接存到数据库中
		for(Map.Entry<String, String[]> entry : allP.entrySet()){
			System.out.println("------------");
			System.out.println(entry.getKey() + ":" +Arrays.toString(entry.getValue()));
		}
		
		User u = new  User();
		try {
			BeanUtils.populate(u, allP);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(u);
		
		
		
	}

}
