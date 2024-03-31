package noj.package1003_1010;

import java.util.Locale;
import java.util.Scanner;

/**
 * @Author: 少女的迷鹿
 * @Description: Guess
 */
public class Main1008 {

    public static final Scanner scanner = new Scanner(System.in);

    public static final String YES = "Yes";

    public static final String NO = "No";

    private static boolean isHuiWen(String str) {
        int len = str.length();
        for (int i=0;i<len/2;++i) {
            if (str.charAt(i)!=str.charAt(len-i-1)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String str = scanner.nextLine();
        if (isHuiWen(str.toLowerCase(Locale.ROOT))) {
            System.out.println(YES);
        } else {
            System.out.println(NO);
        }
    }
}
