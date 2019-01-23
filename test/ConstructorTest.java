package test;

import java.util.*;

public class ConstructorTest {
	public static void main(String[] args) {
		Employee[] staff = new Employee[3];
		staff[0] = new Employee("Harry", 4000);
		staff[1] = new Employee(3000);
		staff[2] = new Employee();
		
		for (Employee e: staff) {
			System.out.println("name=" + e.getName() + ", id=" + e.getId() + ", salary=" + e.getSalary());
		}
	}
}

class Employee {
	private static int nextId;
	
	private String name = "";
	private int id;
	private double salary;
	
	static {
		Random generate = new Random();
		nextId = generate.nextInt(1000);
	}
	
	{
		id = nextId;
		nextId ++;
	}
	
	public Employee() {
	}
	
	public Employee(String name, double salary) {	
		this.name = name;
		this.salary = salary;
	}
	
	public Employee(double salary) {
		this("Employee #" + nextId, salary);
	}
	
	public String getName() {
		return name;
	}
	
	public double getSalary() {
		return salary;
	}
	
	public int getId() {
		return id;
	}
}