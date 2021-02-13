package br.com.impacta.javaweb;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
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
		
		if(usuario.getEmail() == null || usuario.getEmail().isBlank()) {
			//encaminhar a requisição para a servlet /coletaEmail
			RequestDispatcher rd = request.getRequestDispatcher("/coletaEmail");
			rd.forward(request, response);
		}
				
						
		StringBuilder sb = new StringBuilder("<H1>Bem vindo " + usuario.getLogin() + "!</H1><p>");
		sb.append("<H2>Esta é a página principal do sistema</H2>");
		sb.append("<h3>Seu email cadastrado é: " + usuario.getEmail() + "</h3>");
		
		response.getWriter().append(sb.toString());
		
	}
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request,response);
	}

}
