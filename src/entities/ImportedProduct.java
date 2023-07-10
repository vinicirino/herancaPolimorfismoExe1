package entities;

public class ImportedProduct extends Product{
	
	private double customsFee;

	public ImportedProduct() {
	}
	
	
	public ImportedProduct(String name, double price, double customsFee) {
		super(name, price);
		this.customsFee = customsFee;
	}


	public double getCustomsFee() {
		return customsFee;
	}


	public void setCustomsFee(double customsFee) {
		this.customsFee = customsFee;
	}
	
	
	@Override
	protected String priceTag() {
		return name + " - " + String.format("%.2F", price + customsFee);
	}
	
	

}
