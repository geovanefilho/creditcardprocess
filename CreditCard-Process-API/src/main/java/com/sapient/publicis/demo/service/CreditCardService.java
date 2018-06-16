/**
 * 
 */
package com.sapient.publicis.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Qualifier;

import com.sapient.publicis.demo.model.CreditCard;

/**
 * @author geovanefilho
 *
 *	Services available for credit card
 */
@Qualifier(value = "creditCardService")
public interface CreditCardService {

	/**
	 * Responsible method for save a Credit Card information
	 * 
	 * @param creditCard
	 * @return <code>true</code> in case of successful and <code>false</code> in other case.
	 */
	public CreditCard save(CreditCard creditCard);
	
	/**
	 * Get all the credit card saved
	 * 
	 * @return
	 */
	public List<CreditCard> getAll();
}
