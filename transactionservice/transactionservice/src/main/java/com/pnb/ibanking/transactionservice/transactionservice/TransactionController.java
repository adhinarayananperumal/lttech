package com.pnb.ibanking.transactionservice.transactionservice;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api/tra")
public class TransactionController {

	@GetMapping(value = "/getGetTransactionById")
	public ResponseEntity<String> getBankAccountNo() {

		try {
			
			return new ResponseEntity<String>("tra 1000", HttpStatus.OK);

		} catch (Exception e) {
			e.printStackTrace();
			return new ResponseEntity<>("Transaction not found", HttpStatus.OK);
		}
	}

}

