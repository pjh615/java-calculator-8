package calculator;


import java.util.List;

/**
 * 입력된 문자열의 유효성을 검증하는 클래스
 */
public class Validator {
    public boolean isNegative(String input){
        return input.contains("-");
    }

    public boolean isInteger(String token){
        try {
            Integer.parseInt(token);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}
