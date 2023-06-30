package com.stag;

import java.io.IOException;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.tagext.SimpleTagSupport;

public class SqrTag extends SimpleTagSupport {

	int num; // attribute

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public void doTag() throws JspException, IOException {

		getJspContext().getOut().print(num*num);
	}
}
