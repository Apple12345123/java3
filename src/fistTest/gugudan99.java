package fistTest;

import java.util.Scanner;

/*
구구단 출력하기
사용자로부터 정수 n을 입력받아,
n단의 구구단을 출력하는 프로그램을 작성해주세요
 */
public class gugudan99 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("구구단 출력하는 프로그램");
        System.out.println("구구단 몇 단을 출력하시겠습니까?");

        int n = scanner.nextInt();

        for (int i = 0; i < 9; i++) {
            System.out.println( n + "*" + (i+1) + "=" + n*(i+1));
        }
    }
}
