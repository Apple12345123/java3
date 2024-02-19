package class0.ex;

import java.util.Scanner;

public class Ex8 {
    public static void main(String[] args) {
        // 1. 동물(Animal) 클래스를 정의
        // 동물의 종류, 이름, 나이를 데이터로 가지고 동물의 정보를 출력하는 메서드를 가짐
        // 2. 해당 클래스를 메인메소드에 생성하고 사용해보세요.

        Scanner scanner = new Scanner(System.in);

        Animal animal = new Animal();
        System.out.println("동물의 종류를 입력하세요 : ");
        String type = scanner.nextLine();

        System.out.println("동물의 이름을 입력하세요 : ");
        String name = scanner.nextLine();

        System.out.println("동물의 나이를 입력하세요 : ");
        int age = scanner.nextInt();

        animal.type = type;
        animal.name = name;
        animal.age = age;
        animal.printInformation();



        
    }
}
