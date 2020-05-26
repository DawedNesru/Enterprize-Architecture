package com.ethio.codes.a;


import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;




public class Application {

	public static void main(String[] args) {
		Transaction tx = null;
		Session session = HibernateUtil.getSessionFactory().openSession();
		try {
			tx = session.beginTransaction();
		
			
			
			
			Laptop5 laptop1 = new Laptop5();
			laptop1.setBrand("DELL");
			laptop1.setType("15 inches");
			
			
			Laptop5 laptop2 = new Laptop5();
			laptop2.setBrand("DELL");
			laptop2.setType("15 inches");
			
			
			Laptop5 laptop3 = new Laptop5();
			laptop3.setBrand("DELL");
			laptop3.setType("15 inches");
			
			Laptop5 laptop4 = new Laptop5();
			laptop4.setBrand("DELL");
			laptop4.setType("15 inches");
			
			Employee5 emp1 = new Employee5();
			emp1.setFirstname("Osman");
			emp1.setLastname("Shereffa");
			emp1.addLaptop(laptop1);
			laptop1.setEmp(emp1);
			emp1.addLaptop(laptop2);
			laptop2.setEmp(emp1);
			
			
			Employee5 emp2 = new Employee5();
			emp1.setFirstname("Gorden");
			emp1.setLastname("Brown");
			emp1.addLaptop(laptop3);
			laptop3.setEmp(emp2);
			emp1.addLaptop(laptop4);
			laptop4.setEmp(emp2);
			
		
		
			session.persist(laptop1);
			session.persist(laptop2);
			session.persist(laptop3);
			session.persist(laptop4);
			
			session.persist(emp1);
			session.persist(emp2);
				
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
