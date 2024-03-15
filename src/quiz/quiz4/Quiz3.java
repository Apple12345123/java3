package quiz.quiz4;

import java.time.LocalDate;
import java.time.Period;

/*
월드컵 개최일까지 남은 시간 계산하기

    요구사항: 특정 월드컵 개최일까지 남은 년, 월, 일을 계산하세요.
     예를 들어, 다음 월드컵이 2026년 6월 14일에 시작한다고 할 때,
     오늘 날짜로부터 개최일까지 남은 시간을 Period를 사용하여 계산하세요.

    출력 예시:
    다음 월드컵은 2년 2개월 30일 후에 개최됩니다.
 */
public class Quiz3 {
    public static void main(String[] args) {
        LocalDate now = LocalDate.now();
        LocalDate worldCap = LocalDate.of(2026, 6, 14);

        Period period = Period.between(now, worldCap);

        int years = period.getYears();
        int months = period.getMonths();
        int days = period.getDays();

        String msg = String.format("다음 월드컵은 %d년 %d개월 %d일 후에 개최됩니다.", years, months, days);
        System.out.println(msg);
    }
}
