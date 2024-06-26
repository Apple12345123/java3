package collection.list;

import java.util.*;

public class List2 {
    public static void main(String[] args) {
        // 빈 리스트를 생성
        List<String> fruits1 = new ArrayList<>();
        fruits1.add("감");
        fruits1.add("수박");
        System.out.println("fruits1 = " + fruits1);     // fruits1 = [감, 수박]

        // 지정된 클래스 요소들을 포함하여 생성
        List<String> fruits2 = new ArrayList<>(
                List.of("바나나", "사과", "딸기")
        );
        System.out.println("fruits2 = " + fruits2);     // fruits2 = [바나나, 사과, 딸기]

        // addAll 지정된 컬렉션의 요소를 리스트 끝에 추가
        fruits1.addAll(fruits2);
        System.out.println("fruits1 = " + fruits1);     // fruits1 = [감, 수박, 바나나, 사과, 딸기]

        // removeAll 매개변수로 주어진 컬렉션의 요소들을 삭제
        fruits1.removeAll(fruits2);
        System.out.println("fruits1 = " + fruits1);     // fruits1 = [감, 수박]

        // Arrays.asList 배열을 리스트로 변경 (List 인터페이스 타입)
        // ArrayList 아님.
        List<String> fruits3 = Arrays.asList("체리", "토마토", "참외");

        // Collection 타입의 매개변수를 넣는 곳에 넣을 수 있음.
        fruits1.addAll(fruits3);
        System.out.println("fruits1 = " + fruits1);  // fruits1 = [감, 수박, 체리, 토마토, 참외]
        fruits1.addAll(Arrays.asList("망고", "용과"));
        System.out.println("fruits1 = " + fruits1);  // fruits1 = [감, 수박, 체리, 토마토, 참외, 망고, 용과]

        // List.of Immutable 변경 불가 List를 반환
        List<String> fruits4 = List.of("파파야", "오렌지");
        // fruits4.add("밤"); 변경 가능한 메서드를 넣었을 때, Exception

        // mutable List에 Immutable List를 넣었을 때 => mutable
        fruits1.addAll(fruits4);
        System.out.println("fruits1 = " + fruits1);  // fruits1 = [감, 수박, 체리, 토마토, 참외, 망고, 용과, 파파야, 오렌지]

        // subList() 리스트의 지정된 범위만큼을 반환 (시작인덱스 포함, 끝인덱스 포함하지 않음)
        List<String> fruits5 = fruits1.subList(3, 6);
        System.out.println("fruits5 = " + fruits5);  // fruits5 = [토마토, 참외, 망고]

        // List는 중복 요소 허용
        fruits1.add("망고");
        fruits1.add("망고");
        System.out.println("fruits1 = " + fruits1);  // fruits1 = [감, 수박, 체리, 토마토, 참외, 망고, 용과, 파파야, 오렌지, 망고, 망고]

        // indexOf : 객체로 인덱스를 반환, 가장 첫번째 인덱스를 찾고 없으면 -1 리턴
        int index = fruits1.indexOf("망고");
        System.out.println("index = " + index);  // index = 5

        // lastIndexOf : 지정된 객체의 마지막 인덱스 반환
        int lastIndex = fruits1.lastIndexOf("망고");
        System.out.println("lastIndex = " + lastIndex);   // lastIndex = 10

        // iterator : 반복자 반환
        Iterator<String> iterator = fruits1.iterator();

        // sort : 요소를 정렬. Comparator (정렬자)를 매개변수로 받음.
        fruits1.sort(String::compareTo);
        // 문자열 오름차순으로 정렬
        System.out.println("fruits1 = " + fruits1);  // fruits1 = [감, 망고, 망고, 망고, 수박, 오렌지, 용과, 참외, 체리, 토마토, 파파야]
        // 문자열 내림차순으로 정렬
        fruits1.sort(Comparator.reverseOrder());
        System.out.println("fruits1 = " + fruits1);  // fruits1 = [파파야, 토마토, 체리, 참외, 용과, 오렌지, 수박, 망고, 망고, 망고, 감]
    }
}
