package com.xworkz.panda;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet(loadOnStartup=1,urlPatterns="/call")
public class Panda extends HttpServlet{
	public Panda() {
		System.out.println("Creating..."+getClass().getName());
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("inside doPost method...");
		String alp ="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String spCh="~!@#$%^&*_";
		String dot=".";
		String name = req.getParameter("name");
		String email= req.getParameter("email");
		String phoneNumber = req.getParameter("number");
		String password = req.getParameter("password");
		String confirmPassword = req.getParameter("confirmPassword");
		
	if(alp.contains(name.subSequence(0, 1)) &&name.length()>=5 &&password.contains("@")&& password.length()>=8 && password.contentEquals(confirmPassword)) {
		System.out.println("Name : "+name+"\nE-mail : "+email+"\nPhone Number : "+phoneNumber+"\npassword : "+password+"\nconfirmPassword : "+confirmPassword);
		RequestDispatcher dispatcher=req.getRequestDispatcher("display.jsp");
		req.setAttribute("name", name);
		req.setAttribute("email", email);
		req.setAttribute("phoneNumber", phoneNumber);
		req.setAttribute("password", password);
		req.setAttribute("confirmPassword", confirmPassword);
		dispatcher.forward(req, resp);
		}
		else {
			System.out.println("Entered Details are Invalid");
			PrintWriter print = resp.getWriter();
			print.print("<html>");
			print.print("<body>");
			print.print("<h1 style='color:red'>");
			print.print("Entered details are not correct");
			print.print("</h1>");
			print.print("</body>");
			print.print("</html>");
		}
		
		
		
		
	}
}
