package edu.mum.cs.cs544.examples;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class Application {
	private static SessionFactory sessionFactory;
	public static void main(String[] args) {
		Transaction tx = null;
		Session session = HibernateUtil.getSessionFactory().openSession();
		try {

			tx = session.beginTransaction();
			Employee employee = new Employee();
			employee.setFirstname("Frank");
			employee.setLastname("Miller");
			session.persist(employee);
			tx.commit();
		} catch (HibernateException e) {
			tx.rollback();
			e.printStackTrace();
		} finally {
			if (session != null)
				session.close();
		}
		try {
			session = HibernateUtil.getSessionFactory().openSession();
			tx = session.beginTransaction();
			List<Employee> employeeList = session.createQuery("from Employee").list();
			for (Employee emp : employeeList) {
				System.out.println("firstname= " + emp.getFirstname() + ", lastname= " + emp.getLastname());
			}
			tx.commit();
		} catch (HibernateException e) {
			tx.rollback();
			e.printStackTrace();
		} finally {
			if (session != null)
				session.close();
		}
		}
}