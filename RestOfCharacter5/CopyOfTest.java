package RestOfCharacter5;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class CopyOfTest {

	public static void main(String[] args) {
		int[] a = {1, 2, 3};
		a = (int[])goodCopyOf(a, 10);
		System.out.println(Arrays.toString(a));
		
		String[] b = {"a", "b", "c"};
		b = (String[]) goodCopyOf(b, 6);
		System.out.println(Arrays.toString(b));
	}
	
	public static Object[] badCopyOf(Object[] a, int newLength) {
		Object[] newArray = new Object[newLength];
		System.arraycopy(a, 0, newArray, 0, newLength);
		return newArray;
	}
	
	public static Object goodCopyOf(Object a, int newLength) {
		Class cl = a.getClass();
		if (!cl.isArray())
			return null;
		Class type = cl.getComponentType();
		int length = Array.getLength(a);
		Object newArray = Array.newInstance(type, newLength);
		int min = Math.min(length, newLength);
		System.out.println(length + " " + newLength + " " +min);
		System.arraycopy(a, 0, newArray, 0, min);
		return newArray;
	}
}
