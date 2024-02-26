package polymorphism.ex.ex1;

public class Tire {
    // 필드
    int maxRotation;    // 최대회전수
    int accumulateRotation;     // 누적회전수
    String location;      // 위치

    // 생성자
    public Tire(String location, int maxRotation) {
        this.location = location;
        this.maxRotation = maxRotation;
    }

    // 메소드
    public boolean roll() {
        // 한 번 회전시 누적회전수 증가
        ++accumulateRotation;
        if (accumulateRotation < maxRotation) {
            System.out.println(location + "Tire 수명: " + (maxRotation - accumulateRotation) + "회");
            // 타이어 수명 체크
            return true;
        } else {
            System.out.println("***" + location + "Tire 펑크 ***");
            // 펑크가 나면 false를 반환
            return false;
        }
    }
}
