package polymorphism;

public class Chicken extends Animal{
    // public void cock() {} //  cock -> sound sound라고 쓰지 않고 cock으로 쓰면 "꼬끼오"라고 실행되지 않고 "동물 울음소리를 구현합니다."라고 뜬다.
    public void cock() {
        System.out.println("꼬끼오");
    }
}
