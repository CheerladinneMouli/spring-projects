package ai.jobiak.http;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class SignupFormServlet
 */
public class SignupFormServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SignupFormServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
    private Connection connect() {
    	
		
		
    	
    		String userName = "root";
    		String passWord = "admin";
    		String url = "jdbc:mysql://localhost:3306/world";
     		Connection con = null;
    		try {
				Class.forName("com.mysql.cj.jdbc.Driver");
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
    		
    		
    			try {
				 con = DriverManager.getConnection(url,userName,passWord);
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
    			return con;
    }
//	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		// TODO Auto-generated method stub
//		response.getWriter().append("Served at: ").append(request.getContextPath());
//	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String fnameStr = request.getParameter("fname");
		String emailStr = request.getParameter("email");
		String mobileStr = request.getParameter("mobile");
		Connection con1 = connect();
		int count =0;
		try {
			PreparedStatement ps = con1.prepareStatement("insert into signup values(?,?,?)");
			ps.setString(1,fnameStr);
			ps.setString(2,emailStr);
			ps.setString(3,mobileStr);
			ps.executeUpdate();
		response.getWriter().println(fnameStr+emailStr+mobileStr);
		
		//doGet(request, response);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
	

	



