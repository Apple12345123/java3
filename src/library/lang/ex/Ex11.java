package library.lang.ex;

public class Ex11 {
    /*
    연습문제: 가장 긴 단어 찾기

    요구사항:
    사용자로부터 한글 문장을 입력받아,
    문장 내에서 가장 긴 단어를 출력하는 프로그램을 작성하세요.
    단어는 공백으로 구분됩니다.

    예시 입력
    ===
    데이터 분석과 프로그래밍은 매우 재미있어요

    예시 출력
    ===
    프로그래밍은
     */
    /* String s = "데이터 분석과 프로그래밍은 매우 재미있어요";
        solution(s);
    }
    public static String solution(String s) {
        String answer = "";

        int max = Integer.MIN_VALUE, pos;
        // 첫번째로 발견되는 띄어쓰기 위치 반환 (발견하지 못하면 -1 반환해줌)
        while ((pos = s.indexOf(" ")) != -1) {
            String d = s.substring(0, pos);
            int len = d.length();
            if (len > max) {  // = 를 사용하면 뒤에서 동일한 길이의 단어 발견시 해당 단어로 변경됨
                max = len;
                answer = d;
            }
            s = s.substring(pos + 1);
        }
        // 문장 내에서 마지막 단어에는 공백이 없어 위 while문을 타지 않기 때문에 아래 내용 추가
        if (s.length() > max) answer = s;
        return answer;
    }*/
    public static void main(String[] args) {
        String input = "데이터 분석과 프로그래밍은 매우 재미있어요";

        String[] words = input.split(" ");

        String longWord = " ";
        for (String word : words) {
            if (word.length() > longWord.length()) {
                longWord = word;
            }
        }
        System.out.println(longWord);
    }
}
