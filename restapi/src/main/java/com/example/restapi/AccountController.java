package com.example.restapi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class AccountController {
    @Autowired
    private AccountService accountService;
    @GetMapping("/create")
    public Account create(@RequestBody Account account) {
      return accountService.save(account);
    }
    @GetMapping("/all")
    public List<Account> all() {
        return accountService.findAll();
    }
    @GetMapping("/transact")
    public Transaction create(@RequestBody Transaction transaction) {
       return accountService.save(transaction);

    }
    @GetMapping("/stmt/{from}")
    public List<Transaction> getstmt(@PathVariable String from){
        return accountService.getstatement(from);
    }
}
