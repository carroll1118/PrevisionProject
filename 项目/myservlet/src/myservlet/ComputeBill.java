package myservlet;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
//@WebServlet("/ComputeBill")
public class ComputeBill extends HttpServlet {
	private static final long serialVersionUID = 1L;
    public ComputeBill() 
    {
        super();
    }

	public void init(ServletConfig config) throws ServletException 
	{
		super.init(config);
	}
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html; charset=UTF-8");	
		PrintWriter out=response.getWriter();
		out.println("<html><body  bgcolor=yellow>");		
		String str=request.getParameter("billMess");
		if(str==null||str.length()==0)
		return;
	String []price=str.split("[^0123456789.]+");
	double sum=0;
	try {
		for(int i=0;i<price.length;i++) {
			if(price[i].length()>=1)
				sum+=Double.parseDouble(price[i]);
		}
	}
	catch(NumberFormatException e) {
		out.print(""+e);
	}
	out.print("\""+str+"\"<br>的消费额："+sum+"元");
	out.println("</body></html>");
		
	}

}
