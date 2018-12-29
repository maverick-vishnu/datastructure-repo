package com.lowes.vishnu.warmup;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class BreakingTheRecords {
	static int[] breakingRecords(int[] score) {
        /*
         * Write your code here.
         */
        int minCount=0,maxCount=0;
        int [] count = new int [2];
        int max=score[0];
        int min=score[0];
        for(int i=0; i<score.length;i++){
           
            
            if(max <score[i]){
                max=score[i];
                maxCount++;
            }
            else if( min > score[i]) {
                min=score[i];
                minCount++;
            }
        }
        count[0]=maxCount;
        count[1]=minCount;
        return count;

    }

    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = Integer.parseInt(scan.nextLine().trim());

        int[] score = new int[n];

        String[] scoreItems = scan.nextLine().split(" ");

        for (int scoreItr = 0; scoreItr < n; scoreItr++) {
            int scoreItem = Integer.parseInt(scoreItems[scoreItr].trim());
            score[scoreItr] = scoreItem;
        }

        int[] result = breakingRecords(score);

        for (int resultItr = 0; resultItr < result.length; resultItr++) {
            bw.write(String.valueOf(result[resultItr]));

            if (resultItr != result.length - 1) {
                bw.write(" ");
            }
        }

        bw.newLine();

        bw.close();
    }

}
