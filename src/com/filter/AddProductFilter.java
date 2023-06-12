package com.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

import com.util.Validators;

public class AddProductFilter implements Filter {

	public void init(FilterConfig arg0) throws ServletException {

	}

	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		String name = request.getParameter("name");
		String price = request.getParameter("price");
		String qty = request.getParameter("qty");

		boolean isError = false;

		if (Validators.isEmpty(name)) {
			request.setAttribute("nameError", "Please Enter Name");
			isError = true;
		}
		if (Validators.isEmpty(price)) {
			request.setAttribute("priceError", "Please Enter Price");
			isError = true;
		} else if (Validators.isDigit(price) == false) {
			request.setAttribute("priceError", "Please Enter Valid Price");
			isError = true;
		}
		// qty

		if (isError == true) {
			// goback
			request.getRequestDispatcher("AddProduct.jsp").forward(request, response);
		} else {
			chain.doFilter(request, response); // goto next filter or servlet 
		}
	}

	public void destroy() {

	}
}
