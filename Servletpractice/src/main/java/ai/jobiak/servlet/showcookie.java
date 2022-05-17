package ai.jobiak.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class showcookie
 */
@WebServlet("/show")
public class showcookie extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public showcookie() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		response.setContentType("html/text");
		String st= "Active Cookies";
		out.println("<html><head><title>"+st+"<title></head></html>");
		out.println("<table border=\"1\" align=\"center\">");
		out.println("<tr><th>Cookie Name</th><th>Cookie Value</th><tr>");
		Cookie[] ck = request.getCookies();
		if(ck!=null) {
			for(int i=0;i<ck.length;i++) {
				out.println("<tr><td>"+ck[i].getName()+"</td><td>"+ck[i].getValue()+"</tr><td>");
			}
		}else {
			out.println("No Cookies Present");
			
			}
		}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
