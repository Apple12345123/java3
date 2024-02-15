package method;

public class Method4 {
    public static void main(String[] args) {
        checkAge(10);
    }

    public static void checkAge(int age) {      // 미성년자인지 아닌지 판별하는 메서드
        if (age < 18) {
            System.out.println("미성년자입니다. 주류 및 담배 판매가 불가합니다.");
            return;     //return 문을 만나면 그 즉시 메서드가 종료된다. (else문 사용안해도 됨.)
        }

        System.out.println("성인이시군요. 주류 계산하겠습니다.");
    }
}
