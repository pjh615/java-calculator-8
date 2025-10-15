package calculator;

import camp.nextstep.edu.missionutils.Console;

/**
 * 유저로 부터 입력을 받는 클래스
 */
public class InputHandler {

    public String input(){
        System.out.println("덧셈할 문자열을 입력해 주세요.");
        return Console.readLine();
    }
}
