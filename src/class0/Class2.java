package class0;

public class Class2 {
    public static void main(String[] args) {
        // 배열을 사용하게 될 경우, 사람이 데이터를 수정하거나 관리할 때 실수할 수 있다.
        String[] studentNames = {"홍길동", "임꺽정", "이몽룡"};  // studentNames = 0x40
        int[] studentScores = {80, 70, 100};                 // studentScores = 0x50
        int[] studentAges = {30, 40, 20};

        // 학생정보 출력
        for (int i = 0; i < studentNames.length; i++) {
            System.out.println("학생 이름 = " + studentNames[i] + "   점수 : " + studentScores[i] + "    나이 : " + studentAges[i]);
        }
    }
}
