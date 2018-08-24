package com.hibernate;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.model.Address;
import com.model.Person;
import com.model.User;

public class HibernateEx2 {
	
	public static void main(String[] args) {
		Configuration cfg = new Configuration().configure("hibernateEx1_cfg.xml");
		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();
		
		Person person = new Person();
		person.setName("Jones");
		person.setAge(45);
		
		Address address1 = new Address();
		address1.setStreet("abc");
		address1.setCity("noida");
		address1.setState("up");
		address1.setCountry("country");
		
		person.setAddress(address1);
		
		org.hibernate.Transaction txn = session.beginTransaction();
		session.save(person);
		txn.commit();
		session.close();
		System.out.println("user saved successfully");
		
	}

}
