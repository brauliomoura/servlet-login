package br.com.impacta.javaweb;

import java.io.IOException;

import javax.servlet.DispatcherType;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.impacta.javaweb.bean.Usuario;

/**
 * Servlet Filter implementation class FiltroDeAutenticacao
 */
@WebFilter(dispatcherTypes = {
				DispatcherType.REQUEST, 
				DispatcherType.FORWARD
		}
					, urlPatterns = { "/sistema" })
public class FiltroDeAutenticacao implements Filter {

    
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		
		HttpServletRequest req = (HttpServletRequest) request;
		HttpServletResponse res = (HttpServletResponse) response;
		
		Usuario user = (Usuario) req.getSession().getAttribute("usuario");
		
		if(user != null) {
			chain.doFilter(request, response);	
		}else {
			res.sendRedirect("http://localhost:8080/servlet-login/login.html");
		}
	}
}










