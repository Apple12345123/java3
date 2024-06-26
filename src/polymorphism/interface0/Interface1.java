package polymorphism.interface0;

public interface Interface1 {
    // 인터페이스 선언 : 선언부에 class 대신 interface 작성
    // 인터페이스의 특징
    // 추상 메서드와 상수로 구성된다. (Java 8버전 이후에는 본문을 가진 특수 메서드 구현 가능)
    // 인스턴스를 생성할 수 없다.
    // 상속받은 클래스는 모든 메서드를 오버라이딩 해야 한다.

    // 상수
    public static final double Pi = 3.14159;
    // 인터페이스에서 상수 필드는 public static final을 생략하더라도 컴파일 과정에서 자동으로 붙게 된다.
    // 붙일 필요가 없어서 회색으로 (public static final)처리됨. 모든 필드가 상수니까 붙일 필요가 없게 됨.
    int MAX_VOLUME = 20;
    // 인터페이스의 모든 필드는 상수이다.

    // 추상 메서드 : 상속받은 클래스가 인터페이스에서 구성된 모든 추상 메서드를 구현해야 한다.
    // 메서드 선언부만 작성하고 본문 및 접근제어자는 생략
    public void TurnOm();       // public abstract가 생략되어 컴파일러에서 자동으로 붙게된다.
    public void turnOff();
    void setVolume(int volume);
}
