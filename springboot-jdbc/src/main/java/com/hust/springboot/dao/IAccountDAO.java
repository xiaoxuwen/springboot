package com.hust.springboot.dao;


import com.hust.springboot.entity.Account;

import java.util.List;

/**
 * Created by fangzhipeng on 2017/4/20.
 */
public interface IAccountDAO {
    int add(Account account);

    int update(Account account);

    int delete(int id);

    Account findAccountById(int id);

    List<Account> findAccountList();
}
