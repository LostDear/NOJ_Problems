package noj.package1011_1020;

import java.util.Scanner;

/**
 * @Author: 少女的迷鹿
 * @Description: Guess
 */
public class Main1018 {

    private static final Scanner scanner = new Scanner(System.in);

    private static double getDistance(int x1, int y1, int x2, int y2) {
        return Math.sqrt(Math.pow(x1-x2,2)+Math.pow(y1-y2,2));
    }

    public static void main(String[] args) {
        int n = scanner.nextInt(),k = scanner.nextInt(),r = scanner.nextInt();
        boolean[][] map = new boolean[n][n];
        int x,y,ans = 0;
        for (int i = 0; i < k; i++) {
            x = scanner.nextInt() - 1;
            y = scanner.nextInt() - 1 ;
            for (int nx = Math.max(0,x-r); nx <= Math.min(n-1,x+r); nx++) {
                for (int ny = Math.max(0,y-r); ny <= Math.min(n-1,y+r); ny++) {
                    if (!map[nx][ny]&&getDistance(x,y,nx,ny)<=r) {
                        map[nx][ny] = true;
                        ans++;
                    }
                }
            }
        }
        System.out.println(ans);
    }
}
