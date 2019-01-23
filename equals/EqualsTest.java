package equals;

public class EqualsTest {
	public static void main(String[] args) {
		Employee alice1 = new Employee("Alice", 5000, 2015, 5, 1);
		Employee alice2 = alice1;
		Employee alice3 = new Employee("Alice", 5000, 2015, 5, 1);
		Employee bob = new Employee("Bob", 6000, 2016, 5, 1);
		
		System.out.println("alice1 == alice2: " + (alice1 == alice2));
		System.out.println("alice1 == alice3: " + (alice1 == alice3));
		System.out.println("alice1.equals(alice3): " + alice1.equals(alice3));
		System.out.println("alice1.equals(bob): " + alice1.equals(bob));
		System.out.println("bob.toString(): " + bob);
		
		Manager elbert = new Manager("Elnert", 6000, 2017, 5, 1);
		Manager boss = new Manager("Elbert", 6000, 2017, 5, 1);
		boss.setBonus(500);
		
		System.out.println("boss.toString(): " + boss);
		System.out.println("boss.equals(Elbert): " + boss.equals(elbert));
		System.out.println("alice1.hashCode(): " + alice1.hashCode());
		System.out.println("alice3.hashCode(): " + alice3.hashCode());
		System.out.println("bob.hashCode(): " + bob.hashCode());
		System.out.println("elbert.hashCode(): " + elbert.hashCode());
	}
}
