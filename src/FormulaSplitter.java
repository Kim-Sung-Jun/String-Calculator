import java.util.ArrayList;
import java.util.List;

public class FormulaSplitter {

    private static final String DELIMITER = " ";
    private static final String BLANK_SPACE = " ";
    private static final int LENGTH_DELIMITER = 0;

    private final List<String> FORMULAS = new ArrayList<>();
    private final List<Integer> NUMBERS = new ArrayList<>();

    public FormulaSplitter(String inputString) {
        isProperName(inputString);
        split(inputString);
    }

    private void split(String input) {
        String[] inputs = input.split(DELIMITER);
        for (String splitInput : inputs) {
            if (splitInput.equals(Constant.PLUS.getFormula())
                    || splitInput.equals(Constant.MINUS.getFormula())
                    || splitInput.equals(Constant.MULTIPLICATION.getFormula())
                    || splitInput.equals(Constant.DIVIDE.getFormula())) {
                FORMULAS.add(splitInput);
            } else {
                NUMBERS.add(Integer.parseInt(splitInput));
            }
        }
    }

    private void isProperName(String inputString) {
        validateEmptyInput(inputString);
        validateInputContainsBlank(inputString);
        validateInputContainsBlanks(inputString);
    }

    private void validateEmptyInput(String inputString) {
        if (inputString.length() == LENGTH_DELIMITER) {
            throw new IllegalArgumentException("잘못 된 입력 입니다");
        }
    }

    private void validateInputContainsBlank(String inputString) {
        if (!inputString.contains(BLANK_SPACE)) {
            throw new IllegalArgumentException("입력값 사이에는 공백을 넣어야 합니다");
        }
    }

    private void validateInputContainsBlanks(String inputString) {
        inputString = inputString.trim();
        if (inputString.length() == LENGTH_DELIMITER) {
            throw new IllegalArgumentException("입력에 공백만 있습니다");
        }
    }

    public List<String> getFormulas() {
        return FORMULAS;
    }

    public List<Integer> getNumbers() {
        return NUMBERS;
    }

}
