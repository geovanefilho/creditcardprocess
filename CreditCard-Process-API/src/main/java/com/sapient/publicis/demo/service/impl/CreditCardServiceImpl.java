/**
 * 
 */
package com.sapient.publicis.demo.service.impl;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sapient.publicis.demo.CreditCardUtil;
import com.sapient.publicis.demo.dao.CreditCardDAO;
import com.sapient.publicis.demo.model.CreditCard;
import com.sapient.publicis.demo.service.CreditCardService;

/**
 * @author geovanefilho
 *
 *	Implementation for the services of credit card
 */
@Service(value="creditCardService")
public class CreditCardServiceImpl implements CreditCardService {
	
	@Autowired
	private CreditCardDAO creditCardDao;
	
	/**
	 * {@inheritDoc}
	 * @throws Exception 
	 */
	public CreditCard save(CreditCard creditCard) {
		
		CreditCardUtil.validate(creditCard);
		
		if (creditCard.getError() != null && !creditCard.getError().isEmpty()) {
			return creditCard;
		} else {
			creditCard.setBalance(BigDecimal.ZERO);
			return this.creditCardDao.save(creditCard);
		}
	}

	/** 
	 * {@inheritDoc}
	 */
	public List<CreditCard> getAll() {
		return this.creditCardDao.getAll();
	}

}
