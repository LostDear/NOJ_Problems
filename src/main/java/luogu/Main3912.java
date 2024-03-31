package luogu;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @Author: 少女的迷鹿
 * @Description: 素数个数
 */
public class Main3912 {

    public static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        boolean[] isPrime = new boolean[n+5];
        Arrays.fill(isPrime,true);
        int cnt = n==1?0:1;
        for (int i=3;i<=n;i+=2) {
            if (isPrime[i]) {
                cnt++;
                // 这里不转long会产生越界
                for (int j=i;(long)i*j<=n;++j) {
                    isPrime[i*j] = false;
                }
            }
        }
        System.out.println(cnt);
    }
}
