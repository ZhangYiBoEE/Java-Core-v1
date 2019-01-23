package collection;

import java.util.*;

public class LinkListTest {
	public static void main(String[] args) {
		List<String> a = new LinkedList<>();
		a.add("Bob");
		a.add("Shiba");
		a.add("Alice");
		//System.out.println(a);

		List<String> b = new LinkedList<>();
		b.add("dog");
		b.add("cat");
		b.add("Snake");
		b.add("shit");
		
		ListIterator<String> aIter = a.listIterator();
		Iterator<String> bIter = b.iterator();
		System.out.println(a);

		while (bIter.hasNext()) {
			if (aIter.hasNext())
				aIter.next();
			aIter.add(bIter.next());
		}
		System.out.println(a);
		
		while (bIter.hasNext()) {
			bIter.next();
			if (bIter.hasNext()) {
				bIter.next();
				bIter.remove();
			}
		}
		System.out.println(b);
		a.removeAll(b);
		System.out.println(a);
	}
}

