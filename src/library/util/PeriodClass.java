package library.util;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Period;

public class PeriodClass {
    public static void main(String[] args) {
        // Period 날짜 간격 구하기
        LocalDate startDate = LocalDate.of(2024, 1, 1);
        LocalDate endDate = LocalDate.of(2024, 12, 31);

        Period between = Period.between(startDate, endDate);
        System.out.println("between = " + between);
        int years = between.getYears();
        int months = between.getMonths();
        System.out.printf("날짜 간격은 %s개월 %s월입니다.", years, months);

        // Duration 시간 간격 구하기
        LocalTime startTime = LocalTime.of(8, 30);
        LocalTime endTime = LocalTime.of(17, 00);
        Duration duration = Duration.between(startTime, endTime);
        System.out.println("\nduration = " + duration);
        System.out.printf("학원에서 %s시간 %s분 있습니다.", duration.toHours(), duration.toMinutesPart());
        System.out.println("분으로 계산하면 " + duration.toMinutes() + "분 있습니다.");

    }
}
