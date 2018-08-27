package com.hibernate;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.model.User;
import com.model.Vehicle;

public class HibernateEx3 {
	public static void main(String[] args) {
		Configuration cfg = new Configuration().configure("hibernateEx1_cfg.xml");
		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();
		
		User user = new User();
		user.setUserName("Jones");
		user.setAge(45);
		
		Vehicle v = new Vehicle();
		v.setVehicleName("bike");
		
		Vehicle v2 = new Vehicle();
		v2.setVehicleName("car");
		
		List<Vehicle> vehicles = new ArrayList<Vehicle>();
		vehicles.add(v);vehicles.add(v2);
		
		user.setVehicles(vehicles);
		
		org.hibernate.Transaction txn = session.beginTransaction();
		session.save(user);
		txn.commit();
		session.close();
		System.out.println("user saved successfully");
		
		
	}
}
