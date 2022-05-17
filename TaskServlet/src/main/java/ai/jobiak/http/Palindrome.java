package ai.jobiak.http;
import java.io.IOException;    
import java.io.PrintWriter;      
import javax.servlet.ServletException;    
import javax.servlet.annotation.WebServlet;    
import javax.servlet.http.HttpServlet;    
import javax.servlet.http.HttpServletRequest;    
import javax.servlet.http.HttpServletResponse;    
    
/**  
 * Servlet implementation class Palindrome  
 */    
@WebServlet("/Palindrome")    
public class Palindrome extends HttpServlet {    
    private static final long serialVersionUID = 1L;    
           
    /**  
     * @see HttpServlet#HttpServlet()  
     */    
    public Palindrome() {    
        super();    
        // TODO Auto-generated constructor stub    
    }    
    
    /**  
     * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)  
     */    
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {    
        // TODO Auto-generated method stub    
            
        PrintWriter pw=response.getWriter();    
        response.setContentType("text/html");    
           
            
            
        String name=request.getParameter("name");    
            
        StringBuffer sb=new StringBuffer(name);   
        if(name!=null) {
        String reverse=sb.reverse().toString();    
            
        if(name.equalsIgnoreCase(reverse))    
        {    
            pw.println("It is a palindrome");    
        }    
        else    
        {    
            pw.println("It is not a palindrome");    
        }    
            
        pw.close();    
            
    } 
    }
    
    /**  
     * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)  
     */    
    
}
