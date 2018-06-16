/**
 * 
 */
package com.sapient.publicis.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.sapient.publicis.demo.model.CreditCard;
import com.sapient.publicis.demo.service.CreditCardService;

/**
 * @author geovanefilho
 *
 */
@CrossOrigin(origins = "*")
@RestController(value = "CreditCard")
public class CreditCardController {
	
	@Autowired
	private CreditCardService creditCardService;
	
	@PostMapping("/save")
	public CreditCard save(@RequestBody(required = true) CreditCard creditCard) {
		return this.creditCardService.save(creditCard);
	}
	
	@ResponseBody
	@GetMapping("/getAll")
	public List<CreditCard> getAll() {
		return this.creditCardService.getAll();
	}
}