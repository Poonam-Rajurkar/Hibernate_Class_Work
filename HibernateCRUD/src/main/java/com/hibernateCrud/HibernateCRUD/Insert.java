package com.hibernateCrud.HibernateCRUD;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.Entity.Employee;
import com.utility.HibernateUtil;

public class Insert {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SessionFactory factory = HibernateUtil.getSessionFactory();
		Session ses = HibernateUtil.geSession();
		
		try {
			ses.beginTransaction();
			Employee emp = new Employee("Poonam", "Java Developer", 50000.00);
			Employee emp2 = new Employee("Janvi", "C++ Developer", 4000.00);
			Employee emp3 = new Employee("Rutuja", ".Net Developer", 34000.00);
			Employee emp4 = new Employee("Sakshi", "Python Developer", 12000.00);
			Employee emp5 = new Employee("Khushbu", ".Net Developer", 5000.00);
			ses.save(emp);
			ses.save(emp2);
			ses.save(emp3);
			ses.save(emp4);
			ses.save(emp5);
			
			ses.getTransaction().commit();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
