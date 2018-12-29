package com.lowes.vishnu.warmup;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class DrawingBook {
	static int pageCount(int n, int p) {
        /*
         * Write your code here.
         */
      
    return Math.min(p/2, n/2-p/2);

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])*");

        int p = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])*");

        int result = pageCount(n, p);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
    //Other solution
    /*static int pageCount(int n, int p) {
    		int page1 = Math.abs((p) / 2);
    		if(n%2==0){
    			n++;
    		}
    		int page2 = Math.abs((p - (n)) / 2);
    		return page1 < page2 ? page1 : page2;
    }*/
}
