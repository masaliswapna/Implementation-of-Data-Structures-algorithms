package SortingAlgorithms;

import java.util.Scanner;

public class QuickSort {

	public static void quickSort(int[] arr, int low, int high) {
		if (low < high) {
			int pivotIndex = partition(arr, low, high);

			quickSort(arr, low, pivotIndex - 1);
			quickSort(arr, pivotIndex + 1, high);
		}
	}

	private static int partition(int[] arr, int low, int high) {
	    int pivot = arr[high];  // <-- Potential issue if high is out of bounds
	    int i = low - 1;

	    for (int j = low; j < high; j++) {
	        if (arr[j] <= pivot) {
	            i++;
	            swap(arr, i, j);
	        }
	    }

	    swap(arr, i + 1, high);
	    return i + 1;
	}

	private static void swap(int[] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}

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
		quickSort(arr, 0, arr.length-1);
		System.out.println("Array elements after sorting");
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]+" ");
		}
	}
}

