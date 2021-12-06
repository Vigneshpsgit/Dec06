package org.emp;

public class Employee {

	private void empId() {
		System.out.println("Employee Id is : 277140");
	}
	
	private void empName() {
		System.out.println("Employee Name is : Vignesh");
	}
	
	private void empDob() {
		System.out.println("Employee Dob is : 29.11.1990");
	}
	private void empPhone() {
		System.out.println("Employee Phone is : 8056000720");
	}
	private void empEmail() {
		System.out.println("Employee Email is : p.s.vignesh90@gmail.com");
	}
	private void empAddress() {
		System.out.println("Employee Address is : F1, Vijaya sri sanjeevi Apartments, Royal avenue 3rd street, Thoraipakkam, chennai-97");
	}
	public static void main(String[] args) {
		Employee em = new Employee();
		
		em.empId();
		em.empName();
		em.empDob();
		em.empPhone();
		em.empEmail();
		em.empAddress();
	}
}

