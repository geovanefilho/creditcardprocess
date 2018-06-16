/**
 * 
 */
package com.sapient.publicis.demo.model;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Transient;

/**
 * @author geovanefilho
 *
 * A model for a Credi card
 */
@Entity
@NamedQuery(name="CreditCard.findAll", query="SELECT cc FROM CreditCard cc ORDER BY cc.givenName")
public class CreditCard {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	
	@Column(length=200)
	private String givenName;
	
	@Column(length=20)
	private Long cardNumber;
	
	@Column(precision=14, scale=2)
	private BigDecimal creditLimit;
	
	@Column(precision=14, scale=2)
	private BigDecimal balance = BigDecimal.ZERO;
	
	@Transient
	private String error;

	/**
	 * JPA Constructor
	 */
	protected CreditCard() {
		super();
	}

	/**
	 * Standard credit card constructor
	 * 
	 * @param givenName
	 * @param cardNumber
	 * @param creditLimit
	 * @param balance
	 */
	public CreditCard(String givenName, Long cardNumber, BigDecimal creditLimit, BigDecimal balance) {
		super();
		this.givenName = givenName;
		this.cardNumber = cardNumber;
		this.creditLimit = creditLimit;
		this.balance = balance;
	}
	
	/**
	 * Standard credit card constructor
	 * 
	 * @param givenName
	 * @param cardNumber
	 * @param creditLimit
	 * 
	 */
	public CreditCard(String givenName, Long cardNumber, BigDecimal creditLimit) {
		super();
		this.givenName = givenName;
		this.cardNumber = cardNumber;
		this.creditLimit = creditLimit;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getGivenName() {
		return givenName;
	}

	public void setGivenName(String givenName) {
		this.givenName = givenName;
	}

	public Long getCardNumber() {
		return cardNumber;
	}

	public void setCardNumber(Long cardNumber) {
		this.cardNumber = cardNumber;
	}

	public BigDecimal getCreditLimit() {
		return creditLimit;
	}

	public void setCreditLimit(BigDecimal creditLimit) {
		this.creditLimit = creditLimit;
	}

	public BigDecimal getBalance() {
		return balance;
	}

	public void setBalance(BigDecimal balance) {
		this.balance = balance;
	}

	public String getError() {
		return error;
	}

	public void setError(String error) {
		this.error = error;
	}
}
