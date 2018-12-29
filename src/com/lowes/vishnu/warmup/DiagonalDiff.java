package com.lowes.vishnu.warmup;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class DiagonalDiff {
	static int diagonalDifference(int[][] a) {
        /*
         * Write your code here.
         */
        int leftD=0;
        int rightD=0;
        for(int j = 0; j < a.length; j++){
            for(int k = 0; k < a.length; k++){
                if(j == k){
                    leftD += a[j][k];
                }
            if(j+k == (a.length-1)){
                rightD += a[j][k];
            }
      }
 }
    return Math.abs(leftD-rightD);

    }

    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = Integer.parseInt(scan.nextLine().trim());

        int[][] a = new int[n][n];

        for (int aRowItr = 0; aRowItr < n; aRowItr++) {
            String[] aRowItems = scan.nextLine().split(" ");

            for (int aColumnItr = 0; aColumnItr < n; aColumnItr++) {
                int aItem = Integer.parseInt(aRowItems[aColumnItr].trim());
                a[aRowItr][aColumnItr] = aItem;
            }
        }

        int result = diagonalDifference(a);

        bw.write(String.valueOf(result));
        bw.newLine();

        bw.close();
    }

}
