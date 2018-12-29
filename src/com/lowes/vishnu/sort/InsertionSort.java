package com.lowes.vishnu.sort;

public class InsertionSort {
	
	public void insertionSort(int [] arr) {
		int len =arr.length;
		for(int i=1; i<len ;i++) {
			int pick = arr[i];
			int j =i-1;
			while( j>=0 && pick <= arr[j]) {
				arr[j+1] =arr[j];
				j=j-1;
			}
			arr[j+1]=pick;
		}
		for(int a :arr) {
			System.out.print(a+" ");
		}
		
	}
	
	public static void main(String [] args) {
		int [] arr = {3,5,2,1,8,7,6};
		InsertionSort sort = new InsertionSort();
		sort.insertionSort(arr);
	}

 }
