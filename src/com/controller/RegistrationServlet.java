package com.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class RegistrationServlet extends HttpServlet

{

	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("inSide SignupServlet");

		String firstName = request.getParameter("firstName");
		String email = request.getParameter("email");
		String password = request.getParameter("password");
 
		boolean isError = false; // there is no error initially
		String error = "";
		if (firstName == null || firstName.trim().length() == 0) {
			isError = true;
			error += "Please Enter FirstName<br>";
		}

		
		if (email == null || email.trim().length() == 0) {
			isError = true;
			error += "Please Enter Email<br>";
		}

		if (password == null || password.trim().length() == 0) {
			isError = true;
			error += "Please Enter Password<br>";
		}

		if(isError) {
			//goto signup page 
		
			//below is helpful to navigate from servlet to XYZ resource [ Registration.html ] 
			RequestDispatcher rd = request.getRequestDispatcher("Registration.html");//dispatch to Registration.html 
			rd.forward(request, response);//go 
		
		}else {
			//goto login page
		}
 
	}
}
