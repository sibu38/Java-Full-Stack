package com.hibernate.FirstHibernateDemo;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;



@Entity
@Table(name="CUSTOMER_MASTER")
public class Customer implements Serializable {
	// AUTO, IDENTITY, TABLE, SEQUENCE
	@GeneratedValue()
	@Id
	@Column(name="id")
	private long customerId;
	
	@Column(name="name")
	private String name;
	
	@OneToOne(cascade = {CascadeType.ALL}, fetch=FetchType.EAGER)
	@JoinColumn(name="e_id")
	private Enquiry Enquiry;

	public Customer()
	{
		
	}
	public Customer(String name, Enquiry enquiry) {
		this.name = name;
		this.Enquiry=enquiry;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return customerId + " - " + name + " - " + Enquiry ;
	}

}
