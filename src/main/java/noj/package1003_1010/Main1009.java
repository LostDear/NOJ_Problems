package noj.package1003_1010;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @Author: 少女的迷鹿
 * @Description: Guess
 */
public class Main1009 {

    public static final Scanner scanner = new Scanner(System.in);

    public static final long MAX_WEIGHT = (long) (1e9+7);

    public static void main(String[] args) {
        int n = scanner.nextInt(), m = scanner.nextInt(), s = scanner.nextInt()-1, t = scanner.nextInt()-1;
        final int[] head = new int[n];
        final Edge[] edges = new Edge[m*2];
        Arrays.fill(head,-1);
        for (int i=0;i<2*m;i+=2) {
            int from = scanner.nextInt()-1,to = scanner.nextInt()-1,weight = scanner.nextInt();
            edges[i] = new Edge(to,weight,head[from]);
            head[from] = i;
            edges[i+1] = new Edge(from,weight,head[to]);
            head[to] = i+1;
        }
        final boolean[] vis = new boolean[n];
        final long[] distance = new long[n];
        Arrays.fill(distance,0);
        while (!vis[t]) {
            vis[s] = true;
            int nextEdge = head[s];
            while (nextEdge!=-1) {
                Edge e = edges[nextEdge];
                if (distance[e.v]==0||distance[e.v]>distance[s]+e.w) {
                    distance[e.v] = distance[s] + e.w;
                }
                nextEdge = e.next;
            }
            long min = Long.MAX_VALUE;
            for (int i=0;i<n;++i) {
                if (!vis[i]&&distance[i]!=0&&distance[i]<min) {
                    min = distance[i];
                    s=i;
                }
            }
        }
        System.out.println(distance[t]);
    }
    private static class Edge {

        int v;

        int w;

        int next;

        public Edge(int v, int w, int next) {
            this.v = v;
            this.w = w;
            this.next = next;
        }
    }
}

