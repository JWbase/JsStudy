package userexception;

public class AccountExample {
    public static void main(String[] args) {
        Account account = new Account();

        //입금
        account.deposit(1000000); //100만원 입금
        System.out.println("잔액 = " + account.getBalance());

        //출금
        try {
            account.withdraw(3000000); //300만원 출금
        } catch (InsufficientException e) {
            String message = e.getMessage();
            System.out.println(message);
        }
    }
}
