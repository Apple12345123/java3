package quiz.quiz1;

import java.util.Scanner;

/*
배열 :   점수를 입력받을 학생수를 입력받아 배열에 저장하고
 입력받은 수만큼 학생들의 점수를 입력받은 후, 합계와 평균을 출력해주세요
        /*
        예시
        학생수는 몇명인가요? 3
        점수를 입력하세요
        10
        20
        30
        >> 합계 : 60, 평균 : 20.0
 */
public class Quiz3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("학생수는 몇명인가요? : ");
        int studentNumber = scanner.nextInt();
        int[] scores = new int[studentNumber];

        System.out.println("점수를 입력하세요 : ");

        for (int i = 0; i < scores.length; i++) {
            scores[i] = scanner.nextInt();
        }

        int sum = 0;
        for (int i = 0; i < scores.length; i++) {
            sum = sum + scores[i];
        }
        System.out.println("합계 = " + sum);
        System.out.println("평균 = " + (double) sum / scores.length);
    }
}
