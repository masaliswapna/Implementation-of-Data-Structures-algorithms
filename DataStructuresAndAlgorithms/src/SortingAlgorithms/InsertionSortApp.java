package SortingAlgorithms;

import java.util.Scanner;

public class InsertionSortApp {
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
		System.out.println("Array elements before sorting");
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]+" ");
		}
		InsertionSort is=new InsertionSort();
		is.insertion(arr);
		System.out.println("Array elements after sorting");
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]+" ");
		}
	}
}
