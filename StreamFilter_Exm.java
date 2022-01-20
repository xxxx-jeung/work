import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;
import java.util.stream.Collectors;

public class App {

    public static void main(String[] args) throws Exception {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String[] strs = bf.readLine().split(" ");
        int N = Integer.parseInt(strs[0]);
        int X = Integer.parseInt(strs[1]);

        List<String> list = new ArrayList<String>();
        StringTokenizer stk = new StringTokenizer(bf.readLine());

        for (int i = 0; i < N; i++) {
            if (stk.hasMoreTokens())
                list.add(stk.nextToken());
            else
                break;
        }
        List<String> result_list = list.stream().filter(val -> X > Integer.parseInt(val)).collect(Collectors.toList());
        System.out.println(String.join(" ", result_list));
    }

}
