package class0.ex;

public class BankAccount {
    String accountNumber;
    String ownerName;
    long balance;

    public long deposit(int amount) {
        balance += amount;
        System.out.println(amount + "원을 입금했습니다. 잔액은 " + balance + "원입니다.");
        return balance;
    }
    public long withdraw(int amount) {
        if (balance < amount) {
            System.out.println("출금을 할 수 없습니다.");
        } else {
            balance -= amount;
            System.out.println(amount + "원을 출금했습니다. 잔액은 " + balance + "원입니다.");
        }
        return balance;
    }
    public long getBalance() {
        System.out.println("잔액은 " + balance + "원입니다.");
        return balance;
    }

}
