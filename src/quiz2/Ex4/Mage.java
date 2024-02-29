package quiz2.Ex4;

public class Mage extends Character implements Attackable{
    public Mage(String name) {
        super(name);
    }
    @Override
    public void attack(Character character) {
        System.out.println("마법사가 " + character.getName() + "에게 마법 공격을 합니다. 불의 화살!");
    }
}
