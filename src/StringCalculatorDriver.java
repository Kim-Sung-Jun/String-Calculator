import java.util.List;

public class StringCalculatorDriver {

    public static void main(String[] args) {
        try {
            FormulaSplitter formulaSplitter = new FormulaSplitter(Input.inputString());
            List<Integer> result = Calculator.calculateNumber(
                    formulaSplitter.getNumbers(), formulaSplitter.getFormulas());
            Output.printResult(result);
        } catch (IllegalArgumentException e) {
            Output.printExceptionMsg(e.getMessage());
            // TODO: 2021-10-21 예외잡은 다음에 다시 돌리기.
        }
    }
}
