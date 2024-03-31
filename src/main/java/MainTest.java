import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;

/**
 * @Author: 少女的迷鹿
 * @Description: Guess
 */
public class MainTest {

    public static void main(String[] args) {
        PrintWriter pw = new PrintWriter(System.out);
        PrintWriter pw2 = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
        long time = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++) {
            pw2.println(i);
        }
        pw.println(System.currentTimeMillis() - time);
        pw.flush();
    }
}
