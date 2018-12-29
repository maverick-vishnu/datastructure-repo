package com.lowes.vishnu.warmup;

import java.util.Scanner;

public class PlusMinus {

	static void plusMinus(int[] arr) {
        /*
         * Write your code here.
         */
        double size=arr.length;
        double pos=0;
        double neg=0;
        double zero=0;
        for(int i=0; i< size ;i++){
            if(arr[i] > 0){
                pos=pos+1;
            }
            else if(arr[i] < 0){
                neg =neg+1;
            }
            else{
                zero=zero+1;
            }
        }
        System.out.printf("%1$.6f\n", pos/size);
        System.out.printf("%1$.6f\n", neg/size);
        System.out.printf("%1$.6f\n", zero/size);

    }

    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        int n = Integer.parseInt(scan.nextLine().trim());

        int[] arr = new int[n];

        String[] arrItems = scan.nextLine().split(" ");

        for (int arrItr = 0; arrItr < n; arrItr++) {
            int arrItem = Integer.parseInt(arrItems[arrItr].trim());
            arr[arrItr] = arrItem;
        }

        plusMinus(arr);
    }
}
