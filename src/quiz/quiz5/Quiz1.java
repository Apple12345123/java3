package quiz.quiz5;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
간단한 투표 시스템

     목표: ArrayList를 활용하여 주어진 후보 목록에서 사용자의 투표를 받아,
     각 후보별 투표 수를 계산하고 결과를 출력하는 간단한 투표 시스템을 구현합니다.

     요구 사항
     1. 후보 목록 설정하기
     프로그램이 시작할 때, 사용자에게 4명의 후보 목록을 보여줍니다.
     예: "1. 고길동, 2. 둘리, 3. 마이콜, 4. 희동이"

     2. 투표 받기
     사용자로부터 원하는 후보의 번호를 입력받습니다.
     사용자가 '0'을 입력하면 투표를 종료합니다.

     3. 결과 출력하기
     모든 투표가 끝나면, 각 후보별로 받은 투표 수를 출력합니다.
     예: "고길동: 3, 둘리: 5, 마이콜: 2, 희동이: 4"

     출력예시
     ===
     후보 목록:
     1. 고길동
     2. 둘리
     3. 마이콜
     4. 희동이
     투표하고 싶은 후보의 번호를 입력하세요 (종료하려면 0을 입력): 2
     투표하고 싶은 후보의 번호를 입력하세요 (종료하려면 0을 입력): 2
     투표하고 싶은 후보의 번호를 입력하세요 (종료하려면 0을 입력): 3
     투표하고 싶은 후보의 번호를 입력하세요 (종료하려면 0을 입력): 4
     투표하고 싶은 후보의 번호를 입력하세요 (종료하려면 0을 입력): 1
     투표하고 싶은 후보의 번호를 입력하세요 (종료하려면 0을 입력): 0
     투표 결과:
     고길동: 1
     둘리: 2
     마이콜: 1
     희동이: 1
 */
public class Quiz1 {
    public static void main(String[] args) {
        List<String> candidates = new ArrayList<>();
        List<Integer> votes = new ArrayList<>();

        candidates.add("고길동");
        candidates.add("둘리");
        candidates.add("마이콜");
        candidates.add("희동이");

        for (int i = 0; i < candidates.size(); i++) {
            votes.add(0);
        }
        System.out.println("후보목록: ");
        for (int i = 0; i < candidates.size(); i++) {
            System.out.println((i+1) + ". " + candidates.get(i));
        }

        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("투표하고 싶은 후보의 번호를 입력하세요 (종료하려면 0을 입력):");
            int choice = scanner.nextInt();

            if (choice == 0) break;
            else if (choice > 0 && choice <= candidates.size()) {
                Integer vote = votes.get(choice - 1);
                votes.set(choice - 1, vote + 1);
            } else {
                System.out.println("번호에 맞게 입력해주세요");
            }
        }
        System.out.println("투표결과: ");
        for (int i = 0; i < candidates.size(); i++) {
            System.out.printf("%s : %d    \n", candidates.get(i), votes.get(i));
        }
    }
}
