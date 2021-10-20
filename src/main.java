import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class main {

    private static final Scanner scanner = new Scanner(System.in);
    private static final List<String> stringList = new ArrayList<>();
    private static final List<Integer> intList = new ArrayList<>();


    public static void main(String[] args) {
        String strInt = scanner.nextLine();
        String[] strArr = strInt.split(" ");

        for (String str : strArr) {
            if (str.equals("+") || str.equals("-") || str.equals("*") || str.equals("/")) {
                stringList.add(str);
            } else {
                intList.add(Integer.parseInt(str));
            }
        }

        while (!stringList.isEmpty()) {
            int num1 = intList.remove(0);
            int num2 = intList.remove(0);
            String str1 = stringList.remove(0);

            if (str1.equals("+")) {
                intList.add(sum(num1, num2));
            }
        }
    }

    private static int sum(int num, int numnum) {
        return num + numnum;
    }
}
