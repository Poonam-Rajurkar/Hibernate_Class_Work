package com.utility;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.Entity.Employee;

public class HibernateUtil {
	static SessionFactory factory = null;
	static {
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		cfg.addAnnotatedClass(Employee.class);
		factory = cfg.buildSessionFactory();
	}
	
	public static SessionFactory getSessionFactory()
	{
		return factory;
	}
	
	public static Session geSession()
	{
		return factory.openSession();
	}
}
