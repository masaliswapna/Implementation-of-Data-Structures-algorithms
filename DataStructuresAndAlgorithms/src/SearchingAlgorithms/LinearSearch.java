package SearchingAlgorithms;

import java.util.Scanner;

public class LinearSearch {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter Array length");
		int n=scan.nextInt();
		int arr[]=new int[n];
		System.out.println("Enter array elements");
		for (int i = 0; i < arr.length; i++) {
			System.out.println("Enter an element");
			arr[i]=scan.nextInt();
		}
		System.out.println("Enter key to search");
		int key=scan.nextInt();
		for (int i = 0; i < arr.length; i++) {
			if(key==arr[i]) {
				System.out.println("Key fount at index "+i);
				System.exit(0);
			}
		}
		System.out.println("Key not found");
	}
}
