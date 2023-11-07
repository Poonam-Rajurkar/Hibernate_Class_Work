//Q.2)Create Car Entity class with different annotation.
package com.hibernate.AnnotationDemo.Hibernate.CarAnnotationHiber;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App 
{
    public static void main( String[] args )
    {
    	//An instance of Configuration allows the application to specify properties and mapping documents to be used when creating a SessionFactory.
    	Configuration config = new Configuration();
    	//Use the mappings and properties specified in an application resource named hibernate.cfg.xml.
    	config.configure("hibernate.cfg.xml");
    	
    	//It obtain Session instances from this factory
    	SessionFactory factory=config.buildSessionFactory();
    	
    	//Open a Session.
    	Session session =factory.openSession();
    	Transaction tx=session.beginTransaction();
    	
    	//Creating object of Car class & passing arguments 
        Car c = new Car();
        c.setCarId(3);
        c.setCarName("Breeza");
        c.setCost(220000);
        
        session.save(c);
        
        //Flush the associated Session and end the unit of work 
		tx.commit();
		
		//Destroy this SessionFactory and release all resources
		session.close();
    }
}
