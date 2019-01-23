package interfaces;

import java.util.Arrays;

public class EmployeeSortTest {
	public static void main(String[] args) {
		Employee[] staff = new Employee[3];
		staff[0] = new Employee("harry", 3000);
		staff[1] = new Employee("Bob", 3500);
		staff[2] = new Employee("M", 2000);
		
		Arrays.sort(staff);
		for (Employee e : staff) {
			System.out.println("name= " + e.getName() + ", salary= " + e.getSalary());
		}
	}
}
