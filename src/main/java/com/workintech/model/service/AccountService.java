package com.workintech.model.service;

import com.workintech.model.entity.Account;

import java.util.List;

public interface AccountService {
    Account save(Account account);
    Account findById(Double id);
List<Account> findAll();
}


