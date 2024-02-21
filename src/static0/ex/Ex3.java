package static0.ex;
import static static0.ex.MathArrayUtil.*;

public class Ex3 {
    /*
    문제3:
    수학 배열 유틸리티 클래스
    배열을 활용한 수학 유틸리티 클래스(MathArrayUtils)를 만드세요.
    sum(int[] array) : 배열의 모든 요소를 더하여 합계를 반환합니다.
    average(int[] array) : 배열의 모든 요소의 평균값을 계산합니다.
    min(int[] array) : 배열에서 최소값을 찾습니다.
    max(int[] array) : 배열에서 최대값을 찾습니다.

    `MathArrayUtils` 은 객체를 생성하지 않고 사용해야 합니다. 생성이 불가능하게 막으세요.

    public static void main(String[] args) {
        int[] values = {1, 2, 3, 4, 5};
        System.out.println("sum=" + MathArrayUtils.sum(values));
        System.out.println("average=" + MathArrayUtils.average(values));
        System.out.println("min=" + MathArrayUtils.min(values));
        System.out.println("max=" + MathArrayUtils.max(values));
     }

    실행결과
    =====
    sum=15
    average=3.0
    min=1
    max=5
     */

    public static void main(String[] args) {
        int[] values = {1, 2, 3, 4, 5, 10, 20, 30};
        System.out.println("sum=" + sum(values));
        System.out.println("average=" + average(values));
        System.out.println("min=" + min(values));
        System.out.println("max=" + max(values));

        // 생성이 되지 않게 막기 : 생성자를 private으로 변경한다.
        // MathArrayUtil util = new MathArrayUtil();
        // util.sum(values);
    }
}
