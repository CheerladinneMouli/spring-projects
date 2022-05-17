package ai.jobiak.servlets;
import java.io.IOException;
import java.io.PrintWriter;
import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Date;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class DBServlet
 */
public class DBServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DBServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter pw = response.getWriter();
		String jobs[]=request.getParameterValues("job");
		StringBuffer sb=new StringBuffer();
		sb.append("(");
		if(jobs!=null)
		for(int i=0;i<jobs.length;i++){
			if(i==jobs.length-1) {
				sb.append("'"+jobs[i]+"'");
				}else 
					sb.append("'"+jobs[i]+"'"+"'");
		}
		sb.append(")");
		String condition=sb.toString();
		String userName = "root";
		String passWord = "admin";
		String url = "jdbc:mysql://localhost:3306/world";
			
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			Connection con = DriverManager.getConnection(url,userName,passWord);
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery("select * from emp where job in"+condition+
					"order by job");
			while(rs.next()) {
				int empno=rs.getInt(1);
				String ename=rs.getString(2);
				String job=rs.getString(3);
				Date hireDate=rs.getDate(4);
				float sal=rs.getFloat(5);
				float comm=rs.getFloat(6);
				int deptno=rs.getInt(7);
				
				BigDecimal bd=new BigDecimal(sal);
				pw.println("<tr>");
				pw.println("<td>"+empno+"</td>");
				pw.println("<td>"+ename+"</td>");
				pw.println("<td>"+job+"</td>");
				pw.println("<td>"+hireDate+"</td>");
				pw.println("<td>"+bd.setScale(2,BigDecimal.ROUND_HALF_UP)+"</td>");
				pw.println("<td>"+comm+"</td>");
				pw.println("<td>"+deptno+"</td>");
				pw.println("<tr>");
				rs.close();
				con.close();
				
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
