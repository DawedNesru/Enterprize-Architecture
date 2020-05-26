package com.ethio.codes.e;

import java.util.Date;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;


public class Application {

	public static void main(String[] args) {
		Transaction tx = null;
		Session session = HibernateUtil.getSessionFactory().openSession();
		try {
			tx = session.beginTransaction();
			
			Book book1 = new Book();
			book1.setIsbn("112");
			book1.setTitle("JAVA");
			book1.setAuthor("Rod Jonson");
			
			Book book2 = new Book();
			book2.setIsbn("999");
			book2.setTitle("ASD");
			book2.setAuthor("Gig Four");
			
			Book book3 = new Book();
			book3.setIsbn("333");
			book3.setTitle("C#");
			book3.setAuthor("Deitel");
			
			
			session.persist(book1);
			session.persist(book2);
			session.persist(book3);
			
			Reservation reservation1 = new Reservation();
			reservation1.setDate(new Date());
			reservation1.setBook(book1);
			
			Reservation reservation2 = new Reservation();
			reservation2.setDate(new Date());
			reservation2.setBook(book2);
			
			Reservation reservation3 = new Reservation();
			reservation3.setDate(new Date());
			reservation3.setBook(book3);
			
			session.persist(reservation1);
			session.persist(reservation2);
			session.persist(reservation3);
			
			
			Customer customer1 = new Customer();
			customer1.setName("dawed");
			customer1.setReservation(reservation1);
			
			Customer customer2 = new Customer();
			customer2.setName("nesru");
			customer2.setReservation(reservation2);
			
			Customer customer3 = new Customer();
			customer3.setName("muzeyen");
			customer3.setReservation(reservation3);
			
			session.persist(customer1);
			session.persist(customer2);
			session.persist(customer3);
		
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
