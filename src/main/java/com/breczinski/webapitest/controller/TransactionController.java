package com.breczinski.webapitest.controller;

import com.breczinski.webapitest.models.Transaction;
import com.breczinski.webapitest.repository.TransactionRepository;
import com.breczinski.webapitest.service.TransactionService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.xml.crypto.dsig.TransformService;
import java.util.ArrayList;

@RestController
public class TransactionController {

    TransactionService transactionService;
    TransactionController(TransactionService t){
        transactionService = t;
    }
    @GetMapping("/transactions")
    @ResponseBody
    public ArrayList<Transaction> transactions() {
        return transactionService.GetAll();
    }
}
