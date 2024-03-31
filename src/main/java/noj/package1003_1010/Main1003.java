package noj.package1003_1010;

import java.util.*;

public class Main1003 {

    private final static Scanner scanner = new Scanner(System.in);

    private static final String YES = "Yes";

    private static final String NO = "No";

    private static final int MAX_NUM = 99999;

    private static boolean isPrime(int num) {
        if (num < 2) {
            return false;
        }
        for (int i = 2; i*i <= num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    private static boolean isSymmetry(String num) {
        for (int i = 0; i < num.length()/2; i++) {
            if (num.charAt(i) != num.charAt(num.length()-1-i)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int size = scanner.nextInt();
        for (int i = 0; i < size; i++) {
            int num = scanner.nextInt();
            if (num<=MAX_NUM&&isPrime(num)&&isSymmetry(String.valueOf(num))) {
                System.out.println(YES);
            } else {
                System.out.println(NO);
            }
        }
    }
}















