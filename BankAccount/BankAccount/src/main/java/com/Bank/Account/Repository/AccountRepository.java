package com.Bank.Account.Repository;

import org.springframework.data.repository.reactive.ReactiveCrudRepository;

import com.Bank.Account.model.BankAccount;

import reactor.core.publisher.Mono;

public interface AccountRepository extends ReactiveCrudRepository<BankAccount, Long> {
	Mono<BankAccount> findByUserNameAndPassword(String username, String password);
}
