package method;

public class Char {
    public static void main(String[] args) {
        String str = "java";

        for (int i = 0; i < str.length(); i++) {
            System.out.print(str.charAt(i));

            boolean isCorrect = false;
            if (str.charAt(i) == 'j') {
                System.out.println("맞았습니다.");
                isCorrect = true;
            } else {
                System.out.println("아닙니다.");
                isCorrect = false;
            }
        }
    }
}
