package exception.ex.ex1;

import java.util.InputMismatchException;
import java.util.Scanner;

/*
연습문제 1: 사용자 입력 에러 처리

요구사항:
사용자로부터 숫자 두 개를 입력받습니다.
입력받은 두 숫자의 나눗셈 결과를 출력합니다.
사용자가 0으로 나누려고 하면 ArithmeticException을 처리하여 사용자에게 "0으로 나눌 수 없습니다."라고 알립니다.
사용자가 숫자가 아닌 값을 입력했을 경우 InputMismatchException을 처리하여 "유효한 숫자를 입력해주세요."라고 알립니다.

예상 실행 결과
===
숫자 1을 입력하세요: 10
숫자 2를 입력하세요: 2
결과: 5

숫자 1을 입력하세요: 10
숫자 2를 입력하세요: 0
0으로 나눌 수 없습니다.

숫자 1을 입력하세요: a
유효한 숫자를 입력해주세요
 */
public class Ex1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("나눗셈할 숫자 두 개를 입력하세요");

            double number1 = scanner.nextDouble();
            double number2 = scanner.nextDouble();
            double result = number1/number2;
            System.out.println("두 숫자의 나눗셈 결과는 : " + result + "입니다.");

        } catch (InputMismatchException e) {
            System.out.println("유효한 숫자를 입력해주세요.");
        } catch (ArithmeticException e) {
            System.out.println("0으로 나눌 수 없습니다.");
        } catch (Exception e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        } finally {
            scanner.close();
        }
    }
}
