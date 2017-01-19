package com.huayu.servletDemo;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class EncodingFilter implements Filter {
	private String charset;

	@Override
	public void destroy() {
		// TODO Auto-generated method stub

	}

	@Override
	public void doFilter(ServletRequest arg0, ServletResponse arg1,
			FilterChain arg2) throws IOException, ServletException {
		   arg0.setCharacterEncoding(this.charset); //…Ë÷√Õ≥“ª±‡¬Î
		   System.out.println(this.charset);

	}

	@Override
	public void init(FilterConfig arg0) throws ServletException {
		
		this.charset=arg0.getFilterName();
		

	}

}
