package com.xworkz.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet(loadOnStartup = 1,urlPatterns="/callLocation")
public class Location extends HttpServlet{
	
	public Location() {
		System.out.println("Creating.."+getClass().getName());	
		}
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("Inside doPost method...");
		String name=req.getParameter("name");
		String pin=req.getParameter("pin");
		String startingPoint = req.getParameter("startingPoint");
		String reachingTime = req.getParameter("reachingTime");
		
		System.out.println("The Name of the Location : "+name+" Pincode of the location : "+pin+" StartingPoint is : "+startingPoint+" Reaching Time : "+reachingTime);
	
	PrintWriter print =	resp.getWriter();
	print.print(name);
	print.print(pin);
	print.print(startingPoint);
	print.print(reachingTime);
	
	print.print("<html>");
	print.print("<body>");
	if(name.length()>=3 && pin.length()>=3 && startingPoint.length()>=3 && reachingTime.length()>=3) {
	print.print("<h1 style='color:Green'>");
	print.print("The entered Data is valid And Is being Saved");
	print.print("</h1>");
	}
	else {
		print.print("<h1 style='color:Red'>");
		print.print("The Entered data is invalid");
		print.print("</h1>");
		print.print("<a href=\"index.html\"><input type=\"submit\" value=\" Home \" > </a>");
	}
	print.print("</body>");
	print.print("</html>");
		
	}
	
	
}
