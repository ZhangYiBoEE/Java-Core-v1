package collection;

import java.util.*;

import javax.swing.DefaultFocusManager;

public class TreeSetTest {
	public static void main(String[] args) {
		SortedSet<Item> parts = new TreeSet<>();
		parts.add(new Item("c", 1234));
		parts.add(new Item("b", 2345));
		parts.add(new Item("a", 3456));
		System.out.println(parts);
		
		NavigableSet<Item> sortByDescription = new TreeSet<>(Comparator.comparing(Item::getDescription));
		sortByDescription.addAll(parts);
		System.out.println(parts);
	}
}

class Item implements Comparable<Item> {
	private String description;
	private int partNumber;
	
	public Item(String description, int partNumber) {
		this.description = description;
		this.partNumber = partNumber;
	}
	public String getDescription() {
		return description;
	}
	public String toString() {
		return "desciption: " + description + ", partNumber: " + partNumber;
	}
	
	public boolean equals(Object otherObj) {
		if (this == otherObj)
			return true;
		if (otherObj == null)
			return false;
		if (getClass() != otherObj.getClass())
			return false;
		Item obj = (Item) otherObj;
		return Objects.equals(description, obj.description) && partNumber == obj.partNumber;
	}
	
	public int hashCode() {
		return Objects.hash(description,  partNumber);
	}
	
	@Override
	public int compareTo(Item other) {
		int diff = Integer.compare(partNumber, other.partNumber);
		return diff != 0 ? diff : description.compareTo(other.description);
	}
	
}
