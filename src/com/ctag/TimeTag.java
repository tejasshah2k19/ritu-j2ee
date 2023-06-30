package com.ctag;

import java.io.IOException;
import java.time.LocalTime;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.TagSupport;

public class TimeTag extends TagSupport {

	// <time></time>
	@Override
	public int doStartTag() throws JspException {
		LocalTime lt = LocalTime.now();
		JspWriter out = pageContext.getOut();
		try {
			out.print(lt);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return SKIP_BODY; //Body 
	}

	@Override
	public int doEndTag() throws JspException {
		return EVAL_PAGE;//page execution
		//SKIP_PAGE
	}
}
