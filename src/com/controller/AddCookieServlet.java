package com.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/AddCookieServlet")
public class AddCookieServlet extends HttpServlet {

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String cookieName = request.getParameter("cookieName");
		String cookieValue = request.getParameter("cookieValue");

		Cookie c = new Cookie(cookieName, cookieValue);
		c.setMaxAge(60*60*24*7);
		response.addCookie(c);
		
		response.sendRedirect("index.jsp");//
	}
}
