package ai.jobiak.http;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/attributes")
public class ServletContextAttributes extends HttpServlet {
private static final long serialVersionUID = 1L;
  public ServletContextAttributes() {
        super();
}
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		PrintWriter out=response.getWriter();
		ServletContext sc = getServletContext();
		sc.setAttribute("division",10/2);
		sc.setAttribute("subtraction",5-2);
		sc.setAttribute("add",5+2);
		sc.setAttribute("multiplication",5*5);
	
 }

}