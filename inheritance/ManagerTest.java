package inheritance;

public class ManagerTest {
	public static void main(String[] args) {
		Manager boss = new Manager("Elbert", 3000, 2015, 1, 1);
		boss.setBonus(200);
		Employee[] staff = new Employee[3];
		
		staff[0] = boss;
		staff[1] = new Employee("Jb", 1000, 2016, 5, 6);
		staff[2] = new Employee("Gd", 2500, 2017, 1, 1);
		
		for (Employee e : staff) {
			System.out.println("name=" + e.getName() + " salary=" + e.getSalary());
		}
		
		if (boss.getClass() != Manager.class) 
			System.out.println("yes");
	}
}
