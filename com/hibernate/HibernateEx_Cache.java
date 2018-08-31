package com.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.model.Employee;

public class HibernateEx_Cache {

	public static void main(String[] args) {
		
		Configuration cfg = new Configuration().configure("hibernateEx1_cfg.xml");
		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();
		
		Employee emp = new Employee();
		emp.setName("ankit");
		
		Transaction txn = session.beginTransaction();
		session.persist(emp);
		txn.commit();
		session.close();
		
		session = factory.openSession();
		Transaction txn2 = session.beginTransaction();
		Employee emp2 = (Employee)session.get(Employee.class,1);
				

	}

}
