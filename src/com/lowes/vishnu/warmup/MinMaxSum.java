package com.lowes.vishnu.warmup;

import java.util.Scanner;

public class MinMaxSum {

	static void miniMaxSum(int[] arr) {
        /*
         * Write your code here.
         */
        int sum=0;
        int min =arr[0];
        int max =arr[0];
        for(int i=0; i< arr.length ;i++){
            if(arr[i] < min){
                min=arr[i];
            }
            if(arr[i] > max){
                max=arr[i];
            }
            sum =sum +arr[i];
        }
        int maxSum = sum-min;
        int minSum = sum-max;
       System.out.print(minSum+" "+maxSum);
    }

    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        int[] arr = new int[5];

        String[] arrItems = scan.nextLine().split(" ");

        for (int arrItr = 0; arrItr < 5; arrItr++) {
            int arrItem = Integer.parseInt(arrItems[arrItr].trim());
            arr[arrItr] = arrItem;
        }

        miniMaxSum(arr);
    }
}
