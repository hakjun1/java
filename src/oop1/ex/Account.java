package oop1.ex;

public class Account {
    int balance;//잔액

    void desposit(int amount) {
        balance += amount;
    }

    void withdraw(int amount) {
        if (balance - amount < 0) {
            System.out.println("잔액 부족");
        } else {
            balance -= amount;
        }
    }

}
