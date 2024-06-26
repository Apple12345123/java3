package quiz.quiz2.Ex2;
/*
교통수단 시스템

교통수단 시스템을 객체 지향 프로그래밍 방식으로 설계하고 구현하는 것이 목표입니다. 이 시스템에서는 상속과 추상 클래스를 활용하여 여러 종류의 교통수단(예: 자동차, 자전거, 기차)을 모델링해야 합니다.

요구사항:
Transport라는 추상 클래스를 만듭니다. 이 클래스는 최소한 move() 메서드를 포함해야 하며, 이 메서드는 교통수단의 이동 방식을 출력합니다.
Car, Bicycle, Train 클래스를 만들고, 이들 각각이 Transport 클래스를 상속받도록 합니다. 각 클래스는 move() 메서드를 자신의 교통수단 타입에 맞게 구현해야 합니다.
각 교통수단 클래스의 객체를 생성하고, 그 객체들을 이용해 이동 방식을 출력해봅니다.

출력 예시:
Car의 move() 메서드는 "자동차가 도로를 달립니다."를 출력합니다.
Bicycle의 move() 메서드는 "자전거가 길을 따라 pedaling합니다."를 출력합니다.
Train의 move() 메서드는 "기차가 철로를 따라 질주합니다."를 출력합니다.
 */
public class Main {
    public static void main(String[] args) {
        Transport[] transports = {new Car(), new bicycle(), new Train() };

        for (Transport transport : transports) {
            transport.move();
        }
    }
}
