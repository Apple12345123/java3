package method;

public class Ex2 {
    public static void main(String[] args) {
        //세 수를 입력받아 합계와 평균을 구하는 메소드를 만들어주세요.
        sumAndAverage(10, 20, 30);
        sumAndAverage(9, 50, 40.6);

    }
    public static void sumAndAverage(double x, double y, double z) {
        double sum = x + y + z;
        double avg = sum / 3.0;
        System.out.println("합계 : " + sum + "평균 : " + avg);
    }
}
