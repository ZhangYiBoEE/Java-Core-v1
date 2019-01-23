package ParamTest;

public class ParamTest {

	public static void main(String[] args) {
		/*
		 * Test1
		 */
		System.out.println("Testing tripleValue");
		double persent = 10;
		System.out.println("Before: persent=" + persent);
		tripleValue(persent);
		System.out.println("After: persent=" + persent);
		
		/*
		 * Test2
		 */
		System.out.println("Testing tripleSalary");
		Employee harry = new Employee("Harry", 5000);
		System.out.println("Before: salary=" + harry.getSalary());
		tripleSalary(harry);
		System.out.println("After: salary=" + harry.getSalary());
		
		/*
		 * Test3
		 */
		Employee a = new Employee("harry", 3000);
		Employee b = new Employee("bob", 5000);
		System.out.println("Before: a=" + a.getName());
		System.out.println("Before: b=" + b.getName());
		swap(a, b);
		System.out.println("After: a=" + a.getName());
		System.out.println("After: b=" + b.getName());
		
	}
	
	private static void tripleValue(double x) {
		x = 3 * x;
		System.out.println("End of method: x=" + x);
	}
	
	public static void tripleSalary(Employee x) {
		x.raiseSalary(200);
		System.out.println("End of method: salary=" + x.getSalary());
	}
	
	public static void swap(Employee a, Employee b) {
		Employee temp = a;
		a = b;
		b = temp;
		System.out.println("End of method: a=" + a.getName());
		System.out.println("End of method: b=" + b.getName());
	}
}

class Employee {
	private String name;
	private double salary;
	
	public Employee(String name, double salary) {
		this.name = name;
		this.salary = salary;
	}
	
	public String getName() {
		return name;
	}
	
	public double getSalary() {
		return salary;
	}
	
	public void raiseSalary(double byPersent) {
		double raise = salary * byPersent / 100;
		salary += raise;
	}
}