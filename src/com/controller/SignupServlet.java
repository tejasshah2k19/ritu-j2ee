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

		String firstName = request.getParameter("firstName");
		String email = request.getParameter("email");
		String password = request.getParameter("password");

		// print on the browser -->

		// old - 1947 -> print writer ->

		// how to send response ?

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

		response.setContentType("text/html");// html -> MIME

		// open stream -> server - client

		PrintWriter out = response.getWriter(); // stream -> server-->client

		out.print("<html><body>");

		if (isError == true) {
			out.print("<font color='red'>"+error+"</font>");
			
			
		} else {

			out.print("FirstName : " + firstName + "<br>");
			out.print("Email : " + email + "<br>");
			out.print("Password : " + password + "<br>");

		}
		out.print("</body></html>");
	}
}
