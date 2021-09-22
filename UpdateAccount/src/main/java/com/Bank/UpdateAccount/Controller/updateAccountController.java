package com.Bank.UpdateAccount.Controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import com.Bank.UpdateAccount.Service.updateAccountServiceImpl;
import com.Bank.UpdateAccount.model.BankAccount;
import com.Bank.UpdateAccount.model.ResponseMessage;

import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/updateAccount")
public class updateAccountController {
	@Autowired
	updateAccountServiceImpl AccService;

	@PutMapping("/{id}")
	public Mono<ResponseEntity<ResponseMessage>> updateAccount(@RequestBody BankAccount account, @PathVariable long id) {
		account.setCustomerId(id);
		System.out.println(id);
		AccService.updateAccount(account);
		System.out.println(account);
		return Mono.just(ResponseEntity.ok().body(this.getResponse(account.getId(), "Account Updated")));

	}

	// get an id and message and return the value
	public ResponseMessage getResponse(String string, String message) {
		ResponseMessage response = new ResponseMessage();
		response.setId(string);
		response.setStatus(HttpStatus.OK.name());
		response.setStatusCode(HttpStatus.OK.value());
		response.setMessage(message);
		return response;

	}
}
