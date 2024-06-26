package quiz.quiz3.Quiz1;
/*
다중 결제 인터페이스

    요구사항:
    Payment 인터페이스를 생성하고, pay 메소드를 정의하세요.
    pay 메소드는 결제 금액을 매개변수로 받습니다.
    CreditCard, BankTransfer, MobilePay 클래스를 생성하고,
    각각 Payment 인터페이스를 구현하세요.
    각 결제 방법에서 pay 메소드를 구현할 때, 결제 방법에 맞는 메시지를 출력하세요.

    예를 들어, CreditCard 클래스에서는 "신용카드로 10000원 결제되었습니다."와 같은 메시지를 출력합니다.
    PaymentProcessor 클래스를 생성하고, 여러 결제 방법을 처리할 수 있는 메소드를 구현하세요.
    이 메소드는 Payment 인터페이스 타입의 배열을 매개변수로 받아,
    배열에 포함된 모든 결제 방법에 대해 결제를 수행합니다.

    출력 예시
    =====
    신용카드로 10000원 결제되었습니다.
    은행 이체로 10000원 결제되었습니다.
    모바일 결제로 10000원 결제되었습니다.
 */
public class Quiz1 {
    public static void main(String[] args) {
        PaymentProcessor processor = new PaymentProcessor();

        Payment[] payments = {new BankTransfer(), new CreditCard(), new MobilePay()};
        processor.process(payments, 10000);
    }
}
