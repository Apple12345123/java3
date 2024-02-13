package loop;

public class Ex1 {
    public static void main(String[] args) {
        // 반복문을 이용해서 20이내의 짝수를 출력해주세요.
        // 증감식의 경우 1씩 증가 대신 다른 증감 대입이 가능하다.
        /*for (int i = 0; i < 20; i++) {
            System.out.println(i);
        }*/

        int i = 2;
        while (i < 21) {
            if (i%2 == 1 ) {
                i++;
                continue;
            }
            System.out.println("i = " + i);
            i++;
        }
    }
}
