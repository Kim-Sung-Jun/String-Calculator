import java.util.List;

public class Calculator {

    public static final int FIRST_INDEX = 0;
    // TODO: 2021-10-21 ENUM에 이 밑에 4개를 넣는거임
    //public static final String PLUS = "+";
    //public static final String MINUS = "-";
    //public static final String MULTIPLICATION = "*";
    //public static final String DIVIDE = "/";

    public static List<Integer> calculateNumber(List<Integer> numbers, List<String> formulas) {
            int first = numbers.remove(FIRST_INDEX);
        while (!formulas.isEmpty()) {
            int next = numbers.remove(FIRST_INDEX);
            String formula = formulas.remove(FIRST_INDEX);
            int result = 0;

            switch (formula) {
                case Constant.PLUS.getFormula():
                    numbers.add(FIRST_INDEX, Calculator.plus(first, next));
                    break;
                case Constant.MINUS.getFormula():
                    numbers.add(FIRST_INDEX, Calculator.minus(first, next));
                    break;
                case Constant.MULTIPLICATION.getFormula():
                    numbers.add(FIRST_INDEX, Calculator.multiply(first, next));
                    break;
                default:
                    numbers.add(FIRST_INDEX, Calculator.divide(first, next));
                    break;
            }
        }
        return numbers;
    }

    private static int plus(int firstNumber, int nextNumber) {
        return firstNumber + nextNumber;
    }

    private static int minus(int firstNumber, int nextNumber) {
        return firstNumber - nextNumber;
    }

    private static int multiply(int firstNumber, int nextNumber) {
        return firstNumber * nextNumber;
    }

    private static int divide(int firstNumber, int nextNumber) {
        return firstNumber / nextNumber;
    }
}
