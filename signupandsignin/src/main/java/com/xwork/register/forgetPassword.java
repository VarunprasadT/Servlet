package com.xwork.register;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(loadOnStartup = 3,urlPatterns="/callFor")
public class forgetPassword  extends HttpServlet{

	public forgetPassword() {
		System.out.println("Creating..."+getClass().getName());
	}
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String email=req.getParameter("email");
		
		PrintWriter print = resp.getWriter();
		print.print("<html>");
		print.print("<body>");
		if(email.length()>5) {
			print.print("<h1 style='color:Green'>");
			print.print("Search Sucessfull");
			print.print("</h1>");
		}
		else {
		print.print("<h1 style='color:red'>");
		print.print("Invalid Email Id");
		print.print("</h1>");
	}
		print.print("</body>");
		print.print("</html>");
		
		resp.setContentType("text/html");
	}
	
}
