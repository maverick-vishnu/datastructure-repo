package com.lowes.vishnu.strings;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Pangrams {

	static String pangrams(String s) {
        String str = s.replaceAll(" ","").toLowerCase();
        Set<Character> set = new HashSet<>();
        for(int i=0; i < str.length(); i++){
            set.add(str.charAt(i));
        }
        if(set.size() == 26){
            return "pangram";
        }
        else{
            return "not pangram";
        }
     
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = scanner.nextLine();

        String result = pangrams(s);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
