package com.hust.springboot.dao;

import com.hust.springboot.entity.Account;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by fangzhipeng on 2017/4/20.
 */
public interface AccountDao extends JpaRepository<Account, Integer> {
}
