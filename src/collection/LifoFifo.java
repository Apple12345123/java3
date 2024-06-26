package collection;

import library.lang.DeepCopy;

import java.util.*;

public class LifoFifo {
    public static void main(String[] args) {
        // LIFO : 후입선출 Last In First Out  => Stack
        // FIFO : 선입선출 First In First Out => Queue
        /* 1. Stack
            마지막에 추가 된 요소가 먼저 제거됨
            push : 스택에 요소를 추가
            pop : 스택에서 마지막 요소를 꺼냄 (제거 + 반환)
            peek : 스택에서 요소를 반환

            택시의 동전케이스, 웹 브라우저 방문 기록, 함수 호출의 콜스택, DFS(깊이우선탐색)

            Java에서 Stack 클래스는 컬렉션 프레임워크와 일관성이 떨어지는 문제로 사용하지 않는다.
            => 모던 자바에서는 ArrayDeque 를 사용
         */
        Stack<Integer> stack = new Stack<>();

        stack.push(10);
        stack.push(20);
        stack.push(30);

        System.out.println("stack = " + stack);  // stack = [10, 20, 30]

        // 가장 마지막에 있는 것부터 삭제하면서 반환
        Integer popNumber = stack.pop();
        System.out.println("popNumber = " + popNumber); // popNumber = 30

        System.out.println("stack = " + stack);  // stack = [10, 20]

        // peek : 가장 마지막 요소 확인(반환)하고 제거하지 않음
        Integer peekNumber = stack.peek();
        System.out.println("peekNumber = " + peekNumber);  // peekNumber = 20

        System.out.println("stack = " + stack);  // stack = [10, 20]

        /*
        Queue (대기열)
        가장 먼저 추가된 요소가 가장 먼저 제거
        offer : Queue의 끝에 요소를 추가
        poll : Queue의 시작부분 요소를 제거하고 반환
        peek : Queue의 시작 부분 요소를 확인하고 제거하지 않음.

        인쇄 작업 대기열, 웹 서버의 요청 처리 대기, BFS(너비 우선 탐색)
        Queue 인터페이스 구현 객체 : LinkedList, ArrayDeque
         */

        Queue<String> queue = new LinkedList();

        // 요소 추가
        queue.offer("1번 손님");
        queue.offer("2번 손님");
        queue.offer("3번 손님");

        System.out.println("queue = " + queue); // queue = [1번 손님, 2번 손님, 3번 손님]

        // poll : 가장 앞 요소 반환하며 삭제
        String pollGuest = queue.poll();
        System.out.println("pollGuest = " + pollGuest); // pollGuest = 1번 손님

        System.out.println("queue = " + queue); // queue = [2번 손님, 3번 손님]

        // peek : 가장 앞요소 확인(반환)
        String peekGuest = queue.peek();
        System.out.println("peekGuest = " + peekGuest);  // peekGuest = 2번 손님
        System.out.println("queue = " + queue);  // queue = [2번 손님, 3번 손님]

        /*
        Deque(데크) Double Ended Queue
        Queue 자료 구조에서 양 쪽 끝 요소를 추가하거나 제거할 수 있는 유연한 자료 구조
        FIFO와 LIFO 방식을 모두 지원

        구현 클래스 : LinkedList, ArrayDeque
         */

        Deque<Integer> deque = new ArrayDeque<>(
                Arrays.asList(3, 4, 5)
        );
        System.out.println("deque = " + deque);
        // 앞 쪽에 요소 추가
        deque.addFirst(2);
        deque.offerFirst(1);

        System.out.println("deque = " + deque);

        // 뒤 쪽에 요소 추가
        deque.addLast(6);
        deque.offerLast(7);

        System.out.println("deque = " + deque);

        // 앞 쪽에서 요소 제거 (FIFO)
        deque.removeFirst();
        deque.pollFirst();

        System.out.println("deque = " + deque);

        // 뒤 쪽에서 요소 제거 (LIFO)
        deque.removeLast();
        deque.pollLast();
        deque.pop(); // 최근에 들어온 요소를 제거

        System.out.println("deque = " + deque);
    }
}
