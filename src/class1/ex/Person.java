package class1.ex;

// person 클래스를 설계해주세요.
// 필드 : name, age, gender
// 생성자 : 모든 속성을 초기화하는 생성자, 이름, 성별만 초기화하는 생성자
// 메서드 : 필드 정보를 출력하는 printInfo()

// main 메서드에서 사용해보세요.
public class Person {
    String name;
    int age;
    char gender;

    // 생성자
    Person(String name, int age, char gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }
    // 이름, 성볆나 초기화하는 생성자
    Person(String name, char gender) {
        this(name, 0, gender);
    }

    // 메서드
    void printInfo() {
        System.out.println(name + "씨는" + age + "세이고 성별은 " + gender + "입니다.");
    }


}
