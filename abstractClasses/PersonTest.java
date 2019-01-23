package abstractClasses;

public class PersonTest {
	public static void main(String[] args) {
		Person[] people = new Person[2];
		
		people[0] = new Employee("Jack", 2000, 2016, 5, 1);
		people[1] = new Student("Malei", "math");
		
		for (Person person : people) {
			System.out.println(person.getName() + "," + person.getDescription());
		}
	}
}
