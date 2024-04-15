package com.breczinski.webapitest.service;

import com.breczinski.webapitest.models.Transaction;
import com.breczinski.webapitest.repository.TransactionRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class TransactionService {
    TransactionRepository transactionRepository;

    TransactionService(TransactionRepository t){
        transactionRepository = t;
    }

    public ArrayList<Transaction> GetAll(){
        return this.transactionRepository.GetAll();
    }
}
