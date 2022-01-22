import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class App {

    public static String starCreate(int i) throws Exception {
        String starVal = "";
        for (int star = 0; star < i; star++) {
            starVal += "*";
        }
        return starVal;
    }

    public static String emptyCreate(int i) throws Exception {
        String emptyVal = "";
        for (int empty = 0; empty < i; empty++) {
            emptyVal += " ";
        }
        return emptyVal;
    }

    public static void main(String[] args) throws Exception {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(bf.readLine());
        int emptyN = N;
        for (int i = 0; i < N; i++) {
            StringBuilder sb = new StringBuilder();
            emptyN -= 1;
            sb.append(emptyCreate(emptyN));
            sb.append(starCreate(i + 1));
            sb.append("\n");
            bw.write(sb.toString());
        }
        bw.flush();
        bf.close();
        bw.close();
    }

}
