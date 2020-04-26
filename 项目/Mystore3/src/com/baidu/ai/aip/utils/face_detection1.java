
package com.baidu.ai.aip.utils;

import java.io.IOException;
import java.sql.SQLException;
import java.util.*;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;

import net.sf.json.JSONObject;

import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.it666.domain.User;
import com.it666.utils.JdbcUtil;

/**
* ��������
*/
@WebServlet("/Face_login")
public class face_detection1 extends HttpServlet{

    /**
    * ��Ҫ��ʾ���������蹤����
    * FileUtil,Base64Util,HttpUtil,GsonUtils���
    * https://ai.baidu.com/file/658A35ABAB2D404FBF903F64D47C1F72
    * https://ai.baidu.com/file/C8D81F3301E24D2892968F09AE1AD6E2
    * https://ai.baidu.com/file/544D677F5D4E4F17B4122FBD60DB82B3
    * https://ai.baidu.com/file/470B3ACCA3FE43788B5A963BF0B625F3
    * ����
    */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//��ȡ�û���������
		
		
		String face_name = null;
		
		try {
			Thread.sleep(1000);
			face_name=search();
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		if(face_name.equals("GGQ"))
		{
			face_name="������";
		}
		else if(face_name.equals("LHB"))
		{
			face_name="�κ���";
		}
		else if(face_name.equals("LSM"))
		{
			
			face_name="��ɽ��";
		}
		System.out.println(face_name);
		
		
		
		
		
		
	}
	
	
    public static  String search() {
        // ����url
        String url = "https://aip.baidubce.com/rest/2.0/face/v3/search";
        try {
        	byte[] bytes1 = FileUtil.readFileByBytes("D:\\img\\liao.png");
        	String image1 = Base64Util.encode(bytes1);
            Map<String, Object> map = new HashMap<>();
            map.put("image", image1);
            map.put("liveness_control", "NORMAL");
            map.put("group_id_list", "test_one");
            map.put("image_type", "BASE64");
//            map.put("", "test_one");
           
//            map.put("image_type", "FACE_TOKEN");
            map.put("quality_control", "LOW");

            String param = GsonUtils.toJson(map);

            // ע�������Ϊ�˼򻯱���ÿһ������ȥ��ȡaccess_token�����ϻ���access_token�й���ʱ�䣬 �ͻ��˿����л��棬���ں����»�ȡ��
            String accessToken = "24.12f47f8f69d4c61c0595e9608affd77d.2592000.1569938591.282335-17156086";

            String result = HttpUtil.post(url, accessToken, "application/json", param);
            
            System.out.println(result);
            
            JSONObject json = JSONObject.fromObject(result);
   
            String result1=json.getString("result");
            
            
            JSONObject json1 = JSONObject.fromObject(result1);
       
           String  name1=json1.getString("user_list");
          
            
            
            JSONObject json2= JSONObject.fromObject(json1);
            
            System.out.println(json2.getString("user_id"));
            
            String face_name=json2.getString("user_id");

            
          
            return face_name;
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
    public static void main(String[] args) {
		search();
	}
   
}
