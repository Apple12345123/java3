package quiz1;

import java.util.Scanner;

/*
반복문 : 짝수의 합 구하기
사용자로부터 두 정수 start와 end를 입력받아,
start와 end 사이의 모든 짝수의 합을 계산하는 프로그램을 작성하세요
/*
출력예시
======
시작 정수: 4
끝 정수: 15
4 + 6 + 8 + 10 + 12 + 14 = 54
*/
public class Quiz2 {
    public static void main(String[] args) {



        Scanner scanner = new Scanner(System.in);
        System.out.println("시작하는 정수를 입력하시오(start) : ");
        int start = scanner.nextInt();
        System.out.println("끝나는 정수를 입력하시오(end) : ");
        int end = scanner.nextInt();

        int sum = 0;

        for (int i = start; i <= end; i++) {
            if (i%2==0) {
                sum = sum+i;
            }
        }
        System.out.println("짝수합 = " + sum);
        
        
        
    }
}
