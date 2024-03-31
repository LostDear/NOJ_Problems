package noj;

import java.util.Scanner;

/**
 * @Author: 少女的迷鹿
 * @Description: Guess
 */
public class MainA {

    public static final Scanner scanner = new Scanner(System.in);

    public static final int[] days = {0,31,28,31,30,31,30,31,31,30,31,30,31,30,31};

    public static boolean isRunYear(int year) {
        if (year%100==0) {
            return year%400==0;
        }
        return year%4==0;
    }


    public static void main(String[] args) {
        int year = scanner.nextInt(),n= scanner.nextInt();
        if (isRunYear(year)) {
            days[2] = 29;
        }
        int day = -1,month;
        for (month = 1;month<=14;month++) {
            if (n<=days[month]) {
                day = n;
                break;
            }
            n -= days[month];
        }
        System.out.printf("%d %d",month,day);
    }
}
