package quiz.quiz5;

import java.util.HashMap;
import java.util.Map;

/*
단어 빈도수 계산

     한 문장 내에서 각 단어가 몇 번 나타나는지 계산하는 프로그램을 작성하세요.
     대소문자는 구분하지 않으며, 단어는 공백으로 구분된다고 가정합니다.
     결과는 단어를 키로 하고, 빈도수를 값으로 하는 HashMap에 저장해야 합니다.
     * 문자열 메서드 replaceAll 은 매개변수로 한글이 아닌 것을 찾는 정규식
       "[^가-힣]"을 매개변수로 받을 수 있습니다.

    입력 예시
    ===
    String text = "나는 집에 간다. 나는 학교에 간다.";

    출력 예시
    ===
    단어 빈도수:
    간다: 2
    집에: 1
    나는: 2
    학교에: 1
 */
public class Quiz3 {
    public static void main(String[] args) {
        String text = "나는 집에 간다. 나는 학교에 간다.";
        text = text.toLowerCase();

        String[] splitText = text.split(" ");

        Map<String, Integer> hs = new HashMap<>();

        for (int i = 0; i < splitText.length; i++) {
            if (hs.containsKey(splitText[i])) {
                hs.put(splitText[i], hs.get(splitText[i]) + 1);
            } else {
                hs.put(splitText[i], 1);
            }
        }
        for (String key : hs.keySet()) {
            System.out.println(key + ": " + hs.get(key));
        }
    }
}
