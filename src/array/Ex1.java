package array;

public class Ex1 {
    public static void main(String[] args) {
        // 학생들 점수가 10, 20, 30, 40, 50 점입니다.
        // 배열을 선언하고, 모든 학생의 합계 점수와 평균 점수를 구해보세요.

        int[] scores;
        scores = new int[]{10, 20, 30, 40, 50, 60};

        for (int i = 0; i < scores.length; i++) {
            System.out.println(i + 1 + "번 점수 = " + scores[i]);
        }

        double sum = 0,  avg = 0;
        for (int i = 0; i < scores.length; i++) {
            sum+=scores[i];
        }
        avg = sum / (scores.length);
        System.out.println("점수의 총점은 = " + sum);
        System.out.println("점수의 평균은 = " + avg);
    }
}
