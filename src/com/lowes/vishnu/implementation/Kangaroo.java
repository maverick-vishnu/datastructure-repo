package com.lowes.vishnu.implementation;

import java.util.Scanner;

public class Kangaroo {

	static String kangaroo(int x1, int v1, int x2, int v2) {
	      
        if(v2>=v1 && x1!=x2){
            return "NO";
        }
       else{
           float x = (float)(x2-x1)/(v1-v2);
        if( Math.floor(x) == x )
           return "YES";
        else
           return "NO";
      }    
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x1 = in.nextInt();
        int v1 = in.nextInt();
        int x2 = in.nextInt();
        int v2 = in.nextInt();
        String result = kangaroo(x1, v1, x2, v2);
        System.out.println(result);
    }
}
