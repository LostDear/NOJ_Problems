package noj.package1011_1020;

import java.util.Scanner;

/**
 * @Author: 少女的迷鹿
 * @Description: Guess
 */
public class Main1012 {

    private static final Scanner scanner = new Scanner(System.in);

    private static boolean isPrime(long num) {
        if (num < 2) {
            return false;
        }
        for (int i = 2; (long) i *i<=num; ++i) {
            if (num % i ==0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        long num = scanner.nextInt();
        long ans = 0;
        boolean ea = false,eb=false;
        while (!ea||!eb) {
            num++;
            boolean isPrime = isPrime(num);
            if (isPrime&&!ea) {
                ans+=num;
                ea = true;
            }
            if (!isPrime&&!eb) {
                ans+=num;
                eb= true;
            }
        }
        System.out.println(ans);
    }
}
