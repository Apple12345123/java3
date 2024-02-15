package Variable;

public class Ex3 {
    public static void main(String[] args) {
        // 100억을 담는 변수를 선언하세요.
        // 그 변수를 출력해보세요.
        // boolean 타입의 변수를 선언하고 출력해보세요.

        long l = 10_000_000_000L;       //10억이 넘는 경우는 long 사용하기(쉼표 대신에 언더바 사용하기, 제일 뒤에 L 주의하기)
        System.out.println(l);
        boolean bool_1 = false;
        boolean bool_2 = true;
        System.out.println(bool_1 + "/" + bool_2);
    }
}
