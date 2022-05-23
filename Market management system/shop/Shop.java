package project.shop;

import project.product.Product;
import project.file.*;

public class Shop {
	private String sid ;
	private String name;
	public Product[] products=new Product[999];
	
	public Shop() {
		//products=new Product[999];
	}
	public Shop(String sid, String name , Product[] products ) {
		this();
		this.sid=sid;
		this.name=name;
		this.products=products;
	}
	public Shop(String sid , String name) {
		this.sid=sid;
		this.name=name;
	}

	public void setName(String name){
		this.name=name;
	}
	public void setSid(String sid){
		this.sid=sid;
	}
	public String getName( ){ 
		return name;
	}
	public String getSid( ){
		return sid;
	}	
	public void setProducts(Product[] products) {
		this.products=products;
	}
	public Product[] getProducts() {
		return products ;
	}
	
	public boolean insertProduct(Product p) {
		boolean flag =false;
		for(int i =0 ; i<products.length ; i++){
			if (products[i]==null){
				products[i]=p;
				flag=true;
				break;
			}
		}
		return flag;
	}
	public boolean removeProduct(Product p) {
		boolean flag =false;
		for(int i =0 ; i <products.length ; i++) {
			if (products[i]==p) {
				products[i]=null;
				flag =true ;
				break;
			}
		}
		return flag;
	}
	public Product searchProduct(String pid) {
		int flag=0;
		for(int i =0 ; i <products.length ; i++) {
			if (products[i]!=null) {
				if(products[i].getPid( ).equals(pid)) {
					flag =i;
					break;
				}
				else {
					flag=-1;
				}
			}			
		}
		if(flag ==-1) {
			return null;
		}
		else {
			return products[flag];
		}
	}
	public void showAllProducts() {
		
		for(int i =0;i<products.length;i++) {
			if(products[i]!=null) {
		    System.out.println();
		    String id="Product ID : "+products[i].getPid();
		    String name="Product name : "+products[i].getName( );
		    String quan="Available Quantity : "+products[i].getAvailableQuantity();
		    String price="Price : "+products[i].getPrice();
		    String line="----------------------------------------";
		    Filewr file=new Filewr();
		    file.writeInFile(line+"\n"+id+"\n"+name+"\n"+quan+"\n"+price+"\n"+line);
		    System.out.println("Product ID : "+products[i].getPid());
			System.out.println("Product name : "+products[i].getName());
			System.out.println("Available Quantity : "+products[i].getAvailableQuantity());
			System.out.println("Price : "+products[i].getPrice());
			}
		}
		
		
	}
	
}
