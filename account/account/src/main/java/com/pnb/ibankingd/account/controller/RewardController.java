package com.pnb.ibankingd.account.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api/getReward")
public class RewardController {
	
	@GetMapping(value = "/getRewardByAccountId")
	public ResponseEntity<String> getBankAccountNo() {

		try {
			
			return new ResponseEntity<String>("100 Cash Back", HttpStatus.OK);

		} catch (Exception e) {
			e.printStackTrace();
			return new ResponseEntity<>("Reward  not found", HttpStatus.OK);
		}
	}

}
