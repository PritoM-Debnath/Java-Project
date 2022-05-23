package project.market;

import project.shop.Shop;

public class Market implements EmployeeOperations,ShopOperations{
	
	private Shop[] shops ;
	private Employee[] employees ;
	public Market() {
		this.shops=new Shop[50];
		this.employees=new Employee[250];
	}
	public Market(Shop[] shops, Employee[] employees ) {
		this();
		this.shops=shops;
		this.employees=employees;
	}
	public void setShops(Shop[] shops) {
		this.shops=shops;
	}
	public void setEmployees(Employee[] employees) {
		this.employees=employees;
	}
	public Shop[] getShops() {
		return shops;
	}
	
	public Employee[] getEmployees() {
		return employees;
	}
	
	@Override
	public boolean insertEmployee(Employee e){
		boolean flag =false;
		for(int i =0;i<employees.length;i++){
			if (employees[i]==null){
				employees[i]=e;
				flag=true;
				break;
			}
		}
		return flag;
	}
	
	@Override
	public boolean removeEmployee(Employee e) {
		boolean flag =false;
		for(int i =0;i<employees.length;i++) {
			if (employees[i]==e) {
				employees[i]=null;
				flag =true ;
				break;
			}
		}
		return flag;
	}
	
	@Override
	public Employee searchEmployee(String empId) {
		int flag=0;
		for(int i=0;i<employees.length;i++) {
			if(employees[i]!=null) {
				if(employees[i].getEmpId().equals(empId)) {
					flag =i;
					break;
				}
				else {
					flag =-1;
				}
			}
		}	
		if(flag==-1) {
			return null;
		}
		else {
			return employees[flag];
		}
	}
	
	@Override
	public void showAllEmployees() {
		System.out.println("Details Of All Employees -->");
		System.out.println("-----------------------------------------\n-----------------------------------------");
		for(int i=0;i<employees.length;i++) {
			if (employees[i]!=null) {
				System.out.println("Employee Name : "+employees[i].getName());
				System.out.println("Employee ID : "+employees[i].getEmpId());
				System.out.println("Employee Salary : "+employees[i].getSalary());	
				System.out.println();
			}
		}
		System.out.println("-----------------------------------------\n-----------------------------------------");
	}

	@Override
	public boolean insertShop(Shop s) {
		boolean flag =false;
		for(int i=0;i<shops.length;i++){
			if (shops[i]==null){
				shops[i]=s;
				flag=true;
				break;
			}
		}
		return flag;
	}
	
	@Override
	public boolean removeShop(Shop s) {
		boolean flag =false;
		for(int i=0;i<shops.length;i++) {
			if (shops[i]==s) {
				shops[i]=null;
				flag =true ;
				break;
			}
		}
		return flag;
	}
	
	@Override
	public Shop searchShop(String sid) {
		int flag=0;
		for(int i=0;i<shops.length;i++) {
			if(shops[i]!=null) {
				if(shops[i].getSid().equals(sid)) {			
					  flag =i;
					  break;
				}
				else{
					flag=-1;
				}
			}
		}
		if(flag==-1){
			return null;
		}
		else{
			return shops[flag];
		}
	}
	
	@Override
	public void showAllShops() {
		for(int i=0;i<shops.length;i++) {
			if(shops[i]!=null) {
			    System.out.println("Shop ID : "+shops[i].getSid());
				System.out.println("Shop Name : "+shops[i].getName());
				System.out.println();
			}
		}
	}
}

