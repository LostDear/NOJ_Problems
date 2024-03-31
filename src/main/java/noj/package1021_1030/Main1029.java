package noj.package1021_1030;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

/**
 * @Author: 少女的迷鹿
 * @Description: Guess
 */
public class Main1029 {

    public static final StreamTokenizer ST = new StreamTokenizer(new BufferedReader(new InputStreamReader(System.in)));

    public static final PrintWriter PW = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));


    public static void main(String[] args) {
        int n = (int) readNumber();
        Map<Integer,Integer> count = new HashMap<>();
        int max = 0;
        for (int i = 0; i < n; i++) {
            int a = (int) readNumber(), b = (int) readNumber();
            int aCount = count.getOrDefault(a, 0) + 1;
            int bCount = count.getOrDefault(b, 0) + 1;
            count.put(a, aCount);
            count.put(b, bCount);
            max = Math.max(max, Math.max(aCount, bCount));
        }
        PW.println(max);
        PW.flush();
    }

    public static void nextToken() {
        try {
            ST.nextToken();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    public static double readNumber() {
        nextToken();
        return ST.nval;
    }

    static String readString() {
        nextToken();
        return ST.sval;
    }
}
