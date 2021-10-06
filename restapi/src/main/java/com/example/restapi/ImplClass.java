package com.example.restapi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class ImplClass implements AccountService{
@Autowired
AccountRepository accountRepository;

@Autowired
TransactionRepository transactionRepository;
    public List<Account> findAll() {
        return accountRepository.findAll();
    }

    public Account save(Account account) {
       return accountRepository.save(account);

    }

    public Transaction save(Transaction transaction){
      return transactionRepository.save(transaction);

    }

    @Override
    public List<Transaction> getstatement(String date) {
        List<Transaction> trans=transactionRepository.findAll();
        List<Transaction> t1=new ArrayList<>();
        try {
            Date date2=new SimpleDateFormat("dd-MM-yyyy").parse(date);

        for(Transaction transaction: trans){

                Date date1=new SimpleDateFormat("dd-MM-yyyy").parse(transaction.getCreated());
                if(date1.compareTo(date2)>0){
                    t1.add(transaction);
                }
        }
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return t1;
    }


}
