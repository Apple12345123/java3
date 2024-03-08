package quiz3.Quiz1;

public class BankTransfer implements Payment{
    @Override
    public void pay(long amount) {
        System.out.println("은행 이체로 " +  amount + "원 결제되었습니다.");
    }
}
