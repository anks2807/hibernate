package com.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.model.Chair;
import com.model.Furniture;
import com.model.Table;

public class HibernateEx4 {
	
	public static void main(String[] args) {
		Configuration cfg = new Configuration().configure("hibernateEx1_cfg.xml");
		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();
		
		Chair chair = new Chair();
		chair.setMadeOf("Plastic");
		chair.setManufacturingCompany("company");
		
		Table tb = new Table();
		tb.setMadeOf("Wood");
		tb.setShape("Round");
		
		Transaction txn = session.beginTransaction();
		session.save(chair);
		session.save(tb);
		txn.commit();
		System.out.println("Saved!!");
	}
}
