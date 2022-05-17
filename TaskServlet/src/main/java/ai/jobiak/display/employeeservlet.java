package ai.jobiak.display;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import ai.jobiak.servlets.Employee;
import ai.jobiak.servlets.Employeeregistration;

/**
 * Servlet implementation class employeeservlet
 */
public class employeeservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    private Employeeregistration emp = new Employeeregistration();
    public employeeservlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	RequestDispatcher dispatcher=request.getRequestDispatcher("WEB-INF/views/empreg.jsp");
	dispatcher.forward(request, response);
	
	
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String empid = request.getParameter("empid");
		String firstname = request.getParameter("firstname");
		String lastname = request.getParameter("lastname");
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		String address = request.getParameter("address");
		String mobileno = request.getParameter("mobileno");
		
		Employee employee = new Employee();
		employee.setEmpid(empid);
		employee.setFirstname(firstname);
		employee.setLastname(lastname);
		employee.setUsername(username);
		employee.setPassword(password);
		employee.setAddress(address);
		employee.setMobileno(mobileno);
		
		try {
			emp.register(employee);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		RequestDispatcher dispatcher=request.getRequestDispatcher("WEB-INF/views/success.jsp");
		dispatcher.forward(request, response);
	}

}
