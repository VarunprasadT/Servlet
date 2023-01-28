package com.xwork.register;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(loadOnStartup = 2,urlPatterns="/callSignIn")
public class SignIn extends HttpServlet{

	public SignIn() {
		System.out.println("Creating..."+getClass().getName());
	}
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	String name =req.getParameter("userName");
	String password = req.getParameter("password");
	
	System.out.println("Name :"+name+" password :"+password);
	
	PrintWriter print = resp.getWriter();
	print.print("<html>");
	print.print("<body>");
	if(name.length()>3 && password.length()>5) {
	print.print("<h1 style='color:Green'>");
	print.print("Login Sucessfull..");
	print.print("</h1>");
	}
	else {
		print.print("<h1 style='color:red'>");
		print.print("UnSucessfull Attempt");
		print.print("</h1>");
	}
	resp.setContentType("text/html");
}
}
 