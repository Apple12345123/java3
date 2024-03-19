package stream.ex;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

/*
    문제 1: 고양이 이름 필터링

    고양이 이름이 담긴 리스트가 있습니다.
    이름이 4글자 이상인 고양이들만 필터링하여
    그 이름을 대문자로 변환한 후, 결과를 출력하세요.

    List<String> catNames = Arrays.asList("Leo", "Milo", "Luna", "Oli", "Zoe", "Bella");

    출력 결과:
    MILO
    LUNA
    BELLA
     */
public class Ex1 {
    public static void main(String[] args) {
        List<String> catNames = Arrays.asList("Leo", "Milo", "Luna", "Oli", "Zoe", "Bella");

        Set<String> newCatNames =catNames.stream()
                .filter(catName -> catName.length() > 3)
                .map(String::toUpperCase)
                .collect(Collectors.toSet());

        newCatNames.forEach(System.out::println);
    }
}
