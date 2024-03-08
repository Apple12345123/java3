package library.util.ex;

import java.time.LocalDate;
import java.time.Period;

/*
    연습 문제 2: 월드컵 개최일까지 남은 시간 계산하기
    요구사항: 특정 월드컵 개최일까지 남은 년, 월, 일을 계산하세요.
     예를 들어, 다음 월드컵이 2026년 6월 14일에 시작한다고 할 때,
     오늘 날짜로부터 개최일까지 남은 시간을 Period를 사용하여 계산하세요.

    입력 예시: (자동으로 현재 날짜를 가져옵니다)

    출력 예시:
    다음 월드컵은 2년 3개월 6일 후에 시작합니다!
     */
public class Ex5 {
    public static void main(String[] args) {
        // 날자 간격 구하기
        LocalDate today = LocalDate.now();
        LocalDate worldCup = LocalDate.of(2026, 6, 14);

        Period period = Period.between(today, worldCup);
        int years = period.getYears();
        int months = period.getMonths();
        int days = period.getDays();
        String msg = String.format("다음 월드컵은 %s년 %s개월 %s일 후에 시작합니다!\n", years, months, days);
        System.out.println(msg);
    }
}
