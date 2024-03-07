package library.lang;

public class StringMethod1 {
    public static void main(String[] args) {
        // 문자열에서 자주 사용되는 메서드

        // 1. length : 문자열의 길이(문자 수)를 반환
        int l1 = "".length();
        int l2 = "반갑습니다.".length();
        int l3 = "공백도 길이로 칠까요? 네, 길이로 칩니다.".length();
        int l4 = "\n\t이스케이프문자는? 문자에 포함됩니다.".length();

        // 2. isEmpty : 문자열의 길이가 0인지 여부
        String em1 = "";
        String em2 = "  ";
        String em3 = "\t\t\n";

        System.out.println("1번 길이 0? " +  em1.isEmpty());   // true
        System.out.println("2번 길이 0? " +  em2.isEmpty());   // false
        System.out.println("3번 길이 0? " +  em3.isEmpty());   // false

        // 3. isBlank : 공백(white space)을 제외한 문자 길이가 0인지 여부
        System.out.println("1번 blank 0? " +  em1.isBlank());
        System.out.println("2번 blank 0? " +  em2.isBlank());
        System.out.println("3번 blank 0? " +  em3.isBlank());

        // 4. trim : 문자열 시작과 끝 좌우의 white space 제거 (내부 공백은 제거하지 않음)
        String str = "        \t 입력된 정보                 아하하하 \n";
        // 기존 문자열을 변경하지 않고 새로운 문자열 객체를 생성하여 리턴한다.
        String trim = str.trim();
        System.out.println("기존 문자열 : " + str);
        System.out.println("trim 문자열 : " + str.trim());


    }
}
