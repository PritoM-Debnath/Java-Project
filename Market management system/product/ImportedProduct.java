package project.product;

public class ImportedProduct extends Product {
	private String countryName;

	public ImportedProduct() {
		
	}
	public ImportedProduct(String pid ,String name,int availableQuantity,double price,String countryName) {
		super(pid,name,availableQuantity,price);
		this.countryName=countryName;
	}
	public void setCountryName(String countryName){
		this.countryName=countryName;
	}
	public String getCountryName(){
		return countryName;
	}
	
	public boolean addQuantity(int amount) {
		return true;
	}
	public boolean sellQuantity(int amount) {
		return true;
	}
	public void showInfo( ) {
		
	}
}
