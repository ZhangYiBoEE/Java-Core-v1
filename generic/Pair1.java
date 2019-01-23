package generic;

public class Pair1 {
	public static void main(String[] args) {
		String[] words = {"I", "want", "to", "fuck", "her"};
		Pair<String> m = ArrayAlg.minmax(words);
		System.out.println("max = " + m.getFirst());
		System.out.println("min = " + m.getSecond());
	}
}

class ArrayAlg {
	public static Pair<String> minmax(String[] a) {
		if (a.length == 0 || a == null)
			return null;
		String min = a[0];
		String max = a[0];
		for (int i = 0; i < a.length; i ++) {
			if (min.compareTo(a[i]) > 0)
				min = a[i];
			if (max.compareTo(a[i]) < 0)
				max = a[i];
		}
		return new Pair<>(max, min);
		//return new test();
	}
}

class Pair<T> {
	private T first;
	private T second;
	
	public Pair() {
		first = null;
		second = null;
	}
	
	public Pair(T a, T b) {
		first = a;
		second = b;
	}
	
	public T getFirst() {
		return first;
	}
	
	public T getSecond() {
		return second;
	}
	
	public void setFirst(T first) {
		this.first = first;
	}
	
	public void setScond(T second) {
		this.second = second;
	}
}