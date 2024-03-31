package noj.package1003_1010;

import java.util.Scanner;

/**
 * @Author: 少女的迷鹿
 * @Description: Guess
 */
public class Main1005 {

    private final static Scanner scanner = new Scanner(System.in);

    private final static long MOD = (long) (1e9+7);


    public static void main(String[] args) {
        int n = scanner.nextInt();
        long[][] dp = new long[2][n];
        dp[0][0] = 6;dp[1][0] = 6;
        for (int i=1;i<n;++i) {
            dp[0][i] = (dp[0][i-1]*2+dp[1][i-1]*2)%MOD;
            dp[1][i] = (dp[0][i-1]*2+dp[1][i-1]*3)%MOD;
        }
        System.out.println((dp[0][n-1]+dp[1][n-1])%MOD);
    }
}
