package com.onetomany.HiberOneToMany;

import org.hibernate.SessionFactory;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {
	private static final SessionFactory sessionFactory = buildSessionFactoryNew();
	
	private static SessionFactory builSessionFactory() {
		System.out.println("abc");
		try {
			return new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
			
		}
		catch(Exception e)
		{
			System.out.println("Initial SessionFactory creation failed." + e);
			throw new ExceptionInInitializerError(e);
		}
	}
	
	private static SessionFactory buildSessionFactoryNew() {	
		StandardServiceRegistry standardRegistry = new StandardServiceRegistryBuilder() .configure("hibernate.cfg.xml").build();
        Metadata metadata = new MetadataSources(standardRegistry).getMetadataBuilder().build();
        return metadata.getSessionFactoryBuilder().build();
		
	}


	public static SessionFactory getSessionFactory() {
		return sessionFactory;
}
}
