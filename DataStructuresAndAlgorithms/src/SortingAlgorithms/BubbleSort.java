package SortingAlgorithms;

public class BubbleSort {
	public void Bubble(int arr[]) {
		int temp;
		for (int i = 0; i <= arr.length-2; i++) {
			for (int j = 0; j <= arr.length-2-i; j++) {
				if(arr[j]>arr[j+1]) {
					temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}

		}
	}
}
