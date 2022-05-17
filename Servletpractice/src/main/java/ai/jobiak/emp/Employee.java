package ai.jobiak.emp;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Employee
 */
@WebServlet("/Employee")
public class Employee extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Employee() {
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
		PrintWriter out = response.getWriter();
		out.println("User Details");
		out.println("First_Name: "+request.getParameter("intial"));
		out.println("Last_Name: "+request.getParameter("fn"));
		out.println("Location: "+request.getParameter("ln"));
		out.println(""+request.getParameter("ct"));
		out.println(request.getParameter("state"));
		out.println(request.getParameter("email"));
		out.println(request.getParameter("mob"));
		String languages[] = request.getParameterValues("lk");
		for(String s:languages) {
			out.println(s);
		}
		Enumeration name=request.getParameterNames();
		while(name.hasMoreElements()) {
			out.println("value");
		}
		
		
		
	}

}
