package noj.package1021_1030;

import java.util.Scanner;

/**
 * @Author: 少女的迷鹿
 * @Description: Guess
 */
public class Main1027 {

    public static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n =scanner.nextInt(),m = scanner.nextInt(),a = scanner.nextInt();
        int nx = (int) Math.ceil((double) n /a);
        int ny = m/a;
        long ans = (long) nx *ny;
        if (ny*a==m) {
            System.out.println(ans);
            return;
        }
        System.out.println(ans+nx);
    }
}
