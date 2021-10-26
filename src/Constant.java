import java.util.function.BiFunction;

public enum Constant {

    PLUS("+", (num1, num2) -> num1 + num2),
    MINUS("-", (num1, num2) -> num1 - num2),
    MULTIPLICATION("*", (num1, num2) -> num1 * num2),
    DIVIDE("/", (num1, num2) -> num1 / num2);

    private final String formula;
    private BiFunction<Integer, Integer, Integer> biFunction;

    Constant(String formula, BiFunction<Integer, Integer, Integer> biFunction) {
        this.formula = formula;
        this.biFunction = biFunction;
    }

    public String getFormula() {
        return formula;
    }

    public Integer mapCalculate(Integer num1, Integer num2) {
        return biFunction.apply(num1, num2);
    }
}
