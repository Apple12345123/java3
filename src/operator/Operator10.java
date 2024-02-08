package operator;

public class Operator10 {
    public static void main(String[] args) {
        // 대입 연산자
        // 오른쪽 피연산자의 값을 왼족 피연산자인 변수에 저장
        // 연산을 수행하면서 대이하는 복합 대입 연산자가 있음.
        // 가장 낮은 연산 순위를 가지고 있음.
        int x =0;
        x += 10;     // x = x + 10;
        System.out.println("x = " + x);
        x -= 5;     //x = x - 5;
        System.out.println("x = " + x);
        x *= 3;     //x를 대입해서 곱해(?)
        System.out.println("x = " + x);
        x /= 5;     //x = x/5
        System.out.println("x = " + x);
        x %= 3;     // x = % 3 (나머지)
        System.out.println("x = " + x);

    }
}
