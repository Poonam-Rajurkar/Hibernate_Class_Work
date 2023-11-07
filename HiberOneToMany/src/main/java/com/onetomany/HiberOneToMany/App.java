package com.onetomany.HiberOneToMany;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.utility.Department;
import com.utility.Employee;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        Session session = sessionFactory.openSession();
        
        try {
        	Department department = new Department();
        	department.setName("IT");
        	
        	Employee emp1 = new Employee();
        	emp1.setName("Poonam");
        	emp1.setDepartment(department);
        	
        	Employee emp2 = new Employee();
        	emp2.setName("Ram");
        	emp2.setDepartment(department);
        	
        	department.getEmployee().add(emp1);
        	department.getEmployee().add(emp2);
        	session.beginTransaction();
        	session.save(department);
        	session.getTransaction().commit();
        }
        finally {
        	session.close();
        	sessionFactory.close();
        }
    }
}
