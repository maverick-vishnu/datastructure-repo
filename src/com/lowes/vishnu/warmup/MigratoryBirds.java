package com.lowes.vishnu.warmup;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class MigratoryBirds {

static int migratoryBirds(int n, int[] ar) {
        
	int array[] = new int[n];
    for(int i = 0; i < n ; i++ )
    	array[ar[i]]++; 
    int max = 0,maxpos=0;
    for(int i = 0 ; i < n ; i++)
        {
        if(array[i] > max)
            {
            max = array[i];
            maxpos = i;
        }
    }
    return maxpos;
    }
                     
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int arCount = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] ar = new int[arCount];

        String[] arItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int arItr = 0; arItr < arCount; arItr++) {
            int arItem = Integer.parseInt(arItems[arItr]);
            ar[arItr] = arItem;
        }
        int result = migratoryBirds(arCount, ar);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
