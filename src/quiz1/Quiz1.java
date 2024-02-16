package quiz1;

import class0.ex.ProductOrder;

import java.util.Scanner;

/*
조건문 : 달러를 원으로 환전하는 간단한 프로그램을 만들어주세요.
- Scanner 클래스를 사용하여 사용자 입력을 받습니다.
- if 문을 사용하여 분기를 나눕니다.
   1. 달러를 0원 입금 받으면 => "환전할 금액이 없습니다."
   2. 양수일 때 환전금액은 "00000원 입니다."
   3. 음수일 때 "잘못 입력하셨습니다"
 */
public class Quiz1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double sum = 1336;
        
        System.out.println("달러환전> 환전할 금액을 입력하세요.(원)");
        int doller = scanner.nextInt();
        if (doller < 0) {
            System.out.println("잘못 입력하셨습니다.");
        } else if (doller > 0) {
            System.out.println("환전 금액은 " + sum * doller + "원입니다.");
        } else {
            System.out.println("잘못입력하셨습니다.");
        }
    }
}
