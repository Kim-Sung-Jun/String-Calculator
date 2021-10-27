
public class StringCalculatorDriver {

    public static void main(String[] args) {
        while (true) {
            try {
                FormulaSplitter formulaSplitter = new FormulaSplitter(Input.inputString());
                int result = Calculator.calculateNumber(formulaSplitter.getNumbers(), formulaSplitter.getFormulas());
                Output.printResult(result);
                break;
            } catch (IllegalArgumentException e) {
                Output.printExceptionMsg(e.getMessage());
                // TODO: 2021-10-21 예외잡은 다음에 다시 돌리기.
            } catch (Exception e) {
                Output.printExceptionMsg("예상하지 못한 오류가 발생했습니다");
                System.out.println("다시 입력 해주세요");
            }
        }
    }
}
