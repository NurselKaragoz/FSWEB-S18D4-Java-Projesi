package com.workintech.model.controller;

import com.workintech.model.dao.AccountRepository;
import com.workintech.model.entity.Account;
import com.workintech.model.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/account")
public class AccountController {
    private AccountService accountService;


    @Autowired
    public AccountController(AccountService accountService) {
        this.accountService = accountService;
    }

    @PostMapping("/")
    public Account save(@RequestBody Account account) {
        Account savedAccount = accountService.save(account);
        return savedAccount;
    }

}
