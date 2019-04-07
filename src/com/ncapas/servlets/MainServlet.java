package com.ncapas.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class MainServlet
 */
@WebServlet("/MainServlet")
public class MainServlet extends HttpServlet {
	
	//Datos quemados
	private static final String username = "lord_of_darkness88";
	private static final String password = "1234";
	
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MainServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		// Primero obtenemos los datos 
		String input_username = request.getParameter("usr");
		String input_password = request.getParameter("pwd");
		
		PrintWriter out = response.getWriter();
		
		//Testing
		System.out.println("Nombre: " + username);
		System.out.println("Length expected: " + username.length());
		System.out.println("Length received: " + input_username.length());
		System.out.println("Nombre: " + password);
		System.out.println("Length expected: " + password.length());
		System.out.println("Length received: " + input_password.length());

		System.out.println(input_username.equals(username));
		System.out.println(input_password.equals(password));
		
		if(input_username.equals(username) && input_password.equals(password)) {
			out.println("<html>");
			out.println("<body>");
			out.println("<h1> <font color=\"green\">Bienvenido, </font> lord_of_darkness88. </h1>");
			out.println("</body>");
			out.println("</html>");
		} else {
			out.println("<html>");
			out.println("<body>");
			out.println("<h1> <font color=\"red\">Error:</font> los datos ingresados no son correctos. </h1>");
			out.println("</body>");
			out.println("</html>");
		}	
	}

}
