package calculator;


import javax.sound.midi.SysexMessage;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 입력된 문자열을 구분자를 기준으로 파싱하는 클래스
 */
public class Parser {
    public String[] parseByDefaultDelimiter(String input) {
        return input.split("[,:]");
    }

    public String[] parseByCustomDelimiter(String input) {
        int start = input.indexOf("//") + 2;
        int end = input.indexOf("\\n");

        String delimiter = input.substring(start, end);
        String specialChars = "([\\Q" + "^$|(){}[]*+?.\\" + "\\E])";
        Matcher matcher = Pattern.compile(specialChars).matcher(delimiter);
        delimiter = matcher.replaceAll("\\\\$1");
        System.out.println(delimiter);


        String remain = input.substring(end + 2);
        return remain.split(delimiter);
    }
}
