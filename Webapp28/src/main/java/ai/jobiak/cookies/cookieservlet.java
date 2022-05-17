package ai.jobiak.cookies;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/cookie")
public class cookieservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    public cookieservlet() {
        super();
    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out=response.getWriter();
		int count=1,beg=0;
		if(beg==0)
		{
		Cookie counterCookie=new Cookie("visits",count+"");
		response.addCookie(counterCookie);
		//out.println("count ="+count);
		beg++;
		}
		Cookie cookies[]=request.getCookies();
		//int cookieCounter=0;
		if(cookies!=null) {
			System.out.println(cookies[0]);
		for(int i=0;i<cookies.length;i++)
		{
			if(cookies[i].getName().equals("visits"))
			{
			int cookieCounter=Integer.parseInt(cookies[i].getValue());
			System.out.println(cookieCounter);
			count=	++cookieCounter;
			}
		}
		Cookie counterCookie=new Cookie("visits",count+"");
		response.setContentType("text/html");
		response.addCookie(counterCookie);
		
		out.println("<h2>"+count+"</h2>");
		}
	}
}

	


