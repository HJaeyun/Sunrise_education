package com.test.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.test.domain.RcvAppl;
import com.test.service.CardService;


@Controller
@RequestMapping("/card")
public class CardController {
	
	private CardService cardService;
	
	@Autowired
	public CardController(CardService cardService) {
		this.cardService = cardService;
	}
	
	@GetMapping("rcvAppl")
	public String rcvApplPage (Model model) {
		return "card/rcvAppl";
	}
	
	@PostMapping("rcvAppl")
	public String rcvApplInsert(RcvAppl rcvAppl) {
		cardService.rcvApplInsert(rcvAppl);
		return "redirect:/card/rcvAppl";
		
	}
	
	@GetMapping("periodList")
	public String periodList (Model model) {
		return "card/periodList";
	}
	
}
