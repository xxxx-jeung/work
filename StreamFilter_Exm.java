import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;
import java.util.stream.Collectors;

public class App {

    public static void main(String[] args) throws Exception {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String[] strs = bf.readLine().split(" ");   //입력한 문자열 사이 공백
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
        List<String> result_list = list.stream().filter(val -> X > Integer.parseInt(val)).collect(Collectors.toList()); // X 보다 큰 값 반환.
        System.out.println(String.join(" ", result_list));
    }

}
