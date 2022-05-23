package project.product;

public class LocalProduct extends Product{
	private double discountRate ;

	public LocalProduct() {}
	
	public LocalProduct(String pid ,String name,int availableQuantity,double price,double discountRate) {
		super(pid,name,availableQuantity,price);
		this.discountRate=discountRate ;
	}
	
	public void setDiscountRate(double discountRate){
		this.discountRate=discountRate;
	}
	public double getDiscountRate( ){
		return discountRate;
	}
	
    public boolean addQuantity(int amount) {
		return true;
	}
	public boolean sellQuantity(int amount) {
		return true ;
	}
	public void showInfo( ) {
		
	}

}
