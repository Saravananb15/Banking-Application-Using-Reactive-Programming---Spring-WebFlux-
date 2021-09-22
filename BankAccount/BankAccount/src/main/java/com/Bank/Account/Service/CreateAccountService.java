package com.Bank.Account.Service;

import com.Bank.Account.model.BankAccount;

import reactor.core.publisher.Mono;

public interface CreateAccountService {
	public Mono<BankAccount> getAccount(long id);
//	public Fulx<BankAccount> 
	public Mono<BankAccount> loginAccount(String username,String password);
	public Mono<BankAccount> createAccount(BankAccount account);


}
