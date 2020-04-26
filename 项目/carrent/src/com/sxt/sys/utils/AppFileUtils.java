package com.sxt.sys.utils;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.net.URLEncoder;
import java.util.Properties;

import javax.servlet.http.HttpServletResponse;

import org.apache.commons.io.FileUtils;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;

public class AppFileUtils {
	
	/**
	 * 寰楀埌鏂囦欢涓婁紶鐨勮矾寰�
	 */
	public static String PATH="D:/upload/";
	static {
		InputStream stream = AppFileUtils.class.getClassLoader().getResourceAsStream("file.properties");
		Properties properties=new Properties();
		try {
			properties.load(stream);
			PATH=properties.getProperty("path");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	

	/**
	 * 鏂囦欢涓嬭浇
	 * @param response
	 * @param path
	 * @param oldName
	 * @return
	 */
	public static  ResponseEntity<Object> downloadFile(HttpServletResponse response, String path, String oldName) {
		//4,浣跨敤缁濆璺緞+鐩稿璺緞鍘绘壘鍒版枃浠跺璞�
		File file=new File(AppFileUtils.PATH,path);
		//5,鍒ゆ柇鏂囦欢鏄惁瀛樺湪
		if(file.exists()) {
			try {
				try {
					//濡傛灉鍚嶅瓧鏈変腑鏂� 瑕佸鐞嗙紪鐮�
					oldName=URLEncoder.encode(oldName, "UTF-8");
				} catch (Exception e) {
					e.printStackTrace();
				}
				//鎶奻ile杞垚涓�涓猙ytes
				byte [] bytes=FileUtils.readFileToByteArray(file);
				HttpHeaders header=new HttpHeaders();
				//灏佽鍝嶅簲鍐呭绫诲瀷(APPLICATION_OCTET_STREAM 鍝嶅簲鐨勫唴瀹逛笉闄愬畾)
				header.setContentType(MediaType.APPLICATION_OCTET_STREAM);
				//璁剧疆涓嬭浇鐨勬枃浠剁殑鍚嶇О
				header.setContentDispositionFormData("attachment", oldName);
				//鍒涘缓ResponseEntity瀵硅薄
				ResponseEntity<Object> entity=
						new ResponseEntity<Object>(bytes, header, HttpStatus.CREATED);
				return entity;
			} catch (Exception e) {
				e.printStackTrace();
			}
			return null;
		}else {
			PrintWriter out;
			try {
				out = response.getWriter();
				out.write("鏂囦欢涓嶅瓨鍦�");
				out.flush();
				out.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return null;
		}
	}


	/**
	 * 鏍规嵁鐩稿璺緞鍒犻櫎纭洏涓婃枃浠�
	 * @param path2
	 */
	public static void deleteFileUsePath(String path) {
		String realPath=PATH+path;
		//鏍规嵁鏂囦欢
		File file=new File(realPath);
		if(file.exists()) {
			file.delete();
		}
	}
}
