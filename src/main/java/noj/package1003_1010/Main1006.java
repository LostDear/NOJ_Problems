package noj.package1003_1010;

import java.util.Scanner;

/**
 * @Author: 少女的迷鹿
 * @Description: Guess
 */
public class Main1006 {

    public static final Scanner scanner = new Scanner(System.in);

    public static int gcd(int a, int b) {
        return b == 0 ? a : gcd(b, a % b);
    }

    public static int minGongBeiShu(int a, int b) {
        return a * b / gcd(a, b);
    }

    public static void main(String[] args) {
        int a = scanner.nextInt(),b= scanner.nextInt();
        System.out.println(gcd(a,b)+" "+minGongBeiShu(a,b));
    }
}
