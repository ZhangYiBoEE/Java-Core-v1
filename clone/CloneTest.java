package clone;

public class CloneTest {
	public static void main (String[] args) {
		try {
		Employee original = new Employee("John", 5000);
		original.setHireDay(2015, 5, 1);
		Employee copy = original.clone();
		copy.raiseSalary(10);
		System.out.println(original.toString());
		System.out.println(copy.toString());
		} 
		catch (CloneNotSupportedException e) {
			// TODO �Զ����ɵ� catch ��
			e.printStackTrace();
		}
		
	}
}
