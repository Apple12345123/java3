package static0;

public class Final1 {
    public static void main(String[] args) {
        Person person = new Person("800000-111111", "서수지");

        System.out.printf(person.nation);  // final 필드 초기값 할당됨
        System.out.printf(person.ssn);     // 생성자 시점 초기값 할당
        System.out.printf(person.name);

        // 개명 신청
        person.name = "유지민";            // 일반 필드 변경 가능
        // 주민번호(final) 변경
        // person.ssn = "800000-222122";  // final 필드는 변경 불가
        // 국가(final) 변경 불가
        // person.nation = "America";     // 변경 불가
    }
}
