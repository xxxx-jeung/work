import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

public class App {
    public static void main(String[] args) throws Exception {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stk = new StringTokenizer(bf.readLine());

        int N = Integer.parseInt(stk.nextToken()); // 동전 종류
        int K = Integer.parseInt(stk.nextToken()); // 금액

        if (N > 10 || N == 0) {
            return;
        }
        if (K > 100000000 || K == 0) {
            return;
        }

        List<Integer> list = new ArrayList<Integer>();
        for (int i = 0; i < N; i++) {
            list.add(Integer.parseInt(bf.readLine()));
        }
        Collections.reverse(list);

        int cnt = 0;
        int i = 0;
        while (K != 0) {
            if (K >= list.get(i)) {
                K = K - list.get(i);
                i = 0;
                cnt++;
            } else {
                i++;
            }
        }

        System.out.println(cnt);
    }

}
