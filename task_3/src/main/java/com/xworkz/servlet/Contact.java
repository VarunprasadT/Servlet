package com.xworkz.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(loadOnStartup=2,urlPatterns="/callContact")

public class Contact extends HttpServlet{

		public Contact() {
			System.out.println("Creating.."+getClass().getName());
		}
		
		@Override
		protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("Inside dopost Method Contact");
		String name= req.getParameter("name");
		String email=req.getParameter("email");
		String mobileNumber=req.getParameter("mobileNumber");
		String gender=req.getParameter("gender");
		
		System.out.println("Entered Name : "+name+"/nEntered E-mail : "+email+"/nEntered Mobile Number : "+mobileNumber+"/nGender : "+gender);
		
		PrintWriter print =resp.getWriter();
		
		print.print("<html>");
		print.print("<body>");
		if(name.length()>=3 && mobileNumber.length()>=3 && email.length()>=3 && gender.isEmpty()==false) {
		print.print("<h1 Style='color:Green'>");
		print.print("Entered details Are valid");
		print.print("</h1>");
		}
		else {
			print.print("<h1 style='color:Red'>");
			print.print("Enetred details are Invalid");
			print.print("</h1>");
		}
}
}
