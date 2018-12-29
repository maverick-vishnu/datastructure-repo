package com.lowes.vishnu.warmup;

import java.util.Scanner;

public class BonAppétit {
	public static void main(String args[] ) throws Exception {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT */
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] bill = new int[n];
        for(int i=0 ;i < n ;i++){
            bill[i]=sc.nextInt();
        }
        int b = sc.nextInt();
        int sum=0;
        for(int i=0 ;i <bill.length ;i++){
            sum=sum+bill[i];
        }
        sum=sum-bill[k];
        if(b == sum/2){
            System.out.println("Bon Appetit");
        }
        else {
            System.out.println(b-sum/2);
        }
    }
}
