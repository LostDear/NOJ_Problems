package noj.package1003_1010;

import java.util.Locale;
import java.util.Scanner;

/**
 * @Author: 少女的迷鹿
 * @Description: Guess
 */
public class Main1004 {

    private final static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n  = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            int num = scanner.nextInt();
            int r = scanner.nextInt();
            System.out.println(Integer.toString(num,r).toUpperCase(Locale.ROOT));
        }
    }
}
