package access_modifier.com.school.management;

public class StudentMain {
    public static void main(String[] args) {
        // 객체 생성 => 변수 선언
        Student student = new Student("전우치", "1234");
        Student student1 = new Student("차은우", "5678");

        // 정보 가져오기
        System.out.println("학생 " + student.getName() + " 의 아이디는" + student.getStudentId() );
        // 정보 변경하기 => setter
        student.setName("김서준");
        student.setStudentId("5682");
        // 변경된 정보 출력
        System.out.println("학생 " + student.getName() + " 의 아이디는" + student.getStudentId() );
    }



    }

