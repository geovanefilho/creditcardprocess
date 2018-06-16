/**
 * 
 */
package com.sapient.publicis.demo.dao.impl;

import java.math.BigDecimal;
import java.util.List;

import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;

import com.sapient.publicis.demo.dao.CreditCardDAO;
import com.sapient.publicis.demo.model.CreditCard;

/**
 * @author geovanefilho
 * 
 *         Implementation for a credit card data access
 * 
 */
@Repository
public class CreditCardDAOImpl extends GenericDaoImpl<CreditCard> implements CreditCardDAO {

	/**
	 * Implementation using named query
	 * 
	 */
	public List<CreditCard> getAll() {
		TypedQuery<CreditCard> query = EntityManagerHelper.getEntityManager().createNamedQuery("CreditCard.findAll", CreditCard.class);
		List<CreditCard> teste = query.getResultList();
		teste.add(new CreditCard("Teste", 1234654378192346l, BigDecimal.ONE, BigDecimal.ZERO));
		return teste;
	}
}
