package com.breczinski.webapitest.models;
import java.time.LocalTime;

public class Transaction {
    public double amount;
    public LocalTime time;
    public int fromAccount;
    public int toAccount;
    public int id;

    public Transaction(double amount, LocalTime time, int fromAccount, int toAccount, int id){
        this.amount = amount;
        this.time = time;
        this.fromAccount = fromAccount;
        this.toAccount = toAccount;
        this.id = id;
    }

    @Override
    public String toString() {
        return String.format("total amount %s", this.amount);
    }
}
