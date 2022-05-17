package ai.jobiak.http;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class factorialservlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
        throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        String x=request.getParameter("n1");
        int n=Integer.parseInt(x);
        int i=1,fact=1;
        if(n==0)
        {
        out.println("<h1>factorial of 0"+"is"+n+"</h1>");
        }
        else
        {
        while(i<=n)
        {
        fact=fact*i;
        i=i+1;
        } 
        out.println("<h1>factorial of " + n +"="+fact+ "</h1>");
        }
    }
}


