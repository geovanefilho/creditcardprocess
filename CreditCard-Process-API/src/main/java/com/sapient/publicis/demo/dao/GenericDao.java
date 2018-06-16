/**
 * 
 */
package com.sapient.publicis.demo.dao;

/**
 * @author geovanefilho
 *
 */
public interface GenericDao<T> {

	/**
	 * Responsible method for save a Credit Card information
	 * 
	 * @param model
	 * @return
	 */
	public T save(T model);
}
