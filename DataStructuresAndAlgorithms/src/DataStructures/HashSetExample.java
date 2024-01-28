package DataStructures;


	import java.util.HashSet;
	import java.util.Scanner;
	import java.util.Set;

	public class HashSetExample {
	    public static void main(String[] args) {
	        Scanner scan = new Scanner(System.in);

	        // Creating a HashSet
	        Set<String> hashSet = new HashSet<>();

	        // Adding elements based on user input
	        System.out.print("Enter fruit: ");
	        String fruit = scan.nextLine();
	        hashSet.add(fruit);

	        // Checking if an element exists
	        System.out.println("Contains " + fruit + ": " + hashSet.contains(fruit));

	        // Iterating over elements
	        for (String item : hashSet) {
	            System.out.println(item);
	        }

	        scan.close();
	    }
	}


