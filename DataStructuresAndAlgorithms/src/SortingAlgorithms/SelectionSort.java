package SortingAlgorithms;

public class SelectionSort {
	public void selection(int arr[]) {
		int min;
		int pos;
		int temp;
		for (int i = 0; i <=arr.length-2; i++) {
			min=arr[i];
			pos=i;
			for (int j = i+1; j <= arr.length-1; j++) {
				if(arr[j]<min) {
					min=arr[j];
					pos=j;
				}
			}
			temp=arr[i];
			arr[i]=arr[pos];
			arr[pos]=temp;
		}

	}
}
