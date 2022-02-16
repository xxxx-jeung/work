import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    static int[][] arr;
    static boolean[] visited;

    public static void main(String[] args) throws Exception {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stk = new StringTokenizer(bf.readLine());

        int N = Integer.parseInt(stk.nextToken());
        int M = Integer.parseInt(stk.nextToken());
        int V = Integer.parseInt(stk.nextToken());

        arr = new int[N + 1][N + 1];
        for (int i = 0; i < M; i++) {
            stk = new StringTokenizer(bf.readLine());

            int a = Integer.parseInt(stk.nextToken());
            int b = Integer.parseInt(stk.nextToken());

            arr[a][b] = 1;
            arr[b][a] = 1;
        }
        visited = new boolean[N + 1];
        dfs(V);

        System.out.println();

        visited = new boolean[N + 1];
        bfs(V);
    }

    public static void dfs(int V) {
        visited[V] = true;
        System.out.printf(V + " ");

        if (V == arr.length) {
            return;
        }

        for (int j = 1; j < arr.length; j++) {
            if (arr[V][j] == 1 && visited[j] == false) {
                dfs(j);
            }
        }
    }

    public static void bfs(int V) {
        Queue<Integer> que = new LinkedList<Integer>();

        que.add(V);
        visited[V] = true;
        System.out.printf(V + " ");

        while (!que.isEmpty()) {
            int temp = que.poll();
            for (int i = 1; i < arr.length; i++) {
                if (arr[temp][i] == 1 && visited[i] == false) {
                    que.add(i);
                    visited[i] = true;
                    System.out.printf(i + " ");
                }
            }
        }
    }
}
