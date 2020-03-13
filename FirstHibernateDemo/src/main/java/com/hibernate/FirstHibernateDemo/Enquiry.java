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

//ONE TO ONE

@Entity
@Table(name="ENQUIRY_MASTER")
public class Enquiry implements Serializable{
	// AUTO, IDENTITY, TABLE, SEQUENCE
	@GeneratedValue
	@Id
	@Column(name="id")
	private long enquiryId;
	
	@Column(name="Enq_Ques")
	private String enqQues;	

	public Enquiry() 
	{
		
	}

	public Enquiry(String enqQues) {
		super();
		this.enqQues = enqQues;
	}

	public String getEnqQues() {
		return enqQues;
	}

	public void setEnqQues(String enqQues) {
		this.enqQues = enqQues;
	}

	@Override
	public String toString() {
		return enquiryId + " - " + enqQues;
	}	

}