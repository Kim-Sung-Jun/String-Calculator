import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Output {

    public static void printResult(int result) {
        System.out.println(result);
        List<String> strList = new ArrayList<>();
        strList.add("10");
        strList.add("10");
        strList.add("10");
        Stream<String> strStream = strList.stream();
        strStream.filter("10"==);
    }

    public static void printExceptionMsg(String msg) {
        System.out.println(msg);
    }
}
