package collection;

import java.util.HashMap;
import java.util.Map;

public class MapTest {
	public static void main(String[] args) {
		Map<String, Employee> staff = new HashMap<>();
		staff.put("1", new Employee("a"));
		staff.put("2", new Employee("b"));
		staff.put("3", new Employee("c"));
		staff.put("4", new Employee("d"));

		System.out.println(staff);
		staff.remove("2");
		
		staff.put("5", new Employee("e"));
		System.out.println(staff.get("5"));
		
		staff.forEach((k, v) ->
				System.out.println("key=" + k + ", value=" + v));
	}
}

class Employee {
	private String name;
	public Employee(String name) {
		this.name = name;
	}
}