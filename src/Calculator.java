import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Calculator {

    public static final int FIRST_INDEX = 0;
    public static final Map<String, Constant> OPERATORS = new HashMap<>();

    static {
        OPERATORS.put(Constant.PLUS.getFormula(), Constant.PLUS);
        OPERATORS.put(Constant.MINUS.getFormula(), Constant.MINUS);
        OPERATORS.put(Constant.MULTIPLICATION.getFormula(), Constant.MULTIPLICATION);
        OPERATORS.put(Constant.DIVIDE.getFormula(), Constant.DIVIDE);
    }

    private static int deliverCalculatorNumber(String operator, Integer first, Integer next) {
        return OPERATORS.get(operator).calculate(first, next);
    }

    public static int calculateNumber(List<Integer> numbers, List<String> formulas) {
        int first = numbers.remove(FIRST_INDEX);
        while (!formulas.isEmpty()) {
            int next = numbers.remove(FIRST_INDEX);
            String formula = formulas.remove(FIRST_INDEX);
            first = deliverCalculatorNumber(formula, first, next);
        }
        return first;
    }
}
