package com.lowes.vishnu.sort;

public class MergeSort {
 
	public void mergeSort(int [] arr) {
		int len =arr.length;
		if(len < 2) {
			return;
		}
		int mid = len/2;
		int [] left = new int[mid];
		int [] right =new int[len-mid];
		for(int i=0 ;i < mid ;i++) {
			left[i] = arr[i];
		}
		for(int i=mid ;i < len-1 ;i++) {
			right[i-mid] = arr[i];
		}
		mergeSort(left);
		mergeSort(right);
		merge(left ,right ,arr);
	}
	
	public void merge(int [] left ,int [] right ,int [] arr) {
		int leftLen = left.length;
		int rightLen =right.length;
		int i=0 ,j=0, k=0;
		while(i< leftLen && j < rightLen) {
			if()
		}
	}
	public static void main(String [] args) {
		int arr[] = {2,1,4,3,5,7,8,6};
		MergeSort sort = new MergeSort();
		sort.mergeSort(arr);
	}
}
