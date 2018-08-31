package com.hibernate;


import java.util.ArrayList;
import java.util.List;

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
		address1.setCountry("india");
		address1.setPerson(person);
		
		
		Address address2 = new Address();
		address2.setStreet("abc2");
		address2.setCity("aligarh");
		address2.setState("up");
		address2.setCountry("india");
		address2.setPerson(person);
		
//		List<Address> addresses = new ArrayList<Address>();
//		addresses.add(address1);
//		addresses.add(address2);
		
		//person.setAddress(addresses);
		
		
		org.hibernate.Transaction txn = session.beginTransaction();
		session.save(address1);
		session.save(address2);
		txn.commit();
		session.close();
		System.out.println("user saved successfully");
		
	}

}
