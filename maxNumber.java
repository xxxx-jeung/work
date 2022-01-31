import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class App {
    public static void main(String[] args) throws Exception {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        int max = -100001;
        int i = 0;
        int seq = 0;
        while (true) {
            StringTokenizer stk = new StringTokenizer(bf.readLine());
            int val = Integer.parseInt(stk.nextToken());
            i++;
            if (max < val) {
                max = val;
                seq = i;
            }
            if (i > 8) {
                break;
            }
        }
        System.out.println(max);
        System.out.println(seq);
    }

}
