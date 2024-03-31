package noj.package1011_1020;

import java.util.Scanner;

/**
 * @Author: 少女的迷鹿
 * @Description: Guess
 */
public class Main1011 {

    public static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int MAX = scanner.nextInt();
        int maxN = (int) Math.floor((Math.sqrt(1+8*MAX)-1)/2);
        int ans = maxN*(maxN+1)*(maxN*2+1)/6;
        ans+=(MAX-maxN*(1+maxN)/2)*(maxN+1);
        System.out.println(ans);
    }
}
