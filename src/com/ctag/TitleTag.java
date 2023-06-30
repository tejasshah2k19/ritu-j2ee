package com.ctag;

import java.io.IOException;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.BodyContent;
import javax.servlet.jsp.tagext.BodyTagSupport;

public class TitleTag extends BodyTagSupport {

	BodyContent bodyContent;

	@Override
	public int doStartTag() throws JspException {
		// TODO Auto-generated method stub
		System.out.println("doStartTAg");
		return EVAL_BODY_BUFFERED;// init
	}

	@Override
	public void doInitBody() throws JspException {
		// TODO Auto-generated method stub
		System.out.println("doInitBody");
	}

	@Override
	public void setBodyContent(BodyContent b) {
		System.out.println("setBodyContent");
		this.bodyContent = b;
	}

	@Override
	public int doAfterBody() throws JspException {
		System.out.println("doAfterBody");
		JspWriter out = bodyContent.getEnclosingWriter();
		try {
			String content = bodyContent.getString();
			String x[] = content.split(" ");

			for (String s : x) {
				StringBuffer sb = new StringBuffer(s);
				if (s.charAt(0) >= 'a' && s.charAt(0) <= 'z') {
					char t = s.charAt(0);
					sb.deleteCharAt(0);
					sb.insert(0, (char)(t - 32));
				}
				out.print(sb+" ");
			}

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return EVAL_BODY_INCLUDE;
	}

	@Override
	public int doEndTag() throws JspException {
		System.out.println("DoEndtag");
		return EVAL_PAGE;
	}
}
