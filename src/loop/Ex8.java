package loop;

import java.util.Random;
import java.util.Scanner;

public class Ex8 {
    public static void main(String[] args) {
        // 숫자 맞추기 게임
        // 1 ~ 100까지의 랜덤한 숫자가 있습니다.
        // 응답한 숫자가 낮으면 낮다. 높으면 높다고 대답하여 랜덤한 숫자를 추측합니다.
        Random random = new Random();
        int answer = random.nextInt(100) + 1;     // 1~100까지 랜덤한 숫자
        // System.out.println("answer = " + answer); // 답안 확인

        // 반복문과 조건문을 통해서 숫자 추측 게임을 만들어보세요!
        Scanner scanner = new Scanner(System.in);
        System.out.println("1~100까지 숫자를 맞춰보세요");

        for (int i = 0; i < 100 ; i++) {
            System.out.print((i + 1) + "번째 시도. ");
            System.out.print("숫자를 입력하세요 : ");

            String input = scanner.nextLine();
            int guess = Integer.parseInt(input);

            if (answer == guess) {
                System.out.println("정답입니다!");
                break;
            } else if (answer < guess) {
                System.out.println("down!");
            } else if (answer > guess) {
                System.out.println("up!");
            }
            if (i == 100) {
                System.out.println("더 이상 기회가 없습니다.");
            }

        }
        System.out.println("게임을 종료합니다");


        // 1번째 시도. 숫자를 입력하세요 : 50
        //up!
        //2번째 시도. 숫자를 입력하세요 : 75
        //down!
        //3번째 시도. 숫자를 입력하세요 : 63
        //up!
        //4번째 시도. 숫자를 입력하세요 : 70
        //down!
        //5번째 시도. 숫자를 입력하세요 : 67
        //down!
        //6번째 시도. 숫자를 입력하세요 : 65
        // 정답입니다!  --> 이진 탐색 (절반씩 나눠서 찾는 탐색법. 알고리즘에 사용(?))
    }
}
/*
반복문과 조건문을 통해서 숫자 추측 게임을 만들어보세요!
        Scanner scanner = new Scanner(System.in);
        int guessNumber;
        int tryCount = 0;

        while (true) {
        System.out.println("1~100까지 숫자를 맞춰보세요");
        guessNumber = scanner.nextInt();
        tryCount++;

        if (guessNumber > answer) {
          System.out.println("정답입니다!");
                break;
            } else if (answer < guess) {
                System.out.println("down!");
            } else if (answer > guess) {
                System.out.println("up!");
            }
            if (i == 100) {
                System.out.println("더 이상 기회가 없습니다.");
            }
 }

 */