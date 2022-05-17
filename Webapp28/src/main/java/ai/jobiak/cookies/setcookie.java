package ai.jobiak.cookies;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/setcookie")
public class setcookie extends HttpServlet {
	private static final long serialVersionUID = 1L;
    public setcookie() {
        super();
    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		
		Cookie mycookie = new Cookie("Choclateflavor","100/-");
		mycookie.setMaxAge(Integer.MAX_VALUE);
		response.addCookie(mycookie);
		out.println(mycookie);
		Cookie cookies[] = request.getCookies();
		boolean cookiefound = false;
		for(int i=0;i<cookies.length;i++) {
			if(cookies[i].getName().equals("Choclateflavour")) {
				int getcookie = Integer.parseInt(cookies[i].getName());
			cookiefound=true;
			if(cookiefound) {
			response.setContentType("text/html");
			System.out.println(getcookie);	
			}
			}
		}
	}
}
				
		
	


