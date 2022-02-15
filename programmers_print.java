import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) throws Exception {
        int[] priorities = { 2, 1, 3, 2 };
        int location = 2;
        int maxPriorities = 0;
        int printCount = 0;

        for (int i = 0; i < priorities.length; i++) {
            if (maxPriorities < priorities[i]) {
                maxPriorities = priorities[i];
            }
        }

        List<Integer> queue = new ArrayList<Integer>();
        Arrays.stream(priorities).forEach(i -> queue.add(i));
        while (queue.size() != 0) {
            if (queue.get(0) == maxPriorities) {
                printCount++;
                queue.remove(0);
                maxPriorities = Max(queue);
                if (location == 0) {
                    break;
                } else {
                    location -= 1;
                }
            } else if (queue.get(0) != maxPriorities) {
                int val = queue.get(0);
                queue.remove(0);
                queue.add(val);
                if (location > 0) {
                    location -= 1;
                } else {
                    location = queue.size() - 1;
                }
            }
        }

        System.out.println(printCount);
    }

    public static int Max(List<Integer> queue) {
        int maxPriorities = 0;
        for (int i = 0; i < queue.size(); i++) {
            if (maxPriorities < queue.get(i)) {
                maxPriorities = queue.get(i);
            }
        }
        return maxPriorities;
    }
}
