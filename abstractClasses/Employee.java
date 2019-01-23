package abstractClasses;

import java.time.*;

public class Employee extends Person {
	private double salary;
	private LocalDate hireDay;
	
	public Employee(String name, double salary, int year, int month, int day) {
		super(name);
		this.salary = salary;
		hireDay = LocalDate.of(year, month, day);
	}
	
	public String getDescription() {
		return String.format("an empoyee with a salary of %.2f", salary);
	}
	
	public LocalDate getHireday() {
		return hireDay;
	}
	
	public String getName() {
		return super.getName();
	}
	
	public double getSalary() {
		return salary;
	}
	
	public void raiseSalary(double byPercent) {
		double raise = salary * byPercent / 100;
		salary += raise;
	}
}
