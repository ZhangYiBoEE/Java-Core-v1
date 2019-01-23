package lambda;

import java.util.Arrays;
import java.util.Date;

import javax.swing.JOptionPane;
import javax.swing.Timer;

public class LambdaTest {
	public static void main(String[] args) {
		String[] jb = new String[] {"j3", "j22", "j111"};
		System.out.println(Arrays.toString(jb));
		System.out.println("sorted in dictionary order");
		Arrays.sort(jb);
		System.out.println(Arrays.toString(jb));
		
		System.out.println("sorted by length");
		Arrays.sort(jb, (first, second) -> first.length() - second.length());
		System.out.println(Arrays.toString(jb));
		
		Timer t = new Timer(1000, e -> 
							System.out.println("the time is " + new Date()));
		t.start();
		JOptionPane.showMessageDialog(null, "Quit program?");
		System.exit(0);
	}
}
