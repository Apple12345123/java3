package quiz3.Quiz1;

public class CreditCard implements Payment{
    @Override
    public void pay(long amount) {
        System.out.println("신용카드로 " + amount + "원 결제되었습니다.");
    }
}