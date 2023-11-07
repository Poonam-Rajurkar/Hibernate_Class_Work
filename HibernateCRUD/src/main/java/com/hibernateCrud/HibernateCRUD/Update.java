package com.hibernateCrud.HibernateCRUD;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.Entity.Employee;
import com.utility.HibernateUtil;

public class Update {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SessionFactory factory = HibernateUtil.getSessionFactory();
		Session ses = HibernateUtil.geSession();
		
		try {
			ses.beginTransaction();
			Employee emp = ses.get(Employee.class, 3);
			
			emp.setEmpName("Ram");
			emp.setEmpDept("Tester");
			ses.getTransaction().commit();
			System.out.println("Updated Successfully");
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
