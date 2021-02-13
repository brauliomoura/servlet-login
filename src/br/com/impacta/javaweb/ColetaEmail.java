package br.com.impacta.javaweb;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.impacta.javaweb.bean.Usuario;

/**
 * Servlet implementation class ColetaEmail
 */
@WebServlet("/coletaEmail")
public class ColetaEmail extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		Usuario usuario = (Usuario) request.getSession().getAttribute("usuario");
		
		out.println("<html><head>");
		out.println("<title>Cadastro de Email</title>");
		out.println("<body>");
		out.println("<H2>" + usuario.getLogin() + " informe seu email: </h2><br/>");
		out.println("<form method=\"post\" action=\"adicionaEmailCookie\">");
		out.println("Email: <br/> <input type=\"text\" name=\"email\" size=\"80\"> <br/>");
		out.println("<p> <input type=\"Submit\" value=\"Enviar\"> </p>");
		out.println("</form>");
		out.println("</body>");
		out.println("</html>");

	}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

}
