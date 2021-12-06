package org.NaEmp;

public class Employee {
	
private void empId() {
System.out.println("065400");
}
private void empName() {
System.out.println("Naveen");
}
 private void emDob() {
System.out.println("24.03.1998");
}
 private void empPhone() {
System.out.println("9442493813");
}
 private void empEmail() {
System.out.println("naveen@gmail.com");
}
 private void empAddress() {
System.out.println("ECR Road");
}
 public static void main(String[] args) {
	Employee e = new Employee();
	e.empId();
	e.empName();
	e.emDob();
	e.empPhone();
	e.empEmail();
	e.empAddress();
}
}
