package ai.jobiak.attributes;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class readattribute
 */
@WebServlet("/read")
public class readattribute extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public readattribute() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		ServletContext context=getServletContext();
		out.println("DB NAME"+context.getAttribute("dbName"));
		out.println("DB VERSION"+context.getAttribute("dbversion"));
		out.println("tomcat version"+request.getAttribute("9.0"));
		out.println("platform"+request.getAttribute("os"));
		
	}

}
