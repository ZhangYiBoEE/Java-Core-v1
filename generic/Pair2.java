package generic;

import java.time.LocalDate;

public class Pair2 {
	public static void main(String[] args) {
		LocalDate[] birthdays = {
			LocalDate.of(1992, 1, 1),
			LocalDate.of(1992, 6, 5),
			LocalDate.of(1991, 10, 1),
		};
		Pair<LocalDate> p = ArrayAlg2.minmax(birthdays);
		System.out.println("max = " + p.getFirst());
		System.out.println("min = " + p.getSecond());
	}
}

class ArrayAlg2 {
	public static <T extends Comparable> Pair<T> minmax(T[] a) {
		if (a == null || a.length < 0)
			return null;
		T max = a[0];
		T min = a[0];
		for (int i = 0;i < a.length; i++) {
			if (min.compareTo(a[i]) > 0) min = a[i];
			if (max.compareTo(a[i]) < 0) max = a[i];
		}
		return new Pair<>(max, min);
	}
}
