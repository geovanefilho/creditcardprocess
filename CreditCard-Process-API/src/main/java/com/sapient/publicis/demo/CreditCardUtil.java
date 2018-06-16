package com.sapient.publicis.demo;

import com.sapient.publicis.demo.model.CreditCard;

public class CreditCardUtil {

	private static final int MAX_CREDIT_CARD_NUMBER = 19;
	
	public static final String NUMBER_FORMAT_INVALID = "Card number required! It must have up to 19 digits.";
	public static final String CARD_NUMBER_INVALID = "Card number invalid!";
	
	public static void validate(CreditCard creditCard) {
		if (creditCard.getCardNumber() == null) {
			creditCard.setError(NUMBER_FORMAT_INVALID);
			return;
		}
		
		String numCard = new StringBuffer(creditCard.getCardNumber().toString()).reverse().toString();
		if (numCard.length() > MAX_CREDIT_CARD_NUMBER) {
			creditCard.setError(NUMBER_FORMAT_INVALID);
			return;
		}
		
		String[] numbers = numCard.substring(1, numCard.length()).split("");
		
		int i = 0;
		while(i < numbers.length) {
			//Double the value of every second digit.
			Integer val = (Integer.parseInt(numbers[i]) * 2);
			if (val > 9) {
				val -= 9;
			}
			numbers[i] = String.valueOf(val);
			i += 2;
		}
		
		Integer sum = 0;
		i = 0;
		while(i < numbers.length) {
			//Sum all digits
			sum += Integer.parseInt(numbers[i]);
			i++;
		}
		
		int digit = (10 - (sum % 10));
		
		if (!String.valueOf(digit).equals(numCard.substring(0, 1))) {
			creditCard.setError(CARD_NUMBER_INVALID);
		}
		
	}
}
