import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.PriorityQueue;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        PriorityQueue<Integer> pq = new PriorityQueue<Integer>(Collections.reverseOrder());

        int N = Integer.parseInt(bf.readLine());
        if (N <= 0 || N > 100000) {
            return;
        }

        for (int i = 0; i < N; i++) {
            int X = Integer.parseInt(bf.readLine());
            if (X == 0) {
                if (pq.size() == 0) {
                    sb.append(0 + "\n");
                } else {
                    sb.append(pq.peek() + "\n");
                    pq.poll();
                }
            } else {
                pq.add(X);
            }
        }
        System.out.println(sb);

    }

}
