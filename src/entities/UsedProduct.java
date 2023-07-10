package entities;

import java.text.SimpleDateFormat;
import java.util.Date;

public class UsedProduct extends Product{
	
	SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyy");
	
	private Date ManufacturedDate;
	
	
	public UsedProduct() {

	}
	

	public UsedProduct(String name, double price, Date manufacturedDate) {
		super(name, price);
		ManufacturedDate = manufacturedDate;
	}


	public Date getManufacturedDate() {
		return ManufacturedDate;
	}


	public void setManufacturedDate(Date manufacturedDate) {
		ManufacturedDate = manufacturedDate;
	}
	
	
	@Override
	protected String priceTag() {
		return name + " - " + String.format("%.2F", price) + " (" + sdf.format(ManufacturedDate)+ ")" ;
	}
	
	
	
	
	
}
