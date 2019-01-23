package exception;

import java.util.Scanner;

public class StackTraceTest {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter n: ");
		int n = in.nextInt();
		factorial(n);
	}
	
	public static int factorial(int n) {
		System.out.println("factorial(" + n + "):");
		Throwable stack = new Throwable();
		StackTraceElement[] frames = stack.getStackTrace();
		for (StackTraceElement s : frames) {
			System.out.println(s);
		}
		int r;
		if (n <= 1) {
			r = 1;
		}
		else {
			r = n * factorial(n-1);
		}
		System.out.println("return " + r);
		return r;
	}
}
