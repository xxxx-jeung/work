import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

public class App {

    public static Stack<Integer> stack = new Stack<>();

    public static void main(String[] args) throws Exception {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(bf.readLine());

        if (N < 1 || N > 100000) {
            return;
        }

        for (int i = 0; i < N; i++) {
            stackInteger(bf.readLine());
        }

        bf.close();
    }

    public static void stackInteger(String input) {
        if (input.startsWith("push")) {
            String[] arr = input.split(" ");
            stack.push(Integer.parseInt(arr[1]));
        } else if (input.startsWith("pop")) {
            if (stack.size() == 0) {
                System.out.println(-1);
            } else {
                System.out.println(stack.peek());
                stack.pop();
            }

        } else if (input.startsWith("size")) {
            System.out.println(stack.size());

        } else if (input.startsWith("empty")) {
            if (stack.size() == 0) {
                System.out.println(1);
            } else {
                System.out.println(0);
            }
        } else if (input.startsWith("top")) {
            if (stack.size() == 0) {
                System.out.println(-1);
            } else {
                System.out.println(stack.peek());
            }
        }
    }
}
