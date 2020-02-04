package kr.co.bankaccount;

public class NegativeBalanceException extends Exception{
    public NegativeBalanceException(String s) {
        super(s);
    }
}
