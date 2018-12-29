package com.lowes.vishnu.warmup;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class CountingValleys {
	static int countingValleys(int n, String s) {
	     int valley=0;
	     int level=0;
	        for(char ch : s.toCharArray()){
	            if(ch =='D'){
	                level--;
	            }
	            if(ch =='U'){
	                level++;
	            }
	            if(level==0 && ch=='U'){
	                valley++;
	            }
	        }
	        return valley;
	    }

	    private static final Scanner scanner = new Scanner(System.in);

	    public static void main(String[] args) throws IOException {
	        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

	        int n = scanner.nextInt();
	        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

	        String s = scanner.nextLine();

	        int result = countingValleys(n, s);

	        bufferedWriter.write(String.valueOf(result));
	        bufferedWriter.newLine();

	        bufferedWriter.close();

	        scanner.close();
	    }
}
