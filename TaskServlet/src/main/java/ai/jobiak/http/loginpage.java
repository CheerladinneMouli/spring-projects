package ai.jobiak.http;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class loginpage
 */
public class loginpage extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public loginpage() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		
		   {
		     res.setContentType("text/html");
		     PrintWriter out = res.getWriter();
		     String uname=req.getParameter("val1");
		     String pw=req.getParameter("val2");
		     out.println("User Details Page:");
		     out.println("Hello "+uname);
		     out.println("Your Password is *"+pw+"*");
		     out.close();
		  }
		}
	}


