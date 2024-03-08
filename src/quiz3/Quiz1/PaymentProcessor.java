package quiz3.Quiz1;

public class PaymentProcessor {
    public void process(Payment[] payments, int amount) {
        for (Payment payment : payments) {
            payment.pay(amount);
        }
    }
}
