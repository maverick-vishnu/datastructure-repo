package com.lowes.vishnu.warmup;

import java.util.Scanner;

public class StairCase {

	/*static void staircase(int n) {
        
         * Write your code here.
         
        int [][] ar = new int [n][n];
        
        for(int i=0; i< n;i++){
            for(int j = 0; j <= n-i-2; j++){
                System.out.print(" ");
            }
            for(int j = n-i-1 ; j< n; j++){
                System.out.print("#");
            }
            System.out.println("");  
        }

    }

    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        int n = Integer.parseInt(scan.nextLine().trim());

        staircase(n);
    }*/
	
	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String str="#";
        for (int i=0;i<n;i++)
            { 
            System.out.printf("%"+(n+1)+"s",str+"\n");
            str=str+"#";
        }
    }
}
