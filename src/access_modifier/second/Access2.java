package access_modifier.second;

public class Access2 {
    public static void main(String[] args) {
        Car car = new Car();


        int currentSpeed = car.getSpeed();
        // 현재 속도를 설정한다.
        car.setSpeed(119);
        car.speedUp();
        car.speedUp();

        currentSpeed = car.getSpeed();
        System.out.println(currentSpeed);

    }
}
