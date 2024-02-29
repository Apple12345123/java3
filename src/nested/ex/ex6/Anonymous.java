package nested.ex.ex6;

public class Anonymous {
    // 필드에서 익명
    Vehicle bicycle = new Vehicle() {
        @Override       // Ctrl + o 단축키
        public void run() {
            System.out.println("자전거가 달립니다.");
        }
    };

    // 지역변수에 익명
    void method1() {
        Vehicle car = new Vehicle()
        {
            @Override
            public void run() {
                System.out.println("승용차가 달립니다.");
            }
        };
        car.run();
    }

    void method2(Vehicle vehicle) {
        vehicle.run();
    }
}
