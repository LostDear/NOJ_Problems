package noj.package1031_1039;

import java.io.*;

/**
 * @Author: 少女的迷鹿
 * @Description: Guess
 */
public class Main1032 {

    public static final StreamTokenizer ST = new StreamTokenizer(new BufferedReader(new InputStreamReader(System.in)));

    public static final PrintWriter PW = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));

    public static void main(String[] args) {
        int ROW_COUNT = (int) readNumber(), COL_COUNT = (int) readNumber();
        int[][] matrix = new int[ROW_COUNT][COL_COUNT];
        for (int i = 0; i < ROW_COUNT; i++) {
            for (int j = 0; j < COL_COUNT; j++) {
                matrix[i][j] = (int) readNumber();
            }
        }
        int cnt = 0;
        for (int i = 0; i < ROW_COUNT; i++) {
            for (int j = 0; j < COL_COUNT; j++) {
                if (matrix[i][j] == 1) {
                    cnt++;
                    update(matrix, i, j);
                }
            }
        }
        PW.println(cnt);
        PW.flush();
    }

    public static void update(int[][] matrix, int i, int j) {
        if (i < 0 || i >= matrix.length || j < 0 || j >= matrix[0].length || matrix[i][j] == 0) {
            return;
        }
        matrix[i][j] = 0;
        update(matrix, i - 1, j);
        update(matrix, i + 1, j);
        update(matrix, i, j - 1);
        update(matrix, i, j + 1);
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
