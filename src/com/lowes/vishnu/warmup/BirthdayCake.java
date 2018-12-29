package com.lowes.vishnu.warmup;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class BirthdayCake {
	static int birthdayCakeCandles(int n, int[] ar) {
        /*
         * Write your code here.
         */
        int max=0;
        int count=0;
        for(int i=0; i< ar.length ;i++){
            if(ar[i] >= max){
                max=ar[i];
            }
        }
        for(int i = 0; i < n; i++){
            if (ar[i] == max)
            count++;
        }
        
       return count;
    }

    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = Integer.parseInt(scan.nextLine().trim());

        int[] ar = new int[n];

        String[] arItems = scan.nextLine().split(" ");

        for (int arItr = 0; arItr < n; arItr++) {
            int arItem = Integer.parseInt(arItems[arItr].trim());
            ar[arItr] = arItem;
        }

        int result = birthdayCakeCandles(n, ar);

        bw.write(String.valueOf(result));
        bw.newLine();

        bw.close();
    }
}
