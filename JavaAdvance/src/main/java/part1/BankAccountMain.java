package part1;

public class BankAccountMain {
    public static void main(String[] args) {
        BankAccount accountAndrzej = new BankAccount(123L, 1000);
        BankAccount accountBeata = new BankAccount(555L, 2000);

        accountAndrzej.BalanceAccount();
        accountAndrzej.paymentAccount(500);
        accountAndrzej.BalanceAccount();
        accountAndrzej.withdrawAccount(300);
        accountAndrzej.BalanceAccount();

        accountAndrzej.getBankAccount();
    }
}
