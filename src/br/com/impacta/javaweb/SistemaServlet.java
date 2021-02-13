package br.com.impacta.javaweb;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.impacta.javaweb.bean.Usuario;

/**
 * Servlet implementation class SistemaServlet
 */
@WebServlet("/sistema")
public class SistemaServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		Usuario usuario = (Usuario) request.getSession().getAttribute("usuario");
		
				
		StringBuilder sb = new StringBuilder("<H1>Bem vindo " + usuario.getLogin() + "!</H1><p>");
		sb.append("<H2>Esta � a p�gina principal do sistema</H2>");
		
		response.getWriter().append(sb.toString());
		
	}

}
