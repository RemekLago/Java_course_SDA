package part1;

public class BankAccount {
    private long bankAccount;
    private int balanceAccount;


    public BankAccount(long bankAccount, int balanceAccount) {
        this.bankAccount = bankAccount;
        this.balanceAccount = balanceAccount;
    }

    public void BalanceAccount(){
        System.out.println("Actual balance account for " + bankAccount + " is: " + this.balanceAccount + "$");
    }

    public void paymentAccount(int amount){
        if (amount > 0) {
            balanceAccount += amount;
        } else if (amount <= 0) {
            System.out.println("Error, try again, amount have to be bigger than 0");
        } else if ((bankAccount - amount) < 0) {
            System.out.println("Error, try again, not enough money on account");
        }
    }

    public int withdrawAccount(int amount){
        if (amount > 0) {
        balanceAccount -= amount;
        return balanceAccount;
        }
        else {
            System.out.println("Error, try again, amount have to be bigger than 0");
        }
        return balanceAccount;
    }

    public long getBankAccount() {
        return bankAccount;
    }

    public void setBankAccount(long bankAccount) {
        this.bankAccount = bankAccount;
    }

    public void setBalanceAccount(int balanceAccount) {
        this.balanceAccount = balanceAccount;
    }

    public int getBalanceAccount() {
        return balanceAccount;
    }
}
