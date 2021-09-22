package com.Bank.Account.Controller;


import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.reactive.WebFluxTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.HttpStatus;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.reactive.server.WebTestClient;

import com.Bank.Account.Service.CreateAccountServiceImpl;
import com.Bank.Account.model.BankAccount;

import reactor.core.publisher.Mono;


@RunWith(SpringRunner.class)
@WebFluxTest(CreateAccountController.class)
class BankAccountApplicationControllerTests {
	
	@Autowired
	private WebTestClient webTestClient;
	
	@MockBean
	CreateAccountServiceImpl service;
	
	
	@Test
    public void testCreateAccount() {
        BankAccount account = new BankAccount("1", "2", "Saravanan", "sarvan", "password", "Chennai", "Tamil Nadu", "India", "sarvan2@example.com", "ABCD1234HCH", "1234567890", "19-02-2021", "Savings");
        Mockito.when(service.createAccount(account)).thenReturn(Mono.just(account));
        webTestClient.post().uri("/employees")
        .body(Mono.just(account), BankAccount.class)
        .exchange().expectStatus().isEqualTo(HttpStatus.FORBIDDEN);
    }

}
