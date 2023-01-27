import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet(loadOnStartup = 1,urlPatterns="/call")
public class King extends HttpServlet{

	public King() {
		System.out.println("Hi..");

	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("Inside DoGet Method...");
	String name=req.getParameter("KingName");
	String kingdom = req.getParameter("Kingdom");
	String numberofQueens=req.getParameter("NumberOfQueens");
	String phoneNumber=req.getParameter("PhoneNumber");
	
	System.out.println("King Name : "+name+" Kingdom : "+kingdom+" Number Of Queens : "+numberofQueens+" PhoneNumber :"+phoneNumber);
	
	PrintWriter print = resp.getWriter();
	print.print("<html>");
	print.print("<body>");
	print.print("<span>");
	
	System.out.println("The King details is being saved ");
	print.print("</span>");
	print.print("</body>");
	print.print("</html>");
	
	resp.setContentType("text/html");
	}

}
