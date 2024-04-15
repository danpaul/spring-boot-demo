package com.breczinski.webapitest.controller;

import com.breczinski.webapitest.models.Transaction;
import com.breczinski.webapitest.repository.TransactionRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class TransactionController {

    TransactionRepository transactionRepository;
    TransactionController(TransactionRepository t){
        transactionRepository = t;
    }
    @GetMapping("/transactions")
    public ArrayList<Transaction> transactions() {
        return transactionRepository.GetAll();
    }
}
