package com.sapient.publicis.demo;

import static org.junit.Assert.*;

import java.math.BigDecimal;

import org.junit.Test;

import com.sapient.publicis.demo.model.CreditCard;

public class CreditCardUtilTest {

	@Test
	public void testEmptyNumber() {
		CreditCard card = new CreditCard("Teste", null, new BigDecimal(64354));
		CreditCardUtil.validate(card);
		assertEquals(CreditCardUtil.NUMBER_FORMAT_INVALID, card.getError());
	}
	
	@Test
	public void testInvalidNumber() {
		CreditCard card = new CreditCard("Teste", 234324239l, new BigDecimal(24234));
		CreditCardUtil.validate(card);
		assertEquals(CreditCardUtil.CARD_NUMBER_INVALID, card.getError());
	}
	
	@Test
	public void testValidCard() {
		CreditCard card = new CreditCard("Teste", 5477676281459834l, new BigDecimal(75000));
		CreditCardUtil.validate(card);
		assertNull(card.getError());
	}

}
