package collection;

import java.time.LocalDate;
import java.util.*;

public class PriorityQueueTest {
	public static void main (String[] args) {
		PriorityQueue<LocalDate> pq = new PriorityQueue<>();
		pq.add(LocalDate.of(1992, 8, 9));
		pq.add(LocalDate.of(1992, 8, 25));
		pq.add(LocalDate.of(1992, 8, 12));

		System.out.println("all");
		for (LocalDate date : pq)
			System.out.println(date);
		System.out.println("removing");
		while (!pq.isEmpty())
			System.out.println(pq.remove());
	}
}
