package com.lowes.vishnu.warmup;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class TimeConversion {

	static String timeConversion(String s) {
        /*
         * Write your code here.
         */
        String ret =null;
        if(s.contains("AM")){
            ret = s.substring(0 ,s.length()-2);
        }
        if(s.contains("PM")){
            String time = s.substring(0 ,s.length()-2);
            int a=12;
            String s1 = time.substring(0,2);
            int sum = Integer.valueOf(s1);
            sum =sum+a;
            
            ret =sum+time.substring(2,s.length()-2);
            
        }
        return ret;
    }

    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = scan.nextLine();

        String result = timeConversion(s);

        bw.write(result);
        bw.newLine();

        bw.close();
    }
}
