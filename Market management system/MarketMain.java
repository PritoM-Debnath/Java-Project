package project;

import project.inAndOut.InputData;
import project.inAndOut.Print;
import project.inAndOut.LogIn;
import project.market.Employee;
import project.market.Market;
import project.product.ImportedProduct;
import project.product.LocalProduct;
import project.product.Product;
import project.shop.Shop;

public class MarketMain {

	public static void main(String[] args) {

		InputData input=new InputData();

		LogIn login = new LogIn();


		Market market=new Market();
		Print message=new Print();
		message.welcomeMessage();
		int decision=0;
		boolean exit=false;
		while(!exit) {
			message.marketMangInfo();
			System.out.println();
			System.out.print("Enter input : ");
			decision=input.inputInt();
			System.out.println();
			//first switch
			switch(decision) {
			//case 1 - Employee Management
			case 1:{
				message.empMangInfo();
				System.out.print("Enter input : ");
				decision=input.inputInt();
				switch(decision) {
				//insert new employee
				case 1:{
					System.out.print("Enter Employee Name : ");
					String name=input.inputString();
					System.out.print("Enter Employee ID : ");
					String id=input.inputString();
					System.out.print("Enter Employee Salary : ");
					double salary=input.inputDouble();

					Employee employee=new Employee(name,id,salary);

					if(market.insertEmployee(employee)) {
						System.out.println("Employee Inserted ! - with ID : "+id);
					}
					else {
						System.out.println("Operation Failed...");
					}
					break;
				}
				//remove existing employee
				case 2:{
					System.out.print("Enter Employee ID : ");
					String id=input.inputString();
					if(market.searchEmployee(id)!=null) {
						if(market.removeEmployee(market.searchEmployee(id))) {
							System.out.println();
							System.out.println("Employee Removed Successfully...");
							System.out.println();
						}
						else {
							System.out.println("Operation Failed...");
						}
					}
					else{
						System.out.println("Employee Not Found In Database...");
					}
					break;
				}
				//show all employee
				case 3:{
					market.showAllEmployees();
					break;
				}
				// search an employee
				case 4:{
					System.out.print("Enter Employee ID : ");
					String id=input.inputString();
					if(market.searchEmployee(id)!=null) {
						System.out.println();
						System.out.println("Employee Found...");
						System.out.println("Employee Name : "+market.searchEmployee(id).getName());
						System.out.println("Employee ID : "+market.searchEmployee(id).getEmpId());
						System.out.println("Employee Salary : "+market.searchEmployee(id).getSalary()+" $");
						System.out.println();
					}
					else {
						System.out.println("Employee Not Found In Database...");
						System.out.println();
					}
					break;
				}
				//go back
				case 5:{
					break;
				}
				default:{
					System.out.println("Invalid Input...");
					System.out.println();
				}	
				}
				break;
			}
			//case 2 - Shop Management
			case 2:{
				message.shopManagInfo();
				System.out.print("Enter input : ");
				decision=input.inputInt();
				switch(decision) {
				//insert new shop
				case 1:{
					System.out.print("Enter Shop ID : ");
					String sid=input.inputString();
					System.out.print("Enter Shop Name : ");
					String name=input.inputString();
					Shop shop=new Shop(sid,name);
					if(market.insertShop(shop)) {
						System.out.println("Employee Inserted ! - with SID : "+sid);
					}
					else {
						System.out.println("Operation Failed...");
					}
					break;
				}
				//remove existing shop
				case 2:{
					System.out.print("Enter Shop ID : ");
					String sid=input.inputString();
					if(market.searchShop(sid)!=null) {
						if(market.removeShop(market.searchShop(sid))) {
							System.out.println();
							System.out.println("Shop Removed Successfully...");
						}
						else {
							System.out.println("Operation Failed...");
						}
					}
					else{
						System.out.println("Shop Not Found In Database...");
					}
					break;
				}
				//show all shops
				case 3:{
					market.showAllShops();
					break;
				}
				//search a shop
				case 4:{
					System.out.print("Enter Shop ID : ");
					String sid=input.inputString();
					if(market.searchShop(sid)!=null) {
						System.out.println();
						System.out.println("Shop Found...");
						System.out.println("Shop Name : "+market.searchShop(sid).getName());
						System.out.println("Shop ID : "+market.searchShop(sid).getSid());
						System.out.println();
					}
					else {
						System.out.println("Shop Not Found In Database...");
						System.out.println();
					}
					break;
				}
				//go back
				case 5:{
					break;
				}
				default:{
					System.out.println("Invalid Input...");
					System.out.println();
				}
				}
				break;
			}
			//case 3 - shop product management
			case 3:{
				message.shopProductManag();
				System.out.print("Enter input : ");
				decision=input.inputInt();
				switch(decision) {
				//insert new product
				case 1:{
					System.out.print("Enter Shop ID : ");
					String sid=input.inputString();
					if(market.searchShop(sid)!=null){
							if(market.searchShop(sid).getSid().equals(sid)) {
							System.out.println("");
							System.out.println("Shop Found...");
							System.out.println("Shop Name : "+market.searchShop(sid).getName());
							System.out.println("");
							System.out.print("Enter Product ID : ");
							String pid=input.inputString();
							System.out.print("Enter Product Name : ");
							String name=input.inputString();
							System.out.print("Enter Available Quantity : ");
							int quantity=input.inputInt();
							System.out.print("Enter Product Price : ");
							double price=input.inputDouble();
							System.out.println("Which Product Do You Want To Insert ?\n\t 1.Local Product\n\t 2.Imported Product");
							System.out.print("Enter input : ");
							decision=input.inputInt();
							switch(decision) {
							case 1:{
								System.out.print("Enter Product Discount Rate : ");
								double discount=input.inputDouble();
								LocalProduct product=new LocalProduct(pid,name,quantity,price,discount);
								
								if(market.searchShop(sid).insertProduct(product)) {
									System.out.println("New Product Inserted...");
								}
								else {
									System.out.println("Operation Failed...");
								}
								
								break;
							}
							case 2:{
								System.out.print("Enter Product Country Name : ");
								String cName=input.inputString();
								ImportedProduct product=new ImportedProduct(pid,name,quantity,price,cName);
								try{
									if(market.searchShop(sid).insertProduct(product)) {
										System.out.println("New Product Inserted...");
									}
									else {
										System.out.println("Operation Failed...");
									}
								}catch(Exception e){
									System.out.println("Operation Failed...");
								}
								break;
							}
							default:{
								System.out.println("Invalid Input...");
								break;
							}
							}
						}
						else {
							System.out.println("Shop Not Found In Database...");
						}
					}
					else {
						System.out.println("Shop Not Found In Database...");
					}
					break;
				}
				//remove existing shop
				case 2:{
					boolean flag=false;
					System.out.print("Enter Product ID : ");
					String pid=input.inputString();
					for(int i=0;i<market.getShops().length;i++) {
						if(market.getShops()[i]!=null) {
							if(market.getShops()[i].searchProduct(pid).getPid().equals(pid)) {
								if(market.getShops()[i].removeProduct(market.getShops()[i].searchProduct(pid))){
									System.out.println("Product Removed Successfully...");
									flag=true;
									break;
								}
								else {
									System.out.println("Operation Failed...");
								}
							}
						}
					}
					if(flag==false) {
						System.out.println("Product Not Found In Database...");
					}
					break;
				}
				//show all product
				case 3:{
					System.out.println("Details Of All Products -->");
					System.out.println("-----------------------------------------\n-----------------------------------------");
					for(int i=0;i<market.getShops().length;i++) {
						if(market.getShops()[i]!=null) {
							market.getShops()[i].showAllProducts();
						}
						else {
							
						}
					}
					System.out.println("-----------------------------------------\n-----------------------------------------");
					break;
				}
				//search a product
				case 4:{
					boolean flag=false;
					System.out.println("Enter Product ID : ");
					String pid=input.inputString();
					for(int i=0;i<market.getShops().length;i++) {
						if(market.getShops()[i]!=null) {
							if(market.getShops()[i].searchProduct(pid)!=null) {
								if(market.getShops()[i].searchProduct(pid).getPid().equals(pid)) {
									System.out.println();
									System.out.println("Product Found...");
									System.out.println("Product ID : "+market.getShops()[i].searchProduct(pid).getPid());
									System.out.println("Product Name : "+market.getShops()[i].searchProduct(pid).getName());
									System.out.println("Product Quantity : "+market.getShops()[i].searchProduct(pid).getAvailableQuantity());
									System.out.println("Product Price : "+market.getShops()[i].searchProduct(pid).getPrice());
									flag=true;
									break;	
								}
							}
						}
					}
					if(flag==false) {
						System.out.println("Product Not Found In Database...");
					}
					break;
				}
				//go back
				case 5:{
					break;
				}
				default:{
					System.out.println("Invalid Input...");
					break;
				}
				}
				break;

			}
			case 4:{
				System.out.println("Logged Out...");
				exit=true;
				break;
			}
			default:{
				System.out.println("Invalid Input...");
				break;
			}
			}
			
		}

	}

		
}
