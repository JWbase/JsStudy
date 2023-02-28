package userexception;

/**
 * Account : 은행계좌
 * withdraw : 출금
 * balance : 잔고
 * InsufficientException : 잔액부족 시 뜨는 예외처리
 */

public class Account {
    private long balance;

    public Account() {
    }

    public long getBalance() {
        return balance;
    }

    public void deposit(int money) {
        balance += money;
    }

    public void withdraw(int money) throws InsufficientException {
        if (balance < money) {
            throw new InsufficientException("잔액이 부족합니다.");
        }
        balance -= money;
    }
}
