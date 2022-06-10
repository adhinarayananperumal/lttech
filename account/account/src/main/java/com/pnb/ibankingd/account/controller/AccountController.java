package com.pnb.ibankingd.account.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping(value = "/api/account")
public class AccountController {

	@Autowired
	private RestTemplate restTemplate;

	@GetMapping(value = "/getAccountDetail")
	public ResponseEntity<String> getBankAccountNo() {

		try {
			
			String trastr = restTemplate.getForObject("http://TRANSACTIONSERVICE/api/tra/getGetTransactionById",
					String.class);


			return new ResponseEntity<String>("ICICI123" + trastr, HttpStatus.OK);

		} catch (Exception e) {
			e.printStackTrace();
			return new ResponseEntity<>("Account No not found", HttpStatus.OK);
		}
	}

}
