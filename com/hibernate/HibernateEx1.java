package com.hibernate;



import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.model.Address;
import com.model.User;

public class HibernateEx1 {
	
	public static void main(String[] args) {
		Configuration cfg = new Configuration().configure("hibernateEx1_cfg.xml");
		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();
		
		User user = new User();
		user.setUserName("Jones");
		user.setAge(45);
		
		Address address = new Address();
		address.setStreet("abc");
		address.setCity("noida");
		address.setState("up");
		address.setCountry("country");
		
		user.setAddress(address);
		
		Transaction transaction = session.beginTransaction();
		
		session.save(user);
		transaction.commit();
		session.close();
		
		System.out.println("user saved successfully");
	}

}
