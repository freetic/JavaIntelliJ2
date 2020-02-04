package kr.co.bankaccount;

public class BankAccount {
    private int balance;

    public BankAccount(int balance) {
        this.balance = balance;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public void deposit(int inputNum){
        this.balance += inputNum;
    }

    public void withdraw(int outputNum) throws NegativeBalanceException{
        if(outputNum <= this.balance){
            this.balance -= outputNum;
        } else throw new NegativeBalanceException("잔액보다 많이 출금하셨습니다.");
    }
}
