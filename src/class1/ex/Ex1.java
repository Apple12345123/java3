package class1.ex;
// person 클래스를 설계해주세요.
// 필드 : name, age, gender
// 생성자 : 모든 속성을 초기화하는 생성자, 이름, 성별만 초기화하는 생성자
// 메서드 : 필드 정보를 출력하는 printInfo()

import class1.Member;

// main 메서드에서 사용해보세요.
public class Ex1 {
    public static void main(String[] args) {
        Person person1 = new Person("사랑이", 20, 'G');
        Person person2 = new Person("유나", 25, 'G');
        Person person3 = new Person("차은우", 26, 'M');

        person1.printInfo();
        person2.printInfo();
        person3.printInfo();
    }
}
