package myServlet1;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/PassParam")
public class PassParam extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private PrintWriter PrintWriter;
       
  
    public PassParam() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter  out=response.getWriter();    
		out.write("doGet\r\n");
		out.write(request.getParameter("param1"));
		out.write("\r\n");
		out.write(request.getParameter("param2"));
		out.write("\r\n");
	    out.write(request.getParameter("param3"));
		out.write("\r\n");
		
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
