package main.Days.DayTwo.Questions.Q3;
import main.Days.DayTwo.Questions.Q3.Interface.*;
class Member{
	String name;
	int age;
	String phoneNumber;
	String address;
	double salary;
	
	public Member(String name, int age, String phoneNumber, String address, double salary) {
		this.name=name;
		this.age=age;
		this.phoneNumber=phoneNumber;
		this.address=address;
		this.salary=salary;
	}
}

class Employee extends Member implements questionThreeINF{
	String specialization;
	
	public Employee(String name, int age, String phoneNumber, String address, double salary, String specialization) {
	super(name,age,phoneNumber,address,salary);
	this.specialization=specialization;
	}
	
	public void printSalary() {
		System.out.println("Salary is: "+salary);
	}
}

class Manager extends Member implements questionThreeINF{
	String department;
	
	public Manager(String name, int age, String phoneNumber, String address, double salary, String department) {
		super(name,age,phoneNumber,address,salary);
		this.department=department;
	}
	
	public void printSalary() {
		System.out.println("Salary is: "+salary);
	}
}

public class QuestionThree {
	public void start() {
		 Employee employee = new Employee("Mohammad Bilal", 30, "9004536798", "Whitefield", 50000, "Software Development");
	        Manager manager = new Manager("Farook A S", 35, "9923409812", "HSR", 80000, "Tech");
	        
	        System.out.println("Employee Information:");
	        System.out.println("Name: " + employee.name);
	        System.out.println("Age: " + employee.age);
	        System.out.println("Phone Number: " + employee.phoneNumber);
	        System.out.println("Address: " + employee.address);
	        System.out.println("Specialization: " + employee.specialization);
	        employee.printSalary();
	        
	        System.out.println("\nManager Information:");
	        System.out.println("Name: " + manager.name);
	        System.out.println("Age: " + manager.age);
	        System.out.println("Phone Number: " + manager.phoneNumber);
	        System.out.println("Address: " + manager.address);
	        System.out.println("Department: " + manager.department);
	        manager.printSalary();
	}

}
