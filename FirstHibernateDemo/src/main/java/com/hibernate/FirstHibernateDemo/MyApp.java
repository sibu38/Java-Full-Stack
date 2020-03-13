package com.hibernate.FirstHibernateDemo;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class MyApp {

	public static void testGetVsLoad(SessionFactory sessionFactory)
	{
		Session session =sessionFactory.openSession();
		Transaction t=session.beginTransaction();
		t.begin();
		//load gives object not found exception
		//get gives null object
		  Product product=session.get(Product.class, 25L);
		  System.out.println("product: "+product);		  
	       t.commit();
	       session.close();
	}	

	public static void testSaveVSPersist(SessionFactory sessionFactory)
	{//save gives id of object
	 //persist doesnt give id of object returns void
		Session session =sessionFactory.openSession();
		Transaction t=session.beginTransaction();
		t.begin();
		  Product product=new Product("Table", 30000);
		  
		  Long productId=(Long)session.save(product);
	      System.out.println(session.save(product));
	     
	      //System.out.println(session.persist(product)); //Returns Void...so cannot be printed
	      
	      t.commit();
	      session.close();
	 }
	
	public static void testUpdateVSMerge(SessionFactory sessionFactory)
	{		
		//merge() return a object while updating
		//update doesnt return a object while updating
			Session session =sessionFactory.openSession();
			Transaction t=session.beginTransaction();
			t.begin();
			Product product=session.load(Product.class, 18L);
			product.setName("Bat");		  
			product.setPrice(20000.0);
		    t.commit();
		    product.setName("Soap");
		    t=session.beginTransaction();
		    //Product p= (Product)session.merge(product);
		    session.update(product);
		    t.commit();
		    session.close(); 
	}
	
	
	public static void delete(SessionFactory sessionFactory) 
	{
		Session session=sessionFactory.openSession();
		Transaction t=session.beginTransaction();
		Object object=session.load(Product.class,13L);
		session.delete(object);
		t.commit();
		session.close();
	} 
	
	public static void create(SessionFactory sessionFactory) 
	{
		Session session=sessionFactory.openSession();
		Transaction t=session.beginTransaction();
		t.begin();
		Product product=new Product("Table",60000);
		long productId=(Long)session.save(product);	
		System.out.println("Product Id= "+productId);
		t.commit();
		session.close();
	} 
	
	public static void update(SessionFactory sessionFactory) 
	{
		Session session=sessionFactory.openSession();
		Transaction t=session.beginTransaction();
		t.begin();
		Product product=session.load(Product.class, 3L);
		product.setName("Calculator");
		product.setPrice(7000);
		t.commit();
		session.close();
		
	}
	
	public static void display(SessionFactory sessionFactory)
	{
		Session session=sessionFactory.openSession();
		Query q=session.createQuery("from Product");
		List<Product> list=q.list();
		for(Product p:list)
		System.out.println(p);
	}
	
	public static void insertSQL(SessionFactory sessionFactory)
	{
		Session session=sessionFactory.openSession();
		Transaction t=session.beginTransaction();
		t.begin();
		int query=session.createSQLQuery("INSERT INTO product_master(p_id,name,cost) VALUES (6,'Car6',700000)").executeUpdate();;
		/*Query query=session.createSQLQuery("INSERT INTO product_master(p_id,name,cost)");
		query.setParameter("name","Ball");
		query.setParameter("cost",300000);
		query.setParameter("p_id",4);
		System.out.println("Value : "+query.executeUpdate());*/
		session.close();
		
	}
	
	public static void main(String[] args) throws Exception
	{ 
      Configuration configuration =  new Configuration();
      configuration.configure("hibernate.cfg.xml");
      SessionFactory sessionFactory = configuration.buildSessionFactory();
      create(sessionFactory);
      //update(sessionFactory);
      //delete(sessionFactory);
      //display(sessionFactory);
      
      //testGetVsLoad(sessionFactory);
      //testSaveVSPersist(sessionFactory);
      //testUpdateVSMerge(sessionFactory);
      //display(sessionFactory);
      //insertSQL(sessionFactory);
      display(sessionFactory);
      sessionFactory.close();
	}

}