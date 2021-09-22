package com.Bank.Account.Service;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.mock.mockito.MockBean;

import com.Bank.Account.model.BankAccount;

import reactor.test.StepVerifier;

public class CreateAccountServiceTest {
	@MockBean
	CreateAccountServiceImpl service;
	
	@Test
	public void createEmployee() {
		
		 BankAccount account1 = new BankAccount("1", "2", "Saravanan", "sarvan", "password", "Chennai", "Tamil Nadu", "India", "sarvan2@example.com", "ABCD1234HCH", "1234567890", "19-02-2021", "Savings");
		
		 StepVerifier
		.create(service.createAccount(account1))
		.expectNext(account1)
		.expectComplete()
		.verify();
		 
		 StepVerifier
			.create(service.getAccount(2))
			.expectNext(account1)
			.expectComplete()
			.verify();
		
		
	}
}
