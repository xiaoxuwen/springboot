package com.hust.springboot.dao;

import com.hust.springboot.entity.Account;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AccountDao extends JpaRepository<Account, Integer> {
}
