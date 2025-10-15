package calculator;


import java.util.ArrayList;
import java.util.List;

/**
 * 입력된 문자열을 정수로 변환하는 클래스
 */
public class Converter {

    public List<Integer> stringToIntegers(String[] tokens) {
        List<Integer> result = new ArrayList<>();
        for (String token : tokens) {
            result.add(Integer.parseInt(token.trim()));
        }
        return result;
    }
}
