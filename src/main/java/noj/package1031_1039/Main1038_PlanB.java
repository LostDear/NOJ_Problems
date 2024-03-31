package noj.package1031_1039;

import java.io.*;

/**
 * @Author: 少女的迷鹿
 * @Description: Guess
 */
public class Main1038_PlanB {

    public static final StreamTokenizer ST = new StreamTokenizer(new BufferedReader(new InputStreamReader(System.in)));

    public static final PrintWriter PW = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));

    public static final int[] nums = new int[31];

    public static void main(String[] args) {
        final int n = (int) readNumber(), MAX_SUM = (int) readNumber();
        for (int i = 0; i < n; i++) {
            nums[i] = (int) readNumber();
        }
        int ans = dfs(0,n,MAX_SUM);
        PW.println(ans);
        PW.flush();
    }

    static int dfs(int index,int length,int maxSum) {
        if (index==length || maxSum==0) {
            return 0;
        }
        int res = dfs(index+1,length,maxSum);
        if (maxSum>=nums[index]) {
            res = Math.max(res,dfs(index+1,length,maxSum-nums[index])+nums[index]);
        }
        return res;
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
}
