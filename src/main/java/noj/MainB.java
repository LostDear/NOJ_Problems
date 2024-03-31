package noj;

import java.io.*;

/**
 * @Author: 少女的迷鹿
 * @Description: Guess
 */
public class MainB {

    static StreamTokenizer st = new StreamTokenizer(new BufferedReader(new InputStreamReader(System.in)));

    static PrintWriter pw = new PrintWriter(new OutputStreamWriter(System.out));

    static <T> T read(Class<T> tClass) throws IOException {
        st.nextToken();
        if (tClass == String.class) {
            return (T) st.sval;
        } else if (tClass == Integer.class) {
            return (T) Integer.valueOf((int) st.nval);
        } else if (tClass == Long.class) {
            return (T) Long.valueOf((long) st.nval);
        }
        return st.sval != null ? (T) st.sval : (T) Double.valueOf(st.nval);
    }

    public static final int[] next = new int[(int) (1e4 + 5)];

    public static int getTimes(String s, String pattern) {
        // 使用KMP算法，求解pattern在s中出现的次数
        int n = s.length(), m = pattern.length();
        for (int i = 1, j = 0; i < m; ++i) {
            while (j > 0 && pattern.charAt(i) != pattern.charAt(j)) {
                j = next[j - 1];
            }
            if (pattern.charAt(i) == pattern.charAt(j)) {
                ++j;
            }
            next[i] = j;
        }
        int times = 0;
        for (int i = 0, j = 0; i < n; ++i) {
            while (j > 0 && s.charAt(i) != pattern.charAt(j)) {
                j = next[j - 1];
            }
            if (s.charAt(i) == pattern.charAt(j)) {
                ++j;
            }
            if (j == m) {
                ++times;
                j = next[j - 1];
            }
        }
        return times;
    }

    public static void main(String[] args) throws IOException {
        int n = read(Integer.class);
        for (int i = 0; i < n; ++i) {
            String s =  read(String.class);
            String pattern =  read(String.class);
            int times = getTimes(s, pattern);
            pw.println(times);
            pw.flush();
        }
    }
}
