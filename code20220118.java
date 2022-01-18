import java.util.*;

public class App {

    public static void main(String[] args) throws Exception {
        int[][] p = { { 1, 3 }, { 3, 1 }, { 3, 5 }, { 2, 5 }, { 5, 3 } };
        List<Integer> arrInteger = new ArrayList<Integer>();

        for (int i = 0; i < p.length; i++) {
          int a = p[i][0];
          int b = p[i][1];
          int result = a - b;
          arrInteger.add(Integer.valueOf(Math.abs(result)));
        }

        Map<Integer, Integer> mapCount = new HashMap<Integer, Integer>();
        for (Integer val : arrInteger) {
          mapCount.put(val, mapCount.getOrDefault(val, 0) + 1);
        }

        int answer = 0;
        for (Integer keyVal : mapCount.keySet()) {
          if (mapCount.get(keyVal) % 2 == 0) {
            answer += (mapCount.get(keyVal) / 2);
          }
        }

        System.out.println(answer);
    }
}
       
