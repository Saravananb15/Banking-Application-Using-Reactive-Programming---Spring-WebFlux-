package com.Bank.UpdateAccount.Service;

import org.springframework.stereotype.Service;

import com.Bank.UpdateAccount.model.BankAccount;

//import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface updateAccountService {

	public Mono<Boolean> updateAccount(BankAccount account);

}
