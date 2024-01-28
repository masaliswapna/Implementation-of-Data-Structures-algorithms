package DataStructures;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class TreeMapExample{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Creating a TreeMap
        Map<String, Integer> treeMap = new TreeMap<>();

        // Adding key-value pairs based on user input
        System.out.print("Enter name: ");
        String name = scan.nextLine();
        System.out.print("Enter age: ");
        int age = scan.nextInt();
        treeMap.put(name, age);

        // Iterating over key-value pairs
        for (Map.Entry<String, Integer> entry : treeMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        scan.close();
    }
}
