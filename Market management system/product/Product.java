package project.product;

public abstract class Product implements IQuantity {

	private String pid;
	private String name;
	private int availableQuantity;
	private double price;

	public Product() {}

	public Product(String pid ,String name,int availableQuantity,double price){
		this.pid=pid;
		this.name=name;
		this.availableQuantity=availableQuantity;
		this.price=price;
	}
	public void setPid(String pid){
		this.pid=pid;
	}
	public void setName(String name){
		this.name=name;
	}
	public void setAvailableQuantity(int quantity){
		this.availableQuantity=quantity;
	}
	public void setPrice(double price){
		this.price=price;
	}
	public String getPid( ){
		return this.pid;
	}
	public String getName( ){
		return this.name;
	}
	public int getAvailableQuantity( ){
		return this.availableQuantity;
	}
	public double getPrice( ){
		return this.price;
	}


	public abstract void showInfo( );
}
