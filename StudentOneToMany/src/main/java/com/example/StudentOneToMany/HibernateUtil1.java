package com.example.StudentOneToMany;

import org.hibernate.SessionFactory;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

public class HibernateUtil1 
{
	//Create a SessionFactory using the properties and mappings in this configuration.
	private static final SessionFactory sessionFactory = buildSessionFactoryNew();
	
	private static SessionFactory builSessionFactory() {
		System.out.println("xyz");
		try {
			//Use the mappings and properties specified in an application resource named hibernate.cfg.xml.
			return new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
		}
		catch(Exception e)
		{
			System.out.println("Initial SessionFactory creation failed." + e);
			throw new ExceptionInInitializerError(e);
		}
	}
	
	private static SessionFactory buildSessionFactoryNew() 
	{	
		//building registry
		StandardServiceRegistry standardRegistry = new StandardServiceRegistryBuilder() .configure("hibernate.cfg.xml").build();
        Metadata metadata = new MetadataSources(standardRegistry).getMetadataBuilder().build();
      //Saving SessionFactoryBuilder
        return metadata.getSessionFactoryBuilder().build();	
	}

	public static SessionFactory getSessionFactory() 
	{
		return sessionFactory;
	}
}
