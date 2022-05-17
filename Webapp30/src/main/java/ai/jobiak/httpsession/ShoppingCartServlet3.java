package ai.jobiak.httpsession;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


/**
 * Servlet implementation class ShoppingCartServlet
 */
@WebServlet("/cart3")
public class ShoppingCartServlet3 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ShoppingCartServlet3() {
        super();
    }
    
    private String[]getProductIds(){
    	
    	String url = "jdbc:mysql://localhost:3306/world";
    	String userName = "root";
    	String password = "admin";
    	String productIds[]=new String[10];
    	
    	try {
        	Class.forName("com.mysql.cj.jdbc.Driver");
        	Connection con = DriverManager.getConnection(url,userName,password);
        	java.sql.Statement st = con.createStatement();
        	String sql = "Select ProductId from products";
        	ResultSet rs=st.executeQuery(sql);
        	int i=0;
        	while(rs.next()) {
        		productIds[i]= rs.getString(1);
        		i++;
        	//	System.out.println(productIds[i]);
        		
        	}
    	}catch(Exception e) {
    		e.printStackTrace();
    	}

		return productIds;
    }

	/**

 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		PrintWriter out = response.getWriter();
	response.setContentType("text/html");
	String productIds[]=getProductIds(); //private method for db connection and fetch

	for(int i=0;i<productIds.length;i++) {
		
	out.println("<a href='cart3?item="+productIds[i]+"'>Add Item "+productIds[i]+"</a><br/>");
	
	}
	ArrayList<Product> itemsList =null;
	HttpSession shoppingCart = request.getSession();
		
	if(shoppingCart.isNew()) {
		itemsList = new ArrayList<>();
		shoppingCart.setAttribute("items",itemsList);
		
	} else {
		
		String queryStr = request.getQueryString();
		//System.out.println(queryStr); 
		String splitArray[] = queryStr.split("=");
		String productId = splitArray[1];
		//System.out.println(productId);
		
		itemsList = (ArrayList<Product>)shoppingCart.getAttribute("items");
		itemsList.add(new Product(productId,"ABC",78.00));
		shoppingCart.setAttribute("items",itemsList);
	
		}
	for(Product p : itemsList) {
		out.println(p.getProductId()+" :: "+p.getDescryption()+" :: "+p.getPrice()+"</br>");
	}
	out.println("<h3> Items in the Cart :: "+itemsList.size()+"</h3>");
	
	}
		
			}