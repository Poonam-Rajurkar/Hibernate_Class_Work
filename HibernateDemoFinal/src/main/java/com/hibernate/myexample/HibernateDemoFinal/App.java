package com.hibernate.myexample.HibernateDemoFinal;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


public class App 
{
    public static void main( String[] args )
    {
    	Configuration cfg=new Configuration();
    	cfg.configure("hibernate.cfg.xml");
    	SessionFactory factory=cfg.buildSessionFactory();
    	Session session =factory.openSession();
    	Transaction tx=session.beginTransaction();
   	
 	Student s=new Student();
			s.setId(2);
			s.setStudname("janvi");
			s.setAddress("mumbai");
			
			session.save(s);
			tx.commit();
			session.close();
    }
}
