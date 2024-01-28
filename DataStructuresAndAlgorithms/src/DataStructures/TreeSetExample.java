package DataStructures;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetExample {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		// Creating a TreeSet
		Set<String> treeSet = new TreeSet<>();

		// Adding elements based on user input
		System.out.print("Enter fruit: ");
		String fruit = scan.nextLine();
		treeSet.add(fruit);

		// Iterating over elements (sorted)
		for (String item : treeSet) {
			System.out.println(item);
		}

		scan.close();
	}
}


