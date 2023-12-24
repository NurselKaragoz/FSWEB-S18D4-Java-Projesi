package com.workintech.model.service;

import com.workintech.model.entity.Account;
import com.workintech.model.dao.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class AccountServiceImpl implements AccountService{
    private AccountRepository accountRepository;

    @Autowired
    public AccountServiceImpl(AccountRepository accountRepository) {
        this.accountRepository = accountRepository;
    }


    @Override
    public Account save(Account account) {
        return null;
    }

    @Override
    public Account findById(Double id) {
        return null;
    }

    @Override
    public List<Account> findAll() {
        return null;
    }
}
