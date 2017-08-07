package com.websystique.springmvc.configuration;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletResponse;


public class CORSFilter implements Filter {

	public void doFilter(ServletRequest req, ServletResponse res, FilterChain chain) throws IOException, ServletException {
		HttpServletResponse response = (HttpServletResponse) res;
		// 가장 중요함 * 모든 도메인에 대해 CORS 를 허용하겠다는 것.
		// 특정 도메인만할경우 ex)
		//response.addHeader("Access-Control-Allow-Origin", "http://www.jhun.co.kr");
		response.setHeader("Access-Control-Allow-Origin", "*");
		response.setHeader("Access-Control-Allow-Methods", "POST, GET, PUT, OPTIONS, DELETE");
		// 요청의 CORS에 대해 3600 (1시간) 동안 캐싱하여 재설정을 하지 않겟다는 내용.
		response.setHeader("Access-Control-Max-Age", "3600");
		// AJAX 통신으로 전달 되는 것을 알리기 위한 response
		response.setHeader("Access-Control-Allow-Headers", "X-requested-with, Content-Type");
		chain.doFilter(req, res);
	}

	public void init(FilterConfig filterConfig) {}

	public void destroy() {}

}