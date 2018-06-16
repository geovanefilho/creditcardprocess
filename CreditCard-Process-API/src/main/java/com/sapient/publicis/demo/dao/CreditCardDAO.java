/**
 * 
 */
package com.sapient.publicis.demo.dao;

import java.util.List;

import com.sapient.publicis.demo.model.CreditCard;

/**
 * @author geovanefilho
 *
 * Data access object for Credit Card
 */
public interface CreditCardDAO extends GenericDao<CreditCard> {

	/**
	 * Gets all credit cards saved
	 * 
	 * @return
	 */
	public List<CreditCard> getAll();
}
