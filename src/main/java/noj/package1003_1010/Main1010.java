package noj.package1003_1010;

import java.util.Scanner;

/**
 * @Author: 少女的迷鹿
 * @Description: Guess
 */
public class Main1010 {

    public static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int size = scanner.nextInt();
        int[] nums = new int[size];
        for (int i=0;i<size;++i) {
            nums[i] = scanner.nextInt();
        }
        int h = scanner.nextInt() + 30;
        boolean flag = true;
        int cnt = 0;
        for (int i=0;i<size;++i) {
            if (h<nums[i]) {
                flag = false;
            } else {
                cnt++;
            }
        }
        System.out.println(cnt);
        System.out.println(flag?"Yes":"No");
    }
}
