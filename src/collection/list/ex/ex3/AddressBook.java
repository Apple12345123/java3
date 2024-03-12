package collection.list.ex.ex3;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

// 주소록 관리
public class AddressBook {
    // Composition : 필드로 데이터 (친구 클래스 리스트)를 가짐
    private List<Friends> friendsList = new ArrayList<>();
    private Scanner scanner = new Scanner(System.in);

    // 삽입
    public void addFriend()  {
        System.out.println("친구 이름을 입력하세요");
        String name = scanner.nextLine();
        System.out.println("친구 이메일을 입력하세요");
        String email = scanner.nextLine();
        System.out.println("친구 전화번호를 입력하세요");
        String phoneNumber = scanner.nextLine();

        friendsList.add(new Friends(name, email, phoneNumber));
        System.out.println("주소록에 추가되었습니다.");
    }

    // 삭제
    public void deleteFriend() {
        System.out.print("삭제할 친구 이름을 입력하세요 : ");
        String name = scanner.nextLine();

        Iterator<Friends> iterator = friendsList.iterator();
        while (iterator.hasNext()) {
            if (iterator.next().getName().equals(name)) {
                iterator.remove();  // 안전한 삭제
                // friendsList.remove(name) // X
                System.out.println(name + "님의 주소록 정보가 삭제되었습니다.");
            }
        }
    }
    // 조회
    public void searchFriend() {  // Iterator.hasNext() - Iterator 안에 다음 값이 들어있는지 확인 - 들었으면 true, 안들었음 false
        System.out.println("조회를 희망하는 친구의 이름을 입력하세요");
        String name = scanner.nextLine();
        boolean isSearched = false;
        for (Friends friends : friendsList) {
            if (name.equals(friends.getName())) {
                System.out.println(friends);
                isSearched = true;
            }
        }
        if (!isSearched) System.out.println("찾을 수 없는 이름입니다.");
    }
    // 출력
    public void printAllFriends() {
        for (Friends friends : friendsList) {
            System.out.println(friends.toString());
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        AddressBook addressBook = new AddressBook();

        while (true) {
            System.out.println("""
                    1. 친구 추가
                    2. 친구 삭제
                    3. 친구 검색
                    4. 주소록 출력
                    5. 종료
                    선택>
                    """);
            int select = scanner.nextInt();

            // 향상된 switch-case문
            switch (select) {
                case 1 -> addressBook.addFriend();
                case 2 -> addressBook.deleteFriend();
                case 3 -> addressBook.searchFriend();
                case 4 -> addressBook.printAllFriends();
                case 5 -> {
                    System.out.println("종료합니다.");
                    return;
                }
                default -> System.out.println("잘못된 입력입니다.");
            }
        }
    }

}
