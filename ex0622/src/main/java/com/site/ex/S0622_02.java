package com.site.ex;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
					
@WebServlet("/S02") 
public class S0622_02 extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("Servlet page in connected");
		
		response.setContentType("text/html;charset=utf-8");
		PrintWriter pw = response.getWriter();

		pw.println("<html>");
		pw.println("<head>");
		pw.println("<title>S02 page</title>");
		pw.println("</head>");
		pw.println("<body>");
		pw.println("<h2>open to S02 page</h2>");
		pw.println("<p><a href = './movie/movie.jsp'>next page</a></p>");
		pw.println("</body>");
		pw.println("</html>");
		pw.close();
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

}

}
