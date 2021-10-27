import java.util.function.BiFunction;

public enum Constant {

    PLUS("+", (firstNumber, nextNumber) -> firstNumber + nextNumber),
    MINUS("-", (firstNumber, nextNumber) -> firstNumber - nextNumber),
    MULTIPLICATION("*", (firstNumber, nextNumber) -> firstNumber * nextNumber),
    DIVIDE("/", (firstNumber, nextNumber) -> firstNumber / nextNumber);

    private final String formula;
    private final BiFunction<Integer, Integer, Integer> biFunction;

    Constant(String formula, BiFunction<Integer, Integer, Integer> biFunction) {
        this.formula = formula;
        this.biFunction = biFunction;
    }

    public String getFormula() {
        return formula;
    }

    public Integer calculate(Integer first, Integer next) {
        return biFunction.apply(first, next);
    }
}
