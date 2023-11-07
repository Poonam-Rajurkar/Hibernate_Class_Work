package com.hibernate.songDemo.SongHibernate;

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
    	Configuration configuration = new Configuration();
    	configuration.configure("hibernate.cfg.xml");
    	SessionFactory factory = configuration.buildSessionFactory();
    	Session session = factory.openSession();
    	Transaction tx = session.beginTransaction();
    	
        Song song1 = new Song();	//object creation
        song1.setSongid(4);
        song1.setSongName("Rim zim gire sawan");
        song1.setSinger("Lata Mangeshkar");
        
        session.save(song1);
		tx.commit();
		session.close();
    }
}
