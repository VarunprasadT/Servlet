package com.xwork.register;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(loadOnStartup=1,urlPatterns="/callSignUp")
public class SignUp extends HttpServlet{
	
	public SignUp() {
		System.out.println("Creating.."+getClass().getName());
	}
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("Inside doGet method...");
		String name = req.getParameter("userName");
		String email = req.getParameter("email");
		String password = req.getParameter("password");
		String rPassword = req.getParameter("rPassword");
		System.out.println("User name :"+name+"Email :"+email+"password :"+password+" Confirm Password : "+rPassword);
		PrintWriter print =resp.getWriter();
	
		print.print("<html>");
		print.print("<body>");
		if(name.length()>=3 && email.length()>=5 && password.contentEquals(rPassword)) {
		print.print("<h1 style='color:Green'>");
		print.print("You have Sucessfully SignedUp");
		print.print("</h1>");
		}
		else {
			print.print("<h1 style='color:Red'>");
			print.print("Details are Invalid");
			print.print("</h1>");
			print.print("<a href=\"signUp.html\">\"Click Here to Regeister\"</a>");
		}
		resp.setContentType("text/html");
	}
}
