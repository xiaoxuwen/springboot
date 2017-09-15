package com.hust.springboot.web;

import com.hust.springboot.service.AccountService2;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/account")
@MapperScan("com.hust.springboot.dao")
public class AccountController2 {
    @Autowired
    AccountService2 accountService;

    @RequestMapping(value = "/transfer", method = RequestMethod.GET)
    public void transfer() {
        accountService.transfer();
    }
}
