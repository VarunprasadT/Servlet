package com.xwork.task_using_jsp;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet(loadOnStartup = 1, urlPatterns="/call")                                                      
public class Login_jsp  extends HttpServlet{

	public Login_jsp() {
		System.out.println("Creating..."+getClass().getName());
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("Inside doPost Method..");
		String fname=req.getParameter("fname");
		String lname = req.getParameter("lname");
		String email = req.getParameter("email");
		String gender = req.getParameter("gender");
		String address = req.getParameter("address");
		String reason = req.getParameter("reason");
		
		System.out.println("First_name : "+fname+" Last_Name : "+lname+" E-mail : "+email+" Gender : "+gender);
		

		RequestDispatcher dispatch=	req.getRequestDispatcher("Display.jsp");
		req.setAttribute("fname", fname);
		req.setAttribute("lname", lname);
		req.setAttribute("email", email);
		req.setAttribute("gender", gender);
		req.setAttribute("address", address);
		req.setAttribute("reason", reason);
		dispatch.forward(req, resp);
	}
}
