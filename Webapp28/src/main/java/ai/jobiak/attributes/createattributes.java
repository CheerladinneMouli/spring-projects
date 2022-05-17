package ai.jobiak.attributes;

import java.io.IOException;
import java.io.PrintWriter;

import javax.naming.Context;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.swing.text.AbstractDocument.Content;

/**
 * Servlet implementation class createattributes
 */
@WebServlet("/attribute")
public class createattributes extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public createattributes() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out=response.getWriter();
		ServletContext context = getServletContext();
		context.setAttribute("dbName","mySQL");//the context will be alive till the application is run on server
		context.setAttribute("dbVersion","8.0.28");//the context attributes will be available to all servlets 
		
		request.setAttribute("tomcat","9.0");
		request.setAttribute("os","windows 10");
		RequestDispatcher dispatcher = context.getRequestDispatcher("/readattribute");
		dispatcher.include(request, response);
	}

}
