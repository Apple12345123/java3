package collection;

import java.lang.reflect.Array;
import java.util.*;

public class CollectionUtil {
    public static void main(String[] args) {
        // Collections 클래스 : 다양한 컬렉션을 다루기 위해 제공하는 메서드들의 모음
        List<Integer> numberList = new ArrayList<>();
        numberList.addAll(
                Arrays.asList(3,1,6,9,8,7,4,1,0,8,2,5,9,5,6,2,5,5)
        );
        System.out.println("numberList = " + numberList);   // numberList = [3, 1, 4, 1, 5, 9, 5, 6, 2, 5, 5]

        // sort : List를 정렬
        Collections.sort(numberList);
        System.out.println("numberList = " + numberList);   // numberList = [1, 1, 2, 3, 4, 5, 5, 5, 5, 6, 9]

        // Collections.sort(numberList, 비교자) // 정렬기준을 다르게 적용 가능
        Collections.sort(numberList, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2 - o1;  // 내림차순으로 정렬
            }
        });
        System.out.println("numberList = " + numberList);   // numberList = [9, 6, 5, 5, 5, 5, 4, 3, 2, 1, 1]

        // binarySearch : 이진 검색 알고리즘을 사용해서 정렬된 리스트를 검색
        Collections.sort(numberList);
        System.out.println("numberList = " + numberList);
        int index = Collections.binarySearch(numberList, 4);
        System.out.println("4의 index = " + index);

        // reverse(List) : 리스트 요소를 역순으로 뒤집는다.
        Collections.reverse(numberList);
        System.out.println("역순 numberList = " + numberList);

        // shuffle(List) : 리스트 요소를 무작위로 섞는다.
        Collections.shuffle(numberList);
        System.out.println("섞은 numberlist = " + numberList);

        // fill(List) : 리스트의 모든 요소를 지정된 값으로 대체
        Collections.fill(numberList, 0);
        System.out.println("0으로 채운 numberList = " + numberList);

        // copy(카피 List, 원본 List) : 리스트의 내용을 다른 리스트로 복사
        // 카피List의 크기(size)가 원본 List(size)보다 같거나 커야 복사 가능
        List<Integer> copyNumberList = new ArrayList<>();
        copyNumberList.addAll(
                Arrays.asList(1, 1, 1,1 , 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1)
        );
        Collections.copy(copyNumberList, numberList);
        System.out.println("copyNumberList = " + copyNumberList);

        // max, min : 최대값 최소값 찾기
        numberList = Arrays.asList(2, 6, 3, 3, 6, 8, 2, 1, 9, 4);
        Integer max = Collections.max(numberList);
        Integer min = Collections.min(numberList);
        System.out.println("max = " + max);
        System.out.println("min = " + min);

        // rotate(List, 거리(정수)) : 지정된 거리만큼 회전시킵니다.
        Collections.rotate(numberList, 3);
        System.out.println("3만큼 회전한 numberList = " + numberList);

        // replaceAll(List, 이전값, 새값)
        Collections.replaceAll(numberList, 3, 30);  // 3을 30으로 바꿈
        System.out.println("numberList = " + numberList);

        // swap(List, 인덱스, 인덱스)
        Collections.swap(numberList, 1, 4);
        System.out.println("인덱스 1과 4가 자리가 바뀐 numberList = " + numberList);

        // frequency(Collection, 객체) : 객체의 빈도수를 반환
        int frequency = Collections.frequency(numberList, 30);
        System.out.println("30의 빈도(frequency) = " + frequency);

        // disjoint(Collection, Collection) : 공통요소가 없으면 true 를 반환
        boolean disjoint = Collections.disjoint(numberList, Arrays.asList(40, 50, 60, 1));
        System.out.println("공통요소가 없으면 true, disjoint = " + disjoint);
    }
}
