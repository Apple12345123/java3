package fistTest;

import java.util.Scanner;

/*
간단한 계산기 만들기
사용사로부터 두 개의 숫자와 연산자( * , + , - , /)를 입력받아,
해당 연산을 수행한 결과를 출력하는 간단한 계산기 프로그램을 작성하세요.
switch 문을 사용하여 각 연산자에 따른 연산을 처리하세요.
0으로 나누기 시도시 "0으로 나눌 수 없습니다."와 같은 오류 메시지를 출력하세요.
 */
public class Culculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("첫 번째 숫자를 입력하세요");
        double first = scanner.nextInt();

        System.out.println("두 번째 숫자를 입력하세요.");
        double second = scanner.nextInt();

        System.out.println("연산 기호를 입력하세요.");
        String operator = scanner.next();

        double result = 0;

        switch (operator) {
            case "+" :
                result = first + second;
                break;
             case "-" :
                result = first - second;
                break;
             case "*" :
                result = first * second;
                break;
             case "/" :
                result = first / second;
                if (second == 0) {
                    System.out.println("0으로 나눌 수 없습니다.");
                    return;
                }
                break;

        }
        System.out.println("결과는 = " + result  + "입니다.");

    }
}
