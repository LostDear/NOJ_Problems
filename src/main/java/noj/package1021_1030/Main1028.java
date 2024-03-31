package noj.package1021_1030;

import java.util.Scanner;

/**
 * @Author: 少女的迷鹿
 * @Description: Guess
 */
public class Main1028 {

    public static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int size = scanner.nextInt();
        int[] nums = new int[size];
        int cur = 1,max = Integer.MIN_VALUE;
        for (int i=0;i<size;++i) {
            nums[i] = scanner.nextInt();
        }
        for (int i=1;i<size;++i) {
            if (nums[i]>nums[i-1]) {
                cur++;
            } else {
                cur = 1;
            }
            max = Math.max(max,cur);
        }
        System.out.println(max);
    }
}
