package project.market;

public interface EmployeeOperations {
	public boolean insertEmployee(Employee e);
	public boolean removeEmployee(Employee e);
	public Employee searchEmployee(String empId);
	public void showAllEmployees();
}
