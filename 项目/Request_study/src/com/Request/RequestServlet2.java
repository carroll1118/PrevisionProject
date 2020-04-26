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
		
		//����ʹ�õ��ύ����ֻ����post   get������Ҳû��Ч��
		request.setCharacterEncoding("UTF-8");
		//��ȡ���Ե��������
		Map<String, String[]> allP = request.getParameterMap();
		// �ѻ�ȡ��������� ��װ�ɶ���    �������ֱ�Ӵ浽���ݿ���
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
