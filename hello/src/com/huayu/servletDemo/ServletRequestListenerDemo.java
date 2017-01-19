package com.huayu.servletDemo;

import javax.servlet.ServletRequestEvent;
import javax.servlet.ServletRequestListener;

public class ServletRequestListenerDemo implements ServletRequestListener {

	@Override
	public void requestDestroyed(ServletRequestEvent event) {
		System.out.println("***requestœ˙ªŸ°£ http://" + event.getServletRequest().getRemoteAddr()
                + event.getServletContext().getContextPath());

	}

	@Override
	public void requestInitialized(ServletRequestEvent event) {
		System.out.println("***request≥ı ºªØ°£ http://" + event.getServletRequest().getRemoteAddr()
				                                     + event.getServletContext().getContextPath());
	}

}
