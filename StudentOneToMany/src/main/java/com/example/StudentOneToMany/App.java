//Q.1)Create student and  Course Entity to show one to Many and Many to one mapping

package com.example.StudentOneToMany;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.model.Course;
import com.model.Student;

public class App 
{
    public static void main( String[] args )
    {
    	//It creates Sessions
        SessionFactory sessionFactory = HibernateUtil1.getSessionFactory();
        //It opens a new session.
        Session session = sessionFactory.openSession();
        
        try {
        	//Creating object of Course class
        	Course course = new Course();
        	course.setName("Javascript");
        	
        	//Creating object of Student class
        	Student stud1 = new Student();
        	stud1.setName("Sita");
        	stud1.setCourse(course);
        	
        	//Creating object of Student class
        	Student stud2 = new Student();
        	stud2.setName("Geeta");
        	stud2.setCourse(course);
        	
        	//Calling the methods of Course class and passing objects of student class as arguments
        	course.getStud().add(stud1);
        	course.getStud().add(stud2);
        	
        	//Begin a unit of work and return the associated Transaction object.
        	session.beginTransaction();
        	
        	// Persist the given transient instance, first assigning a generated identifier.
        	session.save(course);
        	
        	//It make data stored in the database permanent.
        	session.beginTransaction().commit();
        }
        finally {
        	// End the session by releasing the JDBC connection and cleaning up.
        	session.close();
        	
        	//Destroy this SessionFactory and release all resources
        	sessionFactory.close();
        }
    }
}
