package com.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class SignupServlet extends HttpServlet {

	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		System.out.println("inSide SignupServlet");
		
		String firstName= request.getParameter("firstName");
		String email = request.getParameter("email");
		String password = request.getParameter("password");
		
		//print on the browser --> 
		
		//old - 1947 -> print writer -> 

		//how to send response ? 
		
		response.setContentType("text/html");//html -> MIME 
	
		//open stream -> server - client 
		
		PrintWriter out = response.getWriter(); // stream -> server-->client 
		
		out.print("<html><body>");
		out.print("FirstName : "+firstName+"<br>");
		out.print("Email : "+email+"<br>");
		out.print("Password : "+password+"<br>");
		out.print("</body></html>");
	}
}
