import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class App {

    public static String valueSplit(String paramNumber) {
        String number = "";
        if (paramNumber.length() > 1) {
            String[] data = paramNumber.split("");
            number = data[1];
        } else {
            number = paramNumber;
        }

        return number;
    }

    public static String resultDataSum(String paramNumber) {
        String[] numberArr = paramNumber.split("");
        String resultNumber = String.valueOf(Integer.parseInt(numberArr[0]) + Integer.parseInt(numberArr[1]));
        String splitResultNumber = valueSplit(resultNumber);
        resultNumber = numberArr[1] + splitResultNumber;

        return resultNumber;
    }

    public static void main(String[] args) throws Exception {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer stk = new StringTokenizer(bf.readLine());
        int checkSum = 0;

        String number = stk.nextToken();
        String firstNumber = number;
        if (number.length() < 2) {
            number = "0" + number;
        }

        while (true) {
            number = resultDataSum(number);
            checkSum++;
            if (firstNumber.equals(number)) {
                break;
            }
        }

        System.out.println(checkSum);

        bw.flush();
        bf.close();
        bw.close();
    }

}
