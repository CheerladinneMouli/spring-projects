package ai.jobiak.http;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class votecheck
 */
public class votecheck extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public votecheck() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		String st = request.getParameter("pname");
		String p = request.getParameter("age");
		int pars = Integer.parseInt(p);
		if(pars>=18) {
			out.println("<h1>"+"<i>"+"pname"+"You are eligible to vote"+"</i>"+"</h1>");
		}else {
			out.println("<h1>"+"<i>"+"pname"+"You are not eligible to vote"+"</i>"+"</h1>");
		}
		
	}

}
