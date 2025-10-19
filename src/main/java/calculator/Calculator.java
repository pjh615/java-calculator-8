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
    private final Adder adder;

    public Calculator() {
        validator = new Validator();
        converter = new Converter(validator);
        parser = new Parser();
        adder = new Adder();
    }

    public Integer calculate(String input) {
        // 빈 문자열 처리
        if(input == null || input.isBlank()){
            return 0;
        }

        // 음수 처리
        if(validator.isNegative(input)){
            throw new IllegalArgumentException("Negative number are not allowed");
        }

        // 단일 숫자 처리
        if(validator.isInteger(input)){
            return Integer.parseInt(input.trim());
        }

        // 커스텀 구분자 처리
        if (input.startsWith("//")) {
            String[] tokens = parser.parseByCustomDelimiter(input);
            List<Integer> integers = converter.stringToIntegers(tokens);
            return adder.addAll(integers);
        }

        // 기본 구분자 처리
        if (input.contains(",") || input.contains(":")) {
            String[] tokens = parser.parseByDefaultDelimiter(input);
            List<Integer> integers = converter.stringToIntegers(tokens);
            return adder.addAll(integers);
        }

        // 그 외는 에러 처리
        throw new IllegalArgumentException();
    }


}