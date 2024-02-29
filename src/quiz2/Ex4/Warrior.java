package quiz2.Ex4;

public class Warrior extends Character implements Attackable{
    public Warrior(String name) {
        super(name);
    }
    @Override
    public void attack(Character character) {
        System.out.println("전사가 " + character.getName() +  "을(를) 공격합니다. 강한 공격!");
    }
}
