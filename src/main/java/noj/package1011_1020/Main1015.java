package noj.package1011_1020;

import java.util.Scanner;

/**
 * @Author: 少女的迷鹿
 * @Description: Guess
 */
public class Main1015 {

    public static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int a = Integer.MIN_VALUE, b = Integer.MIN_VALUE, c = Integer.MIN_VALUE;
        int n = scanner.nextInt();
        for (int i=0;i<n;++i) {
            int num = scanner.nextInt();
            if (num>=a) {
                c=b;
                b=a;
                a=num;
            } else if (num>=b){
                c=b;
                b=num;
            } else if (num>=c) {
                c=num;
            }
        }
        System.out.println(a+b+c);
    }
}
