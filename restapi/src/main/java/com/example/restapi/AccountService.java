package com.example.restapi;

import java.util.List;

public interface AccountService {
    List<Account> findAll();
    Account save(Account account);
    Transaction save(Transaction transaction);
    public List<Transaction> getstatement(String date);
}

