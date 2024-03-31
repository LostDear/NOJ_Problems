package noj.package1003_1010;

import java.util.Scanner;

/**
 * @Author: 少女的迷鹿
 * @Description: Guess
 */
public class Main1007 {

    public static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int k = scanner.nextInt();
        if (k==0) {
            System.out.println(0);
            return;
        }
        int[] arr = new int[k+1];
        arr[1] = 1;
        for (int i = 2; i <= k; i++) {
            arr[i] = arr[i-1]+arr[i-2];
        }
        System.out.println(arr[k]);
    }
}
