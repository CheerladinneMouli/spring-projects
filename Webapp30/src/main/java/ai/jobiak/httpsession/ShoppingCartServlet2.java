package ai.jobiak.httpsession;
import java.io.IOException;
import java.io.PrintWriter;
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
@WebServlet("/cart1")
public class ShoppingCartServlet2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ShoppingCartServlet2() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**

 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		PrintWriter out = response.getWriter();
	response.setContentType("text/html");
	
	int i=0;
	for(i=1;i<=10;i++) {
		
	out.println("<a href='cart1?item="+i+"'>Add Item "+i+"</a><br/>");
	
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