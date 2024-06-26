package library.util.ex;

import java.util.Random;
import java.util.Scanner;

/*
연습 문제 1: 주사위 게임
요구사항: 두 명의 플레이어가 주사위를 던져서 높은 숫자가 나오는 사람이 이기는 간단한 주사위 게임을 만드세요. 각 플레이어는 주사위를 한 번씩 던지며, 주사위의 결과는 1부터 6까지의 무작위 숫자입니다. 게임 결과와 두 플레이어의 주사위 숫자를 출력하세요.

출력 예시:
플레이어 1: 4
플레이어 2: 6
플레이어 2가 이겼습니다!
 */
public class Ex1 {
    public static void main(String[] args) {
        Random random = new Random();

        while (true) {
            int Player1 = random.nextInt(6) + 1;
            System.out.println("플레이어 1의 주사위 결과 : " + Player1);

            int Player2 = random.nextInt(6) + 1;
            System.out.println("플레이어 2의 주사위 결과 : " + Player2);

            if (Player1 < Player2) {
                System.out.println("플레이어 2가 이겼습니다.");
            } else if (Player1 > Player2) {
                System.out.println("플레이어 1이 이겼습니다.");
            } else {
                System.out.println("동점입니다.");
            }
            System.out.println("다시 게임을 하시겠습니까? 원한다면 y을 눌러주세요.");
            Scanner sc = new Scanner(System.in);
            String next = sc.next();
            if (next.equals("y") || next.equals("Y")) {
                continue;
            } else {
                System.out.println("게임종료합니다.");
                break;
            }

        }
        System.out.println("게임종료합니다.");
    }
}

