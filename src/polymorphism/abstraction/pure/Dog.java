package polymorphism.abstraction.pure;

public class Dog extends Animal{
    @Override
    public void sound() {
        System.out.println("멍멍");
    }

    @Override
    public void move() {
        System.out.println("강아지가 활발하게 움직입니다.");
    }
}
