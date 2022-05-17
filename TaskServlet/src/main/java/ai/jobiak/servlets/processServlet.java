package ai.jobiak.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class processServlet
 */
public class processServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public processServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter pw=response.getWriter();
		pw.println("<html><body>");
		pw.println("<center><table border=1>");
		pw.println("<tr><th>Employee No.</th>");
		pw.println("<th>Name</th>");
		pw.println("<th>JOB</th>");
		pw.println("<th>Hire Date</th>");
		pw.println("<th>Salary</th>");
		pw.println("<th>Commission</th>");
		pw.println("<th>Dept.No.</th>");
		ServletContext sc = getServletContext();
		RequestDispatcher rd = sc.getRequestDispatcher("/QueryServlet");
		rd.include(request,response);
		pw.println("<table></center");
		pw.println("</body></html");
		
	}

}
