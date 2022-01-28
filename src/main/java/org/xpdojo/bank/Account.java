package org.xpdojo.bank;

public class Account {
    int balance;
    public int balance() {
        return 0;
    }

    public int deposit(int money) {
        balance += money;
        return balance;
    }
}
