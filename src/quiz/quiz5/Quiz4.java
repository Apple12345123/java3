package quiz.quiz5;

import java.util.*;

/*
여행 가방 준비하기

    Collections의 정적 유틸리티 메서드를 사용하여 요구사항을 실행해보세요.
    물품 리스트 가방을 생성하고 물품을 추가해보세요.
    - 물품 정렬: 리스트에 있는 물품들을 알파벳 순으로 정렬하세요.
    - 물품 순서 뒤집기: 순서대로 정렬된 물품 리스트의 순서를 뒤집어 보세요.
    - 물품 셔플: 준비한 물품 리스트의 순서를 무작위로 섞어 보세요.
    - 특정 물품의 빈도 수 계산:  특정 물품이 몇 개 있는지 계산하세요.
    - 물품 추가: 여행 가방에 추가 물품을 넣으세요. 이미 리스트가 있다면, addAll 메소드를 사용하여 추가 물품 리스트를 기존 리스트에 합쳐 보세요.
    - 중복 물품 제거: 여행 가방에서 중복된 물품을 제거한 새로운 리스트를 생성하세요. (힌트: Set 컬렉션 사용)
    - 물품 찾기: 문자열에서 가장 앞서거나 뒤에 오는 물건을 찾아 보세요.

    출력예시
    ===
    원본 물품 리스트: [지갑, 여권, 선글라스, 책, 삼각대, 충전기, 지도, 겨울옷]
    정렬 후 물품 리스트: [겨울옷, 선글라스, 여권, 지갑, 지도, 삼각대, 충전기, 책]
    뒤집은 후 물품 리스트: [책, 충전기, 삼각대, 지도, 지갑, 여권, 선글라스, 겨울옷]
    셔플 후 물품 리스트: [삼각대, 책, 충전기, 지도, 겨울옷, 선글라스, 지갑, 여권]
    추가 물품 후 리스트: [삼각대, 책, 충전기, 지도, 겨울옷, 선글라스, 지갑, 여권, 휴대폰, 카메라, 책]
    '책'의 빈도 수: 2
    중복 제거 후 리스트: [삼각대, 책, 충전기, 지도, 겨울옷, 선글라스, 지갑, 여권, 휴대폰, 카메라]
    가장 중요한 물품(최소값): 겨울옷
 */
public class Quiz4 {
    public static void main(String[] args) {
        List<String> items = new ArrayList<>(
                Arrays.asList("지갑", "여권", "선글라스", "책", "삼각대", "충전기", "지도", "겨울옷")
        );
        System.out.println("원본 물품 리스트: " + items);

        Collections.sort(items);
        System.out.println("정렬 후 물품 리스트: " + items);

        Collections.reverse(items);
        System.out.println("뒤집은 후 물품 리스트: " + items);

        Collections.shuffle(items);
        System.out.println("셔플 후 물품 리스트: " + items);

        Collections.addAll(items, "휴대폰", "카메라", "책");
        System.out.println("추가 물품 후 리스트: " + items);

        int frequency = Collections.frequency(items, "책");
        System.out.println("'책'의 빈도 수: " + frequency);

        Set<String> uniqueItems = new HashSet<>(items);
        System.out.println("중복 제거 후 리스트: " + uniqueItems);

        String maxItem = Collections.max(uniqueItems);
        System.out.println("가장 중요한 물품(최소값): " + maxItem);
    }
}
