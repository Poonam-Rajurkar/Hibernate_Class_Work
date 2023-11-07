package com.hibernate.EmployeeDB.EmployeeHibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	Configuration config = new Configuration();
    	config.configure("hibernate.cfg.xml");
    	SessionFactory factory=config.buildSessionFactory();
    	Session session =factory.openSession();
    	Transaction tx=session.beginTransaction();
    	
        Employee e = new Employee();
        e.setEmpid(2);
        e.setFirstname("Rutuja");
        e.setLastname("Dawle");
        
        session.save(e);
		tx.commit();
		session.close();
    }
}
