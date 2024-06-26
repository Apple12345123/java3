package method;

public class Ex4 {
    public static void main(String[] args) {
        // 배열에서 최소값과 최대값 찾기
        // 배열 내의 최소값과 최대값을 찾아 출력하는 메소드 findMinAndMax를 작성하세요.
        int[] numbers = {54, 32, 21, 6, 24, 3};
        findMinAndMax(numbers);
    }

    public static void findMinAndMax(int[] array) {
        int min = array[0];
        int max = array[0];
        for (int i : array) {
            if (i < min) {
                min = i;
            }
            if (i > max) {
                max = i;
            }
        }
        System.out.println("최소값 : " + min + "  " + "최대값 : " + max);
    }
}
