package quiz.quiz2.Ex4;

public class Healer extends Character implements Healable{
    public Healer(String name) {
        super(name);
    }

    @Override
    public void heal(Character character) {
        System.out.println("힐러은(는)" + character.getName() + "을(를) 치유합니다. 치유의 빛!");
    }
}
