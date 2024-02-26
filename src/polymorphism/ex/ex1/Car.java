package polymorphism.ex.ex1;

public class Car {
    // 필드 (Composition 포함 관계)
    // Car has four Tires.
    Tire frontLeft = new Tire("앞 왼쪽", 5);
    Tire frontRight = new Tire("앞 오른쪽", 2);
    Tire backLeft = new Tire("뒤 왼쪽", 3);
    Tire backRight = new Tire("뒤 오른쪽", 4);
    // 생성자

    // 메소드
    int run() {
        // 반환값 : 타이어가 고장이 나면 고장난 타이어 번호를 반환한다.
        // 순서대로 1, 2, 3, 4, 고장이 나지 않으면 0을 반환한다.
        // 자동차가 달릴 시, 타이어의 roll 메서드가 수행된다.
        System.out.println("[자동차가 달립니다.]");
        // 모든 타이어가 1회씩 실행되어야 하므로 각 Tire 객체의 roll() 메서드를 호출
        // flase(펑크)를 리턴하는게 나오면 stop() 메소드 호출 후 해당 타이어 번호를 리턴
        if (frontLeft.roll() == false) {stop(); return 1;}
        if (frontRight.roll() == false) {stop(); return 2;}
        if (backLeft.roll() == false) {stop(); return 3;}
        if (backLeft.roll() == false) {stop(); return 4;}
        return 0;
    }

    void stop() {
        System.out.println("[자동차가 멈춥니다.]"); // 펑크 났을 때 실행
    }
}
