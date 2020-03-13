package com.hibernate.FirstHibernateDemo;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="MARKET")
public class Market {
	
	@GeneratedValue()
	@Id
	@Column(name="id")
	private long marketId;
	
	@Column(name="Market_Name")
	private String marketName;
	
	@Column(name="Share_Status")
	private String shareStatus;

	@OneToMany(cascade = {CascadeType.ALL}, fetch=FetchType.EAGER, mappedBy="MARKET")
	private Set<Stock> stocks;
	
	public void Market()
	{
		
	}

	public String getMarketName() {
		return marketName;
	}

	public void setMarketName(String marketName) {
		this.marketName = marketName;
	}

	public String getShareStatus() {
		return shareStatus;
	}

	public void setShareStatus(String shareStatus) {
		this.shareStatus = shareStatus;
	}

	public Set<Stock> getStocks() {
		return stocks;
	}

	public void setStocks(Set<Stock> stocks) {
		this.stocks = stocks;
	}

	@Override
	public String toString() {
		return  marketId + " - " + marketName + " - " + shareStatus ;
	}
	
}
