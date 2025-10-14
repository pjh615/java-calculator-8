package calculator;


import java.util.ArrayList;
import java.util.List;

/**
 * 계산 로직을 구현하는 클래스
 */
public class Calculator {
    private final Converter converter;
    private final Parser parser;
    private final Validator validator;

    public Calculator() {
        converter = new Converter();
        parser = new Parser();
        validator = new Validator();
    }

    public Integer calculate(String input) {
        // 빈 문자열 처리
        if(input.isBlank()){
            return 0;
        }

        // 음수 처리
        if(validator.isNegative()){
            throw new IllegalArgumentException("Negative numbers are not allowed");
        }

        // 기본 구분자 처리
        if (input.contains(",") || input.contains(":")) {
            String[] tokens = parser.parseByDefaultDelimiter(input);
            List<Integer> numbers = new ArrayList<>();
            for (String token : tokens) {
                numbers.add(Integer.parseInt(token.trim()));
            }

            Integer sum = 0;
            for (Integer number : numbers) {
                sum += number;
            }
            return sum;
        }

        // 커스텀 구분자 처리
        if (input.startsWith("//")) {
            String[] tokens = parser.parseByCustomDelimiter(input);
            List<Integer> numbers = new ArrayList<>();
            for (String token : tokens) {
                numbers.add(Integer.parseInt(token.trim()));
            }

            Integer sum = 0;
            for (Integer number : numbers) {
                sum += number;
            }
            return sum;
        }



        throw new IllegalArgumentException("");
    }


}