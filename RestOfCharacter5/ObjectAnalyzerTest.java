package RestOfCharacter5;

import java.util.ArrayList;

public class ObjectAnalyzerTest {
	public static void main(String[] args) {
		ArrayList<Integer> squares = new ArrayList<>();
		for (int i = 0; i <= 5; i++)
			squares.add(i);
		String OA = new ObjectAnalyzer().toString(squares);
		System.out.println(OA);
	}
}
