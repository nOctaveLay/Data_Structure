
public class MergeSort {
	private int[] array;
	private int[] helper;

	private int size;

	public void sort(int[] inputArr) { 
		if (inputArr == null || inputArr.length == 0) {
			return;
		}
		////////////////
		size = inputArr.length;
		this.array = inputArr;
		this.helper = new int[size];
		mergesort(0, size-1);
		///////////////
	}

	private void mergesort(int low, int high) {
		// check if low is smaller then high, if not then the array is sorted
		int mid = (low+high)/2;
		//mergesort(mid+1,high);
		if (low < high) {
		mergesort(low,mid);
		mergesort(mid+1,high);
		merge(low,mid,high);
		}
	}

	private void merge(int low, int middle, int high) {

		// Copy both parts into the helper array
		// System.out.print("helper: ");
		for (int i = low; i <= high; i++) {
			helper[i] = array[i];
		}
		int i = low;
		int j = middle+1;
		int k = low;
		// Copy the smallest value from either the left or the right side back
		// to the original array
		
		while (i <= middle && j <= high){
			if (helper[i] < helper[j])
			{
				array[k] = helper[i];
				i++;
			}
			else{
				array[k] = helper[j];
				j++;
			}
			k++;
		}
		if (i > middle){
			while(j<= high){
				array[k] = helper[j];
				j++;
				k++; 
			}
		}
		else {
			while (i <= middle){
				array[k] = helper[i];
				k++; i++;
			}
		}
	// Copy the rest of the left side of the array into the target array
	}
}