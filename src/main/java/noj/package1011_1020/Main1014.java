package noj.package1011_1020;

import java.util.Scanner;

/**
 * @Author: 少女的迷鹿
 * @Description: Guess
 */
public class Main1014 {

    public static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int k = scanner.nextInt();
        double sum = 0;
        double n = 0;
        while (sum<=k) {
            n++;
            sum+=1/n;
        }
        System.out.println((int)n);
    }
}
