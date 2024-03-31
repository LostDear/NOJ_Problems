package noj;

import java.util.Scanner;

/**
 * @Author: 少女的迷鹿
 * @Description: Guess
 */
public class MainB_ {

    public static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n =scanner.nextInt();
        for (int i=0;i<n;++i) {
            String s = scanner.next(), pattern = scanner.next();
            if (s.length()<pattern.length()) {
                System.out.println(0);
                continue;
            }
            int j=0,ans = 0;
            for (int k=0;k<s.length()-pattern.length()+1;++k) {
//                if (s.startsWith(pattern, k)) {
//                    ++ans;
//                }
                if (s.substring(k,k+pattern.length()).equals(pattern)) {
                    ++ans;
                }
            }
            System.out.println(ans);
        }
    }

}
