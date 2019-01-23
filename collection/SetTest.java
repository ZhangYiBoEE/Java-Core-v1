package collection;

import java.util.*;

public class SetTest {
	public static void main(String[] args) {
		Set<String> words = new HashSet<>();
		long totalName = 0;
		Scanner in = new Scanner(System.in);
		
		while (in.hasNext()) {
			String word = in.next();
			long callTime = System.currentTimeMillis();
			words.add(word);
			callTime = System.currentTimeMillis() - callTime;
			totalName += callTime;
		}
		Iterator<String> iter = words.iterator();
		for (int i = 0; i <= 20 && iter.hasNext(); i++) {
			System.out.println(iter.next());
		}
		
		System.out.println("...");
		System.out.println(words.size() + " distinct words. " + totalName + "milliseconds.");
	}
}
