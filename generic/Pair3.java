package generic;

import java.time.LocalDate;

public class Pair3 {
	public static void main(String[] args) {
		Manager ceo = new Manager("A", 2000, 1998, 2, 6);
		Manager cfo = new Manager("B", 1800, 1999, 5, 8);
		Pair<Manager> buddies = new Pair<>(ceo, cfo);
		printBuddies(buddies);
		
		ceo.setBonus(500);
		cfo.setBonus(600);
		Manager[] managers = {ceo, cfo};
		
		Pair<Employee> result = new Pair<>();
		minmaxBonus(managers, result);
		System.out.println("first: " + result.getFirst().getName() +", second: " + result.getSecond().getName());
		maxminBonus(managers, result);
		System.out.println("first: " + result.getFirst().getName() +", second: " + result.getSecond().getName());
	}
	
	public static void printBuddies(Pair<? extends Employee> p) {
		Employee first = p.getFirst();
		Employee second = p.getSecond();
		System.out.println(first.getName() + " and " + second.getName() + " are buddise");
	}
	
	public static void minmaxBonus(Manager[] a, Pair<? super Manager> result) {
		if (a.length == 0) return;
		Manager min = a[0];
		Manager max = a[0];
		for (int i = 0; i < a.length; i++) {
			if(min.getBonus() > a[i].getBonus())
				min = a[i];
			if(max.getBonus() < a[i].getBonus())
				max = a[i];
		}
		result.setFirst(min);
		result.setScond(max);
	}
	
	public static void maxminBonus(Manager[] a, Pair<? super Manager> result) {
		minmaxBonus(a, result);
		PairAlg3.swap(result);
	}
}

class PairAlg3 {
	public static boolean hasNulls(Pair<?> p) {
		return p.getFirst() == null || p.getSecond() == null;
	}
	public static <T> void swap(Pair<T> p) {
		T t = p.getFirst();
		p.setFirst(p.getSecond());
		p.setScond(t);
	}
}

class Employee {
	private double salary;
	private String name;
	private LocalDate hireDay;
	
	public Employee(String name, double salary, int year, int month, int day) {
		this.salary = salary;
		this.name = name;
		hireDay = LocalDate.of(year, month, day);
	}
	public String getName() {
		return name;
	}
	public double getSalary() {
		return salary;
	}
}

class Manager extends Employee {
	private double bonus;
	
	public Manager(String name, double salary, int year, int month, int day) {
		super(name, salary, year, month, day);
		this.bonus = 0;
	}
	public void setBonus(double bonus) {
		this.bonus = bonus;
	}
	public double getBonus() {
		double baiseSalary = super.getSalary();
		return baiseSalary += bonus;
	}
}
