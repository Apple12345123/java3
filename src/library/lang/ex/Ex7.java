package library.lang.ex;
/*
    연습문제 3: 시스템 속성 출력

요구사항:
자바 버전, 운영 체제 이름, 사용자 작업 디렉토리를 출력하는 프로그램을 작성하세요.
System.getProperty() 메소드를 사용하여 각 속성("java.version", "os.name", "user.dir")의 값을 조회합니다.
조회된 각 속성 값을 출력하세요.

실행 결과 예시:
자바 버전: 1.8.0_231
운영 체제: Mac OS X
사용자 작업 디렉토리: /Users/username/projects
     */
public class Ex7 {
    public static void main(String[] args) {
        String javaVersion = System.getProperty("java.version");
        String osName = System.getProperty("os.name");
        String userDir = System.getProperty("user.dir");

        System.out.println("javaVersion : " + javaVersion);
        System.out.println("운영체제 : " + osName);
        System.out.println("사용자 디렉토리 : " + userDir);
    }
}
