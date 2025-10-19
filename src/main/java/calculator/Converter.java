package calculator;


import java.util.ArrayList;
import java.util.List;

/**
 * 입력된 문자열을 정수로 변환하는 클래스
 */
public class Converter {
    private final Validator validator;

    public Converter(Validator validator) {
        this.validator = validator;
    }

    public List<Integer> stringToIntegers(String[] tokens) {
        List<Integer> result = new ArrayList<>();
        for (String token : tokens) {
            if(validator.isInteger(token)){
                try {
                    result.add(Integer.parseInt(token.trim()));
                } catch (NumberFormatException e) {
                    throw new IllegalArgumentException("Invalid integer value: " + token);
                }
            }
        }
        return result;
    }
}
