package com.Bank.UpdateAccount.Repository;

import org.springframework.data.repository.reactive.ReactiveCrudRepository;

import com.Bank.UpdateAccount.model.BankAccount;


public interface AccountRepository extends ReactiveCrudRepository<BankAccount, Long>{
}
