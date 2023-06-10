package com.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/AddUserServlet")
public class AddUserServlet extends HttpServlet {

	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String firstName = request.getParameter("firstName");
		String email = request.getParameter("email");
		String password = request.getParameter("password");

		boolean isError = false; // there is no error initially
		String error = "";
		if (firstName == null || firstName.trim().length() == 0) {
			isError = true;
			error += "Please Enter FirstName<br>";
			request.setAttribute("firstNameError", "Please Enter FirstName");
		} else {
			request.setAttribute("firstNameValue", firstName);
		}

		if (email == null || email.trim().length() == 0) {
			isError = true;
			error += "Please Enter Email<br>";
			request.setAttribute("emailError", "Please Enter Email");
		} else {
			request.setAttribute("emailValue", email);
		}

		if (password == null || password.trim().length() == 0) {
			isError = true;
			error += "Please Enter Password<br>";
			request.setAttribute("passwordError", "Please Enter Password");
		}

		if (isError) {

			request.setAttribute("error", error);// key , value

			RequestDispatcher rd = request.getRequestDispatcher("AddUser.jsp");// dispatch to Registration.html
			rd.forward(request, response);// go

		} else {
			// goto login page
		}

	}
}
