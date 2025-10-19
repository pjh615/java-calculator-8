package calculator;

import java.util.List;

/**
 * 정수 리스트의 합계를 구하는 클래스
 */
public class Adder {
    public Integer addAll(List<Integer> integers) {
        Integer sum = 0;
        for (Integer integer : integers) {
            sum += integer;
        }
        return sum;
    }
}
