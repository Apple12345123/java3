package polymorphism.ex.ex1;

public class HankookTire extends Tire{
    // 생성자
    public HankookTire(String location, int maxRotation) {      // Alt + Insert
        super(location, maxRotation);
    }
    //메서드
    @Override       // Ctrl + o
    public boolean roll() {
        ++accumulateRotation;
        if (accumulateRotation < maxRotation) {
            System.out.println(location + "HankookTire 수명: " + (maxRotation - accumulateRotation) + "회");
            return true;
        } else {
            System.out.println("*** " + location + "HankookTire 펑크 ***");
            return false;
        }

    }
}
