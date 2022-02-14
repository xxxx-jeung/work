import java.util.ArrayList;
import java.util.List;

class Priorities {
    Integer paper;
    String check;

    public Priorities(Integer paper, String check) {
        this.paper = paper;
        this.check = check;
    }
}

public class App {
    public static void main(String[] args) throws Exception {
        int[] priorities = { 2, 1, 3, 2 };
        int location = 2;
        List<Priorities> pList = new ArrayList<Priorities>();

        for (int i = 0; i < priorities.length; i++) {
            if (i == location) {
                pList.add(new Priorities(priorities[location], "Y"));
            } else {
                pList.add(new Priorities(priorities[i], "N"));
            }
        }

        for (Priorities data : pList) {
            System.out.println(data.paper + " " + data.check);
        }

    }
}
