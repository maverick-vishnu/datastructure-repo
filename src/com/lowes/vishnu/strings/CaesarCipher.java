package com.lowes.vishnu.strings;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class CaesarCipher {

	static String caesarCipher(String s, int k) {
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < s.length(); ++i) {
            sb.append(encryptChar(s.charAt(i), k));
        }
        
       return sb.toString();
     }
   private static char encryptChar(char c, int k) {
        if(!Character.isAlphabetic(c)) return c;
        int base = Character.isLowerCase(c) ? 'a' : 'A';
        return (char)((c + k - base) % 26 + base);
    }
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        String s = scanner.nextLine();

        int k = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        String result = caesarCipher(s, k);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
