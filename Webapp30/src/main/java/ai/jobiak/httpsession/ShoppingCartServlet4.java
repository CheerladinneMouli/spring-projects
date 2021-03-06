package ai.jobiak.httpsession;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
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
@WebServlet("/cart4")
public class ShoppingCartServlet4 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ShoppingCartServlet4() {
        super();
    }
    private ArrayList<Product> getProducts(){
    	
    	String url = "jdbc:mysql://localhost:3306/world";
    	String userName = "root";
    	String password = "admin";
    	ArrayList<Product> productList=new ArrayList<>();
    	Connection con=null;
    	try {
        	Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection(url,userName,password);
        	java.sql.Statement st = con.createStatement();
        	String sql = "Select * from products";
        	ResultSet rs=st.executeQuery(sql);
        	while(rs.next()) {
        		Product p= new Product(rs.getString(1),rs.getString(2),rs.getDouble(3));
        		productList.add(p);
        	//	System.out.println(productIds[i]);
        		
        	}
    	}catch(Exception e) {
    		e.printStackTrace();
    	}finally {
    		if(con!=null) {
    			try {
    				con.close();
    			}catch(SQLException e) {
    				e.printStackTrace();
    			}
    		}
    	}
    	return productList;
    }

	/**

 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	PrintWriter out = response.getWriter();
	response.setContentType("text/html");
	ArrayList<Product>itemsList=null;//private method for db connection and fetch
    itemsList=getProducts();
    out.println("<hr/>");
    
	for(int i=0;i<itemsList.size();i++) {	
	out.println("<a href='cart4?item="+itemsList.get(i).getProductId()+"'>Add Item "+itemsList.get(i).getProductId()+"</a><br/>");
	}
	out.println("hr/");
	HttpSession shoppingCart = request.getSession();
	ArrayList<Product>selectedItemsList=null;	
	if(shoppingCart.isNew()) {
		selectedItemsList = new ArrayList<>();
		shoppingCart.setAttribute("items",selectedItemsList);
		
	} else {
		
		String queryStr = request.getQueryString();
		//System.out.println(queryStr); 
		String splitArray[] = queryStr.split("=");
		String productId = splitArray[1];
		for(int i=0;i<itemsList.size();i++){
		
			if(itemsList.get(i).getProductId().equals(productId)) {
				selectedItemsList = (ArrayList<Product>)shoppingCart.getAttribute("items");
				selectedItemsList.add(itemsList.get(i));
				shoppingCart.setAttribute("items",itemsList);
				break;
			}
		}
	}
	for(Product p : selectedItemsList) {
		out.println(p.getProductId()+" :: "+p.getDescryption()+" :: "+p.getPrice()+"</br>");
	}
	out.println("hr/");
	out.println("<h3> Items in the Cart :: "+itemsList.size()+"</h3>");
	
	}
		
			}