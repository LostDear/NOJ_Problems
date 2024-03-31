package noj.package1021_1030;

import java.util.Scanner;

/**
 * @Author: 少女的迷鹿
 * @Description: Guess
 */
public class Main1023{

    public static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        int[] nums = new int[n];
        for (int i=0;i<n;++i) {
            nums[i] = scanner.nextInt();
        }
        int m =scanner.nextInt();
        int[] luckeyNums = new int[m];
        for (int i=0;i<m;++i) {
            luckeyNums[i] = scanner.nextInt();
        }
        int ans = 0;
        for (int i=0;i<n;++i) {
            for (int j=0;j<m;++j) {
                if (nums[i]%luckeyNums[j]==0) {
                    ans++;
                    break;
                }
            }
        }
        System.out.println(ans);
    }
}
