package org.web.model;

import java.io.IOException;

import org.web.model.User;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Solution {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		User user = new User();
		user.setUsername("koki");
		user.setPassword("123");
		
		Service service = new Service();
		service.setSERVICE_NO("12345678901");
		
		SessionFactory sf = new Configuration().configure().buildSessionFactory();
		Session session = sf.openSession();
		session.beginTransaction();
		session.save(user);
		session.save(service);
	
		session.getTransaction().commit();
		session.close();
	}

}
