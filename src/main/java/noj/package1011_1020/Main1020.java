package noj.package1011_1020;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @Author: 少女的迷鹿
 * @Description: Guess
 */
public class Main1020 {

    public static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n =scanner.nextInt(),m = scanner.nextInt();
        int[][] map = new int[n][m];
        for (int i=0;i<n;++i) {
            Arrays.fill(map[i],-1);
        }
        int num;
        for (int i=0;i<n;++i) {
            for (int j=0;j<m;++j) {
                num = scanner.nextInt();
                if (map[i][j]!=0) {
                    map[i][j] = num;
                }
                if (num==1) {
                    Arrays.fill(map[i],0);
                    for (int k=0;k<n;++k) {
                        map[k][j] = 0;
                    }
                }
            }
        }
        for (int i=0;i<n;++i) {
            for (int j=0;j<m;++j) {
                System.out.print(map[i][j]);
                if (j!=m-1) System.out.print(" ");
            }
            System.out.println();
        }
    }
}
