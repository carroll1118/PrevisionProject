package myservelt;

import java.io.*;
import java.sql.*;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import mybean.*;

public class HandelRegister extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
    public HandelRegister() {
        super();
        // TODO Auto-generated constructor stub
    }

	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
		super.init(config);
     try{
        Class.forName("com.mysql.jdbc.Driver");
        }
    catch(Exception e) {}
	}

	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html; charset=UTF-8");
		response.setCharacterEncoding("UTF-8");
		Connection con;
		PreparedStatement  sql;
		Register reg=new Register();
		request.setAttribute("register", reg);
		String  logname=request.getParameter("logname").trim(),

			      password=request.getParameter("password" ).trim(),

			      email=request.getParameter("email ").trim();
		       if(logname==null)
			      logname="";

		      if (password==null)
			      password="";

			      boolean isLD=true;

			      boolean    boo=logname.length()>0&&password.length()>0&&isLD;

			      String backNews="";
			      try {
			    String uri="jdbc:mysql://127.0.0.1:3306/test?"+"user=root&password=123456&characterEncoding=utf-8";

                 con=DriverManager.getConnection(uri);

			      String insertCondition= "INSERT INTO userVALUES (?, ?, ?)";

			      sql=con.prepareStatement (insertCondition) ;

			      if(boo) {

			      sql.setString(1, logname);

			      sql.setString (2, password);

			      sql.setString(3, email);
			      
			      int m=sql.executeUpdate () ;
			      if(m!=0) {
			    	  backNews="注册成功";
			    	  reg.setBackNews (backNews);
			    	  reg.setLogname (logname);
			    	  reg.setPassword (password);
			    	  reg.setEmail (email);
			      }
			   }

			    	  else{
			    	  backNews="信息填写不完整或名字中有非法字符";
			    	  reg. setBackNews (backNews);
			    	  }
			    	  sql.close();
			    	  con.close();
			      }
			    	  catch(SQLException exp) {
			    	  backNews="该名字已被使用，请您更换名字 "+exp;
			    	  reg.setBackNews (backNews);
			    	  }
			    	  RequestDispatcher dispatcher=
			    	  request.getRequestDispatcher("show.jsp");
			    	  dispatcher.forward (request, response);
	          }


}
