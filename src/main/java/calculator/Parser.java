package calculator;


/**
 * 입력된 문자열을 구분자를 기준으로 파싱하는 클래스
 */
public class Parser {
    public String[] parseByDefaultDelimiter(String input) {
        return input.split("[,:]");
    }

    public String[] parseByCustomDelimiter(String input) {
        return input.split("[,:]");
    }
}
