/**
 * 
 */
package com.sapient.publicis.demo.dao.impl;

import javax.persistence.EntityTransaction;
import javax.persistence.PersistenceException;

import com.sapient.publicis.demo.dao.GenericDao;

/**
 * @author geovanefilho
 *
 *	Implementation of generic methods in dao
 */
public class GenericDaoImpl<T> implements GenericDao<T> {

	/**
	 * {@inheritDoc}
	 */
	public T save(T model) {
		EntityTransaction t = EntityManagerHelper.getEntityManager().getTransaction();
		
		try {
			t.begin();
			
			EntityManagerHelper.getEntityManager().persist(model);
			
			t.commit();
		} catch (PersistenceException e) {
			t.rollback();
			throw e;
		}
		
		return model;
	}

}
