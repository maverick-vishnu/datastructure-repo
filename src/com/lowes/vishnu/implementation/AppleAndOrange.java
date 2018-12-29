package com.lowes.vishnu.implementation;

import java.util.Scanner;

public class AppleAndOrange {

	static void countApplesAndOranges(int s, int t, int a, int b, int[] apples, int[] oranges) {
        /*
         * Write your code here.
         */
        int Applecount=0;
        int Orangecount=0;
        for(int i =0 ;i<apples.length;i++){
           int d = a+apples[i];
            if( d>=s && d <=t){
                Applecount =Applecount+1;
            }   
        }
        for(int i =0 ;i<oranges.length;i++){
            int d = b+oranges[i];
            if( d>=s && d <=t){
                Orangecount =Orangecount+1;
            }
            
        }
        System.out.println(Applecount);
        System.out.println(Orangecount); 

    }

    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        String[] st = scan.nextLine().split(" ");

        int s = Integer.parseInt(st[0].trim());

        int t = Integer.parseInt(st[1].trim());

        String[] ab = scan.nextLine().split(" ");

        int a = Integer.parseInt(ab[0].trim());

        int b = Integer.parseInt(ab[1].trim());

        String[] mn = scan.nextLine().split(" ");

        int m = Integer.parseInt(mn[0].trim());

        int n = Integer.parseInt(mn[1].trim());

        int[] apple = new int[m];

        String[] appleItems = scan.nextLine().split(" ");

        for (int appleItr = 0; appleItr < m; appleItr++) {
            int appleItem = Integer.parseInt(appleItems[appleItr].trim());
            apple[appleItr] = appleItem;
        }

        int[] orange = new int[n];

        String[] orangeItems = scan.nextLine().split(" ");

        for (int orangeItr = 0; orangeItr < n; orangeItr++) {
            int orangeItem = Integer.parseInt(orangeItems[orangeItr].trim());
            orange[orangeItr] = orangeItem;
        }

        countApplesAndOranges(s, t, a, b, apple, orange);
    }
}
