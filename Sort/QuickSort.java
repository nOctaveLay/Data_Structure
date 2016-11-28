
public class QuickSort {
	private int[] array;
	private int length;
 
	public void sort(int[] inputArr) {
			
			if (inputArr == null || inputArr.length == 0) {
				return;
			}
			////////////////////
			array = inputArr;
			length = inputArr.length;
			quickSort(0,length-1);
			/////////////////////
	}

	private void quickSort(int low, int high) {

		int k = (low+high)/2;
		int pivot = array[k];
		int i = low;
		int j = high;
		boolean lc;
		boolean rc;
		if (i >= j){return;}

		// Divide into two arrays
		while (i < j) {
			lc = true; rc = true;
			if (pivot > array[i]){
				lc = false;
				i++;
			}
			if (pivot < array[j]){
				rc = false;
				j--;
			}
			if(lc && rc){
				if (i == k){
					k = j;
				}
				else if (j == k){
					k = i;
				}
				swap(i,j);
			}
		}
		// call quickSort() method recursively
		quickSort(low,k-1);
		quickSort(k+1,high);
	
	}

	private void swap(int i, int j) {
			int temp = array[i];
			array[i] = array[j];
			array[j] = temp;
	}
}