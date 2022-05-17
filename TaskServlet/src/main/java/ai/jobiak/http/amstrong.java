package ai.jobiak.http;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class amstrong
 */
public class amstrong extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public amstrong() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        String am=request.getParameter("num");
        int pars=Integer.parseInt(am);
        int sum=0;
        int rem;
        int temp=pars;
        while(pars!=0){
        	rem=pars%10;
        	sum=sum+(rem*rem*rem);
        	pars=pars/10;
        }
        if(sum==temp) {
        	out.println("<h2>"+temp+" Number is Amstrong number"+"</h2>");
        	
        }else
        	out.println("<h2>"+temp+" Number is not Amstrong number"+"</h2>");
        
	}

}
