package fistTest;

import java.util.Random;
import java.util.Scanner;

/*
숫자 맞추기 게임
1~100까지의 랜덤한 숫자가 있습니다.
응답한 숫자가 낮으면 낮다, 높으면 높다고 대답하여 랜덤한 숫자를 추측합니다.
 */
public class RandomGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int answer = random.nextInt(100) +1;
        int guessNumber;
        int tryCount = 0;

        while (true) {
            System.out.println("1부터 100까지의 숫자를 맞춰보세요. " + (tryCount +1) + "번 시도하였습니다.");
            guessNumber = scanner.nextInt();
            tryCount++;

            if (guessNumber == answer) {
                System.out.println("정답입니다.");
                break;
            } else if (guessNumber < answer) {
                System.out.println("Up!");
            } else if (guessNumber > answer) {
                System.out.println("Down!");
            }
            if (tryCount == 20) {
                System.out.println("시도 횟수가 끝났습니다.");

                break;
            }

        }



    }
}
