package ai.jobiak.model;
public class Product {
	private String productId;
	private String Descryption;
	private double price;
	
	public Product() {
		// TODO Auto-generated constructor stub
	}
	public Product(String productId, String descryption, double price) {
		super();
		this.productId = productId;
		Descryption = descryption;
		this.price = price;
	}


	public String getProductId() {
		return productId;
	}

	public void setProductId(String productId) {
		this.productId = productId;
	}

	public String getDescryption() {
		return Descryption;
	}

	public void setDescryption(String descryption) {
		Descryption = descryption;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Product [productId=" + productId + ", Descryption=" + Descryption + ", price=" + price + "]";
	}
	

}


