package entities;

public class Product {
	
	
	protected String name;
	protected double price;
	
	
	public Product() {
		
	}
	
	public Product(String name, double price) {
		super();
		this.name = name;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	
	protected String priceTag() {
		return name + " - " + String.format("%.2F", price);
	}
	

}
