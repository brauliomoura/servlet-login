package br.com.impacta.javaweb;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class AdicionaEmailCookieServlet
 */
@WebServlet("/adicionaEmailCookie")
public class AdicionaEmailCookieServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String email = request.getParameter("email");
		Cookie cookEmail = new Cookie("email",email);
		response.addCookie(cookEmail);
		
		response.sendRedirect("http://localhost:8080/servlet-login/login.html");
	
	}

}


















