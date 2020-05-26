package com.ethio.codes.a;

import java.util.Date;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.ethio.codes.e.HibernateUtil;


public class Application {

	public static void main(String[] args) {
		Transaction tx = null;
		Session session = HibernateUtil.getSessionFactory().openSession();
		try {
			tx = session.beginTransaction();
			
			Employee emp1 = new Employee();
			emp1.setEmployeenumber(12);
			emp1.setName("Prof Salek");
			
			Employee emp2 = new Employee();
			emp2.setEmployeenumber(333);
			emp2.setName("Prof Gutrie");
			
			Employee emp3 = new Employee();
			emp3.setEmployeenumber(888);
			emp3.setName("Prof Levi");
			
			Employee emp4 = new Employee();
			emp4.setEmployeenumber(555);
			emp4.setName("Prof Khan");
			
			
			session.persist(emp1);
			session.persist(emp2);
			session.persist(emp3);
			session.persist(emp4);
					
			Department dept1 = new Department();
			dept1.setName("CS");
			
			dept1.addEmployee(emp1);
			emp1.setDept(dept1);
			
			dept1.addEmployee(emp2);
			emp2.setDept(dept1);
			
			Department dept2 = new Department();
			dept2.setName("SE");
			
			dept2.addEmployee(emp3);
			emp3.setDept(dept2);
			
			dept2.addEmployee(emp4);
			emp4.setDept(dept2);
			
			
			session.persist(dept1);
			session.persist(dept2);
					
			tx.commit();
		}
		catch(HibernateException sc) {
			tx.rollback();
			sc.printStackTrace();
		}
		
		finally {
			if (session != null)
				session.close();
		}

	}

}
