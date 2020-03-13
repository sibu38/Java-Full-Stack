package com.hibernate.FirstHibernateDemo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="STOCK")

public class Stock {
	
	@GeneratedValue()
	@Id
	@Column(name="id")
	private long stockId;
	
	@Column(name="Stock_Value")
	private double stockValue;
	
	@ManyToOne
	@JoinColumn(name="id")
	private Market Market;
	
	public void Stock()
	{
		
	}

	public Stock(double stockValue, com.hibernate.FirstHibernateDemo.Market market) {
		super();
		this.stockValue = stockValue;
		Market = market;
	}

	public double getStockValue() {
		return stockValue;
	}

	public void setStockValue(double stockValue) {
		this.stockValue = stockValue;
	}

	public Market getMarket() {
		return Market;
	}

	public void setMarket(Market market) {
		Market = market;
	}

	@Override
	public String toString() {
		return  stockId + " - " + stockValue + " - " + Market;
	}

}
