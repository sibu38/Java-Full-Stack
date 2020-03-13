package com.hibernate.FirstHibernateDemo;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class One_Many {
	
	public static void main(String []args)
	{
		Configuration configuration =  new Configuration();
	    configuration.configure("hibernate1.cfg.xml");
	    SessionFactory sessionFactory= configuration.buildSessionFactory();
	   
	}

}
