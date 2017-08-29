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
 * Servlet implementation class ShareHome
 */
@WebServlet("/ShareHome")
public class ShareHome extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private String email = "Nothing yet";
	private ServletContext context;

	
	public void init(ServletConfig config) throws ServletException {
		context = config.getServletContext();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		email = (String) context.getAttribute("user");
		PrintWriter out = response.getWriter();
		out.print("<html><head>");
		out.print("</head>");
		out.print("<body>");
		out.print("<h1>HELLO</h1>");
		out.print("<p style=\" position: absolute; bottom: 0; left: 0; width: 100%; text-align: center;\">Copy right Cognizant Technology solution. Webmaster: "+email+"</p>");
		out.print("</body> </html>");
	}

}
