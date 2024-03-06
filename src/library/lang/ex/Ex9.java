package library.lang.ex;
/*
    실습 문제: 문자열 정보 처리 및 분석

    요구사항:
    당신은 텍스트 기반 데이터를 처리하는 소프트웨어를 개발하고 있습니다.
    사용자로부터 한 줄의 문자열을 입력받아,
    다음과 같은 정보를 출력하는 프로그램을 작성하세요.

    - 입력받은 문자열의 길이.
    - 문자열에서 공백의 수.
    - 문자열을 쉼표(,)로 분리한 후, 각 부분 문자열의 길이를 출력.
    - 문자열이 "Java"를 포함하는지 여부.
    - 문자열이 "프로그래밍"으로 끝나는지 여부.
    - 문자열 중 "a" 문자가 몇 번 나타나는지 카운트. (대소문자 구분 없음)

    입력 예시 문자열
    ===
    Java 프로그래밍, 문자열 처리 연습

    출력 예시
    ===
    문자열 길이: 24
    공백 수: 3
    각 부분 문자열 길이: [13, 8, 2]
    "Java" 포함 여부: true
    "프로그래밍"으로 끝나는가: false
    "a" 문자의 수: 2
     */
public class Ex9 {
    public static void main(String[] args) {
        String sentences = "오늘은 Java 수업 19일차 입니다.";

        String[] sentenceArray = sentences.split(" ");
        for (String sentence : sentenceArray) {
            System.out.println(sentence);
        }

        //문자열 길이
        int l1 = sentences.length();
        System.out.println("문자열 길이: " + l1);

        // 공백 수

        // 각 부분 문자열 길이


        // java 포함여부
        boolean java = sentences.contains("java");
        System.out.println("Java 포함여부 : " + java);

        // 프로그래밍으로 끝나는가
        boolean b2 = sentences.endsWith("프로그래밍");
        System.out.println("프로그래밍으로 끝나는가: " + b2);

        // a 문자의 수
        int aCount = sentences.length();
        int aCount2 = sentences.replace("a", "").length();

        int aCount3 = aCount - aCount2;
        System.out.println("a 문자의 수 : " + aCount3);
    }
}
