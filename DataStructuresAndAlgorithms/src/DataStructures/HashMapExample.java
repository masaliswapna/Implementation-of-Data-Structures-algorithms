package DataStructures;


	import java.util.HashMap;
	import java.util.Map;
	import java.util.Scanner;

	public class HashMapExample{
	    public static void main(String[] args) {
	        Scanner scan = new Scanner(System.in);

	        // Creating a HashMap
	        Map<String, Integer> hashMap = new HashMap();
	        System.out.print("Enter name: ");
	        String name = scan.nextLine();
	        System.out.print("Enter age: ");
	        int age = scan.nextInt();
	        hashMap.put(name, age);

	        // Accessing elements
	        System.out.println("Age of " + name + ": " + hashMap.get(name));

	        // Iterating over key-value pairs
	        for (Map.Entry<String, Integer> entry : hashMap.entrySet()) {
	            System.out.println(entry.getKey() + ": " + entry.getValue());
	        }

	        scan.close();
	    }
	}

