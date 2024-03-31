package noj.package1021_1030;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 * @Author: 少女的迷鹿
 * @Description: Guess
 */
public class Main1021 {

    public static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        Set<Integer> set = new HashSet<>();
        for (int i=0;i<n;++i) {
            set.add(scanner.nextInt());
        }
        int m = scanner.nextInt();
        for (int i=0;i<m;++i) {
            int cur = scanner.nextInt();
            if (set.contains(cur)) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }
    }
}
