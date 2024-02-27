package polymorphism.abstraction.pure;

public class Cat extends Animal{
    @Override
    public void sound() {
        System.out.println("냐옹");
    }

    @Override
    public void move() {
        System.out.println("고양이가 당당하게 걸어갑니다.");
    }
}
