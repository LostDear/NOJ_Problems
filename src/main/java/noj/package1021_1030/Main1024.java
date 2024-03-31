package noj.package1021_1030;

import java.util.Scanner;

/**
 * @Author: 少女的迷鹿
 * @Description: Guess
 */
public class Main1024 {

    public static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n =scanner.nextInt(),m = scanner.nextInt();
        int[] arr = new int[m];
        double ans = Double.MIN_VALUE;
        int max = 0,min = 0;
        int sum = 0;
        for (int i=0;i<n;++i) {
            min = 0;max=0;sum=0;
            for (int j=0;j<m;++j) {
                arr[j] = scanner.nextInt();
                if (arr[j]>arr[max]) {
                    max = j;
                }
                if (arr[j]<arr[min]) {
                    min = j;
                }
                sum+=arr[j];
            }
            sum-=arr[max]+arr[min];
            ans = Math.max(ans,(double)sum/(m-2));
        }
        System.out.printf("%.2f",ans);
    }
}
