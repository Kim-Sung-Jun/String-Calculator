public enum Constant {
    PLUS("+"), MINUS("-"), MULTIPLICATION("*"), DIVIDE("/");

    private final String formula;

    Constant(String formula) {
        this.formula = formula;
    }

    public String getFormula() {
        return formula;
    }
}
