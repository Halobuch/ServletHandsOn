package com.servlet.homework;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class AdminServlet
 */
@WebServlet("/AdminServlet")
public class AdminServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private ServletContext context;

	
	 
	
	public void init(ServletConfig config) throws ServletException {
		context = config.getServletContext();
		
	}

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String email = request.getParameter("userEmail");
		if(context.getAttribute("user") != null) {
			context.removeAttribute("user");
		}
		
		context.setAttribute("user", email);
		email = (String) context.getAttribute("user");
		PrintWriter out = response.getWriter();
		out.print("<html><head>");
		out.print("</head>");
		out.print("<body>");
		out.print("<p style=\" position: absolute; bottom: 0; left: 0; width: 100%; text-align: center;\">Copy right Cognizant Technology solution. Webmaster: "+email+"</p>");
		out.print("</body> </html>");
	}



}
