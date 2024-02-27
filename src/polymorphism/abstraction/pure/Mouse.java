package polymorphism.abstraction.pure;

public class Mouse extends Animal{
    @Override
    public void sound() {
        System.out.println("찍찍");
    }

    @Override
    public void move() {
        System.out.println("쥐가 조심스럽게 움직입니다.");
    }
}
