package com.hibernate;



import java.util.ArrayList;
import java.util.List;

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
		
		Address address1 = new Address();
		address1.setStreet("abc");
		address1.setCity("noida");
		address1.setState("up");
		address1.setCountry("country");
		
		Address address2 = new Address();
		address2.setStreet("abc");
		address2.setCity("noida");
		address2.setState("up");
		address2.setCountry("country");
		
		List<Address> addresses = new ArrayList<>();
		addresses.add(address2);
		addresses.add(address1);
		
		//user.setAddress(addresses);
		
		
		
		Transaction transaction = session.beginTransaction();
		
		session.save(user);
		transaction.commit();
		session.close();
		
		System.out.println("user saved successfully");
	}

}
