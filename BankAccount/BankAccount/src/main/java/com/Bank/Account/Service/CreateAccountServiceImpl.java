package com.Bank.Account.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Bank.Account.Repository.AccountRepository;
import com.Bank.Account.model.BankAccount;

import reactor.core.publisher.Flux;
//import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
@Service
public  class CreateAccountServiceImpl implements CreateAccountService{
	
	@Autowired
	AccountRepository accRepo;
	
	@Override
	public Mono<BankAccount> getAccount(long id) {
		return accRepo.findById(id);
	}

	@Override
	public Mono<BankAccount> createAccount(BankAccount account) {
		return accRepo.save(account);
	}



    @Override
    public Mono<BankAccount> loginAccount(String username,String password){
        return accRepo.findByUserNameAndPassword(username,password);
    }

	


	

}
