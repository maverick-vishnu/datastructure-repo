package com.lowes.vishnu.warmup;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class SockMerchant {

	static int sockMerchant(int n, int[] ar) {
        HashMap<Integer, Integer> counts = new HashMap<Integer, Integer>();
        int sock=0;
  for (int i = 0; i < ar.length; ++i) {
      int item = ar[i];

      if (counts.containsKey(item))
          counts.put(item, counts.get(item) + 1);
      else
          counts.put(item, 1);
    }
  for (Map.Entry<Integer, Integer> map : counts.entrySet()) {
      int value= map.getValue();
      if( (value % 2 ==0 || value % 2 ==1) && value >=2){
          sock =sock+value/2;
      }
  }
        return sock;
}

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] ar = new int[n];

        String[] arItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int arItem = Integer.parseInt(arItems[i]);
            ar[i] = arItem;
        }

        int result = sockMerchant(n, ar);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
