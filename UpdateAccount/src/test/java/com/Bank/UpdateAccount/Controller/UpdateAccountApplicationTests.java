package com.Bank.UpdateAccount.Controller;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.HttpStatus;
import org.springframework.test.web.reactive.server.WebTestClient;

import com.Bank.UpdateAccount.Service.updateAccountServiceImpl;
import com.Bank.UpdateAccount.model.BankAccount;

import reactor.core.publisher.Mono;

@SpringBootTest
class UpdateAccountApplicationTests {


	@Autowired
	private WebTestClient webTestClient;
	
	@MockBean
	updateAccountServiceImpl service;
	
	
	@Test
    public void testCreateAccount() {
        BankAccount A1 = new BankAccount("1", 2, "Saravanan", "sarvan", "password", "Chennai", "Tamil Nadu", "India", "sarvan222@example.com", "ABCD1234HCH", "1234567890", "19-02-2021", "Savings");
        Mockito.when(service.updateAccount(A1)).thenReturn(Mono.just(A1));
        webTestClient.put().uri("/updateAccount")
        .body(Mono.just(A1), BankAccount.class)
        .exchange().expectStatus().isEqualTo(HttpStatus.OK);
    }
}
