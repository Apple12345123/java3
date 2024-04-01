package quiz.quiz6;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/*  문자열 리스트 정렬

    주어진 문자열 리스트를 문자열의 길이에 따라 오름차순으로 정렬하세요.
    정렬된 리스트의 각 요소를 출력합니다. Comparator와 Consumer를 사용하여 구현하세요.

    데이터
    ====
    List<String> languages = Arrays.asList("java", "python", "swift", "cpp","ai");

    출력예시
    ===
    ai
    cpp
    java
    swift
    python
 */
public class Quiz1 {
    public static void main(String[] args) {
        List<String> languages = Arrays.asList("java", "python", "swift", "cpp", "ai");
        languages.sort(((o1, o2) -> o1.length() - o2.length()));
        languages.sort(Comparator.comparingInt(String::length));
        languages.forEach(System.out::println);
    }
}
