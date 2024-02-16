package class0.ex;
/* 자동차를 나타내는 'Car' 클래스를 선언하세요

    필드는 brand, model, year을 가집니다.
    메인메서드에서 자동차를 2대 생성하고
    속성을 출력하세요.
     */
public class Car {
    String brand;
    String model;
    String year;

    public static void main(String[] args) {

        Car[] cars = new Car[2];

        Car car1 = new Car();
        car1.brand = "A";
        car1.model = "a";
        car1.year = "2023";

        Car car2 = new Car();
        car2.brand = "B";
        car2.model = "b";
        car2.year = "2021";

        cars[0] = car1;
        cars[1] = car2;

        for (int i = 0; i < cars.length ; i++) {
            System.out.println("브랜드명 = " + cars[i].brand + ",  모델명 = " + cars[i].model + ",  년도 = " + cars[i].year);
        }


    }
}
