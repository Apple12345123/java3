package access_modifier.com.school.management;
// 연습문제: 학생 관리 시스템

// 학생 정보는 com.school.management 패키지
// 실행 로직은 Main 클래스에서 처리됩니다.
/*
1. 패키지 생성: com.school.management

2. Student 클래스 구현:
인스턴스 변수: name, studentId
생성자: Student(String name, String studentId)로 학생의 이름과 ID를 초기화
게터와 세터: 각 변수에 대한 public 게터와 세터 =  메서드

3. Main 클래스
com.school.management 패키지의 Student 객체를 생성
학생의 이름과 ID를 설정
설정된 이름과 ID를 출력

실행결과
=====
학생 이름: 홍길동
학생 ID: S1234
*/
public class Student {
    // 필드 : 필드를 접근 불가하게 캡슐화. 메서드로 돌아가게 하겠다.
    private String name;
    private String studentId;

    // 생성자 만드는 단축키 : Alt + Insert
    public Student(String name, String studentId) {
        this.name = name;
        this.studentId = studentId;
    }

    // 메서드
    // 필드의 값을 가져하는 getter
    // 필드의 값을 설정하는 setter
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getStudentId() {
        return studentId;
    }
    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

}

