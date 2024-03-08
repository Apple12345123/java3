package quiz3.Quiz1;

public class MobilePay implements Payment{
    @Override
    public void pay(long amount) {
        System.out.println("모바일 결제로 " + amount + "원 결제되었습니다.");
    }
}
