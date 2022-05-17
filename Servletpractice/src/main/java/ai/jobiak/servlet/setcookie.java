package ai.jobiak.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class setcookie
 */
@WebServlet("/set")
public class setcookie extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public setcookie() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		response.setContentType("html/text");
		Cookie c1= new Cookie("Apple","20/-");
		Cookie c2= new Cookie("Mango","25/-");
		response.addCookie(c1);
		response.addCookie(c2);
		Cookie c3= new Cookie("Banana","5/-");
		Cookie c4= new Cookie("Watermelon","70/-");
		c3.setMaxAge(5);
		c4.setMaxAge(2);
		response.addCookie(c3);
		response.addCookie(c4);
		out.println("set Cookie");
		RequestDispatcher rd=request.getRequestDispatcher("/show");
		rd.forward(request, response);
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
