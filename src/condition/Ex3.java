package condition;

import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        /* 주차요금 계산하는 프로그램
        응용 문제 3: 주차 요금 계산기
        주차장을 사용한 시간(시간 단위)을 사용자로부터 입력받아,
        주차 요금을 계산하는 프로그램을 작성하세요.
        기본 요금은 2시간까지 5000원이고, 이후부터는 30분마다 1000원씩
        추가 요금이 발생합니다.
        24시간을 초과하는 주차의 경우에는 일일 최대 요금인 30000원을 적용하세요.
         */

       /* int fee = 5000;
        Scanner scanner = new Scanner(System.in);
        System.out.println("주차 시간을 입력해주세요 (시간단위) = ");
        int minute = scanner.nextInt();

        scanner.close();

        if (minute <= 120) {
            System.out.println("5000원입니다.");
        } else if ((minute > 120) && ( minute <= 24 * 60)) {
            System.out.println(5000 + ((minute - 120) / 30) * 1000 + "원입니다");
        } else if (minute > 24 * 60) {
            System.out.println("30000원입니다.");
        }*/

        Scanner scanner = new Scanner(System.in);
        System.out.println("주차 시간을 입력해주세요 (시간단위) = ");
        double hour = scanner.nextDouble();
        double fee;

        if (hour <= 2) {
            fee = 5000;
        } else if ( hour <= 24) {
            fee = 5000 + ((hour - 2) * 2) * 1000;
        } else {
            fee = 3000;
        }
        System.out.println("fee = " + fee);
    }
}
