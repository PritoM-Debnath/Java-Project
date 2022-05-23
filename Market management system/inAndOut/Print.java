package project.inAndOut;

public class Print {
	
	public void welcomeMessage() {
		System.out.println("\t-----------------------------------------------");
		System.out.println("\t|***Welcome to the Market Management System***|");
		System.out.println("\t-----------------------------------------------");
		System.out.println(" ");
	}

	public void marketMangInfo() {
		System.out.println("***Options For Market Management System : ");
		System.out.println("\t 1.Employee Management\t\t 2.Shop Management\n\t 3.Shop Product Management\t 4.Exit");
		System.out.println();
	}
	public void empMangInfo() {
		System.out.println("***Options for Employee Management System : ");
		System.out.println("\t 1.Insert New Employee\t 2.Remove Existing Employee\n\t 3.Show All Employees\t 4.Search an Employee\n\t 5.Go Back");
		System.out.println();
	}
	public void shopManagInfo() {
		System.out.println("***Options For Shop Management System :");
		System.out.println("\t 1.Insert New Shop\t 2.Remove Existing Shop\n\t 3.Show All Shops\t 4.Search A Shop\n\t 5.Go Back");
		System.out.println();
	}
	public void shopProductManag() {
		System.out.println("***Options for Shop Product Management System : ");
		System.out.println("\t 1.Insert New Product\t 2.Remove Existing Product\n\t 3.Show All Product\t 4. Search a Product\n\t 5.Go Back");
		System.out.println();
	}
	public void spTest() {
		System.out.println();
		System.out.println("Which Product you want to deal with ? \n"
				+"1. Imported Product \n "+"2. Local Product ");
		System.out.println();
	}
}
