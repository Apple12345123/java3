package collection.map.ex;

import java.util.HashMap;
import java.util.Map;

/*
    연습문제 1: 학생 점수 관리

    문제 설명
    학생들의 이름과 그에 해당하는 점수를 HashMap을 사용하여 관리하는 프로그램을 작성하세요. 프로그램은 다음 기능을 수행해야 합니다:

    학생의 이름과 점수를 추가합니다.
    특정 학생의 점수를 조회합니다.
    모든 학생의 이름과 점수를 출력합니다.

    예시 데이터
    학생 "Alice"의 점수는 85점입니다.
    학생 "Bob"의 점수는 92점입니다.
    학생 "Charlie"의 점수는 88점입니다.
     */
public class Ex1 {
    public static void main(String[] args) {
        Map<String, Integer> scores = new HashMap<>();

        scores.put("Allice", 85);
        scores.put("Bob", 92);
        scores.put("Charlie", 88);

        // 특정 학생의 점수 조회
        Integer bobScore = scores.get("Bob");
        System.out.println("bobScore = " + bobScore);

        // 모든 학생 점수 출력
        // 방법 1.
        // scores.forEach((key, value) ->System.out.println("학생" +  key+ "의 점수는 " + value + "점입니다."));
        // 방법 2.
        System.out.println("모든 학생의 점수 : ");
        for (String s : scores.keySet()) {
            System.out.println(s + "의 점수는 " + scores.get(s));
        }

    }
}
