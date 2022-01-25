package com.stone.springmvc.env;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

public class 로그인확인자 extends HandlerInterceptorAdapter{

	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		
		HttpSession session = request.getSession(false);
		boolean 로그인중 = false;
		
		if(session != null && session.getAttribute("conven_session_id") != null) {
			로그인중 = true;
		}
		
		if(!로그인중) {
			response.sendRedirect("/login");
			return 로그인중;
		}
		
		return 로그인중;
	}
}
