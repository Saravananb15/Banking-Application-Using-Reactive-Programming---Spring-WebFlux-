package com.Bank.Account.Repository;

import org.springframework.data.repository.reactive.ReactiveCrudRepository;

import com.Bank.Account.model.Account;

public interface AccountRepository extends ReactiveCrudRepository<Account, String>{
}
