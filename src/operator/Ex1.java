package operator;

import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        // 산술 연산자
        // 두 개의 정수 a와 b를 사용자로부터 입력받습니다.
        // 이 두 수에 대해 더하기, 빼기, 곱하기, 나누기, 나머지 연산을 수행하고
        // 결과를 출력하는 프로그램을 작성하세요.
//        Scanner scanner = new Scanner(System.in);  // 입력받은 스캐너
//        scanner.nextInt();      // 입력받은 타입을 정수로 변환

        Scanner scanner = new Scanner(System.in);
        //값을 입력해주세요

        System.out.println("정수 a = ");
        int a = scanner.nextInt();

        System.out.println("정수 b = ");
        int b = scanner.nextInt();

        scanner.close();

        System.out.println("a + b = " + (a + b));
        System.out.println("a - b = " + (a - b));
        System.out.println("a * b = " + (a * b));
        System.out.println("a / b = " + (a / b));
        System.out.println("a % b = " + (a % b));






    }
}
