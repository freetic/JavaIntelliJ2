package kr.co.bankaccount;

import java.util.Scanner;

public class BankAccountTest {
    public static void main(String[] args) {
        BankAccount ba = new BankAccount(0);
        Scanner sc = new Scanner(System.in);
        do{
            try{
                print();
                int n = sc.nextInt();
                switch (n){
                    case 1:
                        System.out.println("입금액 : ");
                        int input = sc.nextInt();
                        ba.deposit(input);
                        break;
                    case 2:
                        System.out.println("출금액 : ");
                        int output = sc.nextInt();
                        ba.withdraw(output);
                        break;
                    case 3:
                        System.out.println(ba.getBalance());
                        break;
                    default:
                        System.out.println("틀렸음. 다시");
                        System.out.println();
                }
            }catch (Exception e){
                e.printStackTrace();
            }
        } while(true);
    }

    private static void print(){
        System.out.println("1. 입금");
        System.out.println("2. 출금");
        System.out.println("3. 잔액 보기");
    }
}
