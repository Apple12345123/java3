package quiz.quiz2.Ex4;

public abstract class Character {
    // 필드 : 이름
    protected String name;

    // 생성자 : 이름을 입력받는 생성자
    public Character(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
