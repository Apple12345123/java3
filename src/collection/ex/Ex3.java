package collection.ex;

import java.util.EmptyStackException;
import java.util.Scanner;
import java.util.Stack;

/*
    문제 : 웹 브라우저 방문 기록 (Stack 활용)
    웹 브라우저에서 사용자가 방문한 페이지의 이력을 스택을 사용하여 관리하는 프로그램을 작성하세요.
    사용자가 새로운 페이지로 이동할 때마다 해당 페이지의 URL을 스택에 push하고,
    사용자가 뒤로 가기 버튼을 클릭할 때마다 스택에서 최근 페이지 URL을 pop하여 이전 페이지로 이동할 수 있게 합니다.

    요구사항:
    사용자가 방문한 페이지 URL을 순서대로 스택에 추가(push)합니다.
    사용자가 뒤로 가기를 선택하면, 현재 페이지를 스택에서 제거(pop)하고, 이전 페이지를 조회(peek)합니다.
    입력 예시:

    데이터
    www.example.com
    www.example.com/about
    www.example.com/contact

    출력 예시:
    현재 페이지: www.example.com/contact
    이전 페이지로 돌아갑니다: www.example.com/about
     */
public class Ex3 {
    public static void main(String[] args) {
        Stack<String> webHistory = new Stack<>();
        webHistory.push("www.example.com");
        webHistory.push("www.example.com/about");
        webHistory.push("www.example.com/contact");

        goback(webHistory);
        goback(webHistory);
        goback(webHistory);
    }

    private static void goback(Stack<String> webHistory) {
        try {
            String pop = webHistory.pop();      // 컨트롤 후 Extract 누르고 Method 눌러서 goback 입력하면 goback 메서드 생성 완료
            System.out.println("현재 페이지 = " + pop);
            String peek = webHistory.peek();
            System.out.println("이전 페이지로 돌아갑니다. = " + peek);
        } catch (EmptyStackException e ) {
            System.out.println("더 이상 돌아갈 페이지가 없습니다.");
        }
    }
}
