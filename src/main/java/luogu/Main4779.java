package luogu;

import java.util.Arrays;
import java.util.Scanner;

public class Main4779 {

    public static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt(), m = scanner.nextInt(), s = scanner.nextInt()-1;
        int[] head = new int[n];
        Arrays.fill(head, -1);
        final Edge[] edges = new Edge[m];
        for (int i = 0; i < m; ++i) {
            int u = scanner.nextInt()-1, v = scanner.nextInt()-1, w = scanner.nextInt();
            edges[i] = new Edge(v, w, head[u]);
            head[u] = i;
        }
        final boolean[] vis = new boolean[n];
        final int[] distance = new int[n];
        Arrays.fill(distance,-1);
        distance[s] = 0;
        int cnt = 1;
        while (cnt <= n) {
            vis[s] = true;
            for (int edgeIndex = head[s]; edgeIndex != -1; edgeIndex =edges[edgeIndex].next) {
                Edge e = edges[edgeIndex];
                if (!vis[e.to]) {
                    if (distance[e.to]==-1||distance[e.to]>distance[s] + e.w) {
                        distance[e.to] = distance[s] + e.w;
                    }
                }
            }
            int min = Integer.MAX_VALUE;
            for (int i=0;i<n;++i) {
                if (!vis[i]&&distance[i]!=-1&&distance[i]<min) {
                    min = distance[i];
                    s= i;
                }
            }
            cnt++;
        }
        for (int i=0;i<n;++i) {
            if (i==n-1) System.out.print(distance[i]==-1?(int) 2e31-1:distance[i]);
            else System.out.print((distance[i]==-1?(int) 2e31-1:distance[i])+" ");
        }
    }

    private static class Edge {
        final int to, w, next;

        public Edge(int to, int w, int next) {
            this.to = to;
            this.w = w;
            this.next = next;
        }
    }
}
