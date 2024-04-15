package com.breczinski.webapitest.repository;

import com.breczinski.webapitest.models.Transaction;
import org.springframework.stereotype.Repository;

import java.time.LocalTime;
import java.util.ArrayList;

@Repository
public class TransactionRepository {

    public ArrayList<Transaction> GetAll(){
        ArrayList<Transaction> transactions = new ArrayList<Transaction>();

        Transaction transaction1 = new Transaction(9.99, LocalTime.now(), 123, 456, 1);
        Transaction transaction2 = new Transaction(9.99, LocalTime.now(), 123, 456, 2);
        Transaction transaction3 = new Transaction(9.99, LocalTime.now(), 123, 456, 3);

        transactions.add(transaction1);
        transactions.add(transaction2);
        transactions.add(transaction3);

        return transactions;
    }
}
