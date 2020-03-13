package com.hibernate.FirstHibernateDemo;



import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class One_One {
	
	public static void create(SessionFactory sessionFactory)
	{
		Session session=sessionFactory.openSession();
		Transaction t=session.beginTransaction();
		t.begin();
		Enquiry enq=new Enquiry("What is your adress?");
		Customer cus=new Customer("Sibu",enq);
		session.persist(cus);
		t.commit();
		session.close();
	}
	
	public static List<Customer> getAllCustomer(SessionFactory sessionFactory)
	{
		 Session session =sessionFactory.openSession();
		Query query=session.createQuery("From Customer");
		 List<Customer> productList=query.list();
	      session.close();
	      return productList;
	}
	public static void main(String []args) throws Exception
	{
		Configuration configuration =  new Configuration();
	    configuration.configure("hibernate1.cfg.xml");
	    SessionFactory sessionFactory= configuration.buildSessionFactory();
	    create(sessionFactory);
	    System.out.println(getAllCustomer(sessionFactory));
	    sessionFactory.close();
	}
}
