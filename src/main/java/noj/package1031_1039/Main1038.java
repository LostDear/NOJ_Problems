package noj.package1031_1039;

import java.io.*;

/**
 * @Author: 少女的迷鹿
 * @Description: Guess
 */
public class Main1038 {

    public static final StreamTokenizer ST = new StreamTokenizer(new BufferedReader(new InputStreamReader(System.in)));

    public static final PrintWriter PW = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));

    public static void main(String[] args) {
        final int n = (int) readNumber(), MAX_SUM = (int) readNumber();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = (int) readNumber();
        }
        int ans = 0;
        int[][] dp = new int[n][MAX_SUM + 1];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= MAX_SUM; j++) {
                if (i == 0) {
                    dp[i][j] = j >= nums[i] ? nums[i] : 0;
                } else {
                    if (j >= nums[i]) {
                        dp[i][j] = Math.max(
                                dp[i - 1][j], dp[i - 1][j - nums[i]] + nums[i]
                        );
                    } else {
                        dp[i][j] = dp[i - 1][j];
                    }
                }
                ans = Math.max(ans, dp[i][j]);
            }
        }
        PW.println(ans);
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
