package SortingAlgorithms;

import java.util.Scanner;

public class MergeSort {

	public static void mergeSort(int[] arr) {
		if (arr.length > 1) {
			int mid = arr.length / 2;
			int[] leftArray = new int[mid];
			int[] rightArray = new int[arr.length - mid];

			System.arraycopy(arr, 0, leftArray, 0, mid);
			System.arraycopy(arr, mid, rightArray, 0, arr.length - mid);

			mergeSort(leftArray);
			mergeSort(rightArray);

			merge(arr, leftArray, rightArray);
		}
	}

	private static void merge(int[] arr, int[] leftArray, int[] rightArray) {
		int i = 0, j = 0, k = 0;

		while (i < leftArray.length && j < rightArray.length) {
			if (leftArray[i] <= rightArray[j]) {
				arr[k++] = leftArray[i++];
			} else {
				arr[k++] = rightArray[j++];
			}
		}

		while (i < leftArray.length) {
			arr[k++] = leftArray[i++];
		}

		while (j < rightArray.length) {
			arr[k++] = rightArray[j++];
		}
	}

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter array length");
		int n=scan.nextInt();
		int arr[]=new int[n];
		System.out.println("Enter array elements");
		System.out.println("Enter array elements");
		for (int i = 0; i < arr.length; i++) {
			System.out.println("Enter an element");
			arr[i]=scan.nextInt();
		}
		System.out.println("Array elements before sorting");
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]+" ");
		}
		mergeSort(arr);
		System.out.println("Array elements after sorting");
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]+" ");
		}
	}
}
