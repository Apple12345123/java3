package method;

import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        // 두 수를 입력받아 뺄셈을 하는 메서드를 만들어주세요.

        System.out.println("뺄셈을 위한 두 수를 입력해주세요");

        Scanner scanner = new Scanner(System.in);
        System.out.print("첫 번째 숫자: ");
        int a = scanner.nextInt();
        System.out.print("두 번째 숫자: ");
        int b = scanner.nextInt();

        int sum = a - b;
        System.out.println("결과는 : " + sum);
    }
}
