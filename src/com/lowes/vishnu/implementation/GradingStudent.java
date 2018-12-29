package com.lowes.vishnu.implementation;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GradingStudent {
	static int[] gradingStudents(int[] grades) {
        /*
         * Write your code here.
         */
        int len = grades.length;
        List<Integer> list = new ArrayList<Integer>();
        for(int i=0; i<len ;i++){
            if(grades[i] <38){
                list.add(grades[i]);
            }
            else{
                int rem = grades[i]%5;
                if(rem >=3){
                   list.add(grades[i]+5-rem); 
                }
                else{
                    list.add(grades[i]);
                }
            }
        }
        
        int [] round = list.stream().mapToInt(Integer ::intValue).toArray();
        return round;

    }

    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = Integer.parseInt(scan.nextLine().trim());

        int[] grades = new int[n];

        for (int gradesItr = 0; gradesItr < n; gradesItr++) {
            int gradesItem = Integer.parseInt(scan.nextLine().trim());
            grades[gradesItr] = gradesItem;
        }

        int[] result = gradingStudents(grades);

        for (int resultItr = 0; resultItr < result.length; resultItr++) {
            bw.write(String.valueOf(result[resultItr]));

            if (resultItr != result.length - 1) {
                bw.write("\n");
            }
        }

        bw.newLine();

        bw.close();
    }

}
