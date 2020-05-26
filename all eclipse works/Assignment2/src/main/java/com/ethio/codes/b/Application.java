package com.ethio.codes.b;

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
			
			Publisher pub1 = new Publisher();
			pub1.setName("Prof Salek");
			Publisher pub2 = new Publisher();
			pub2.setName("Prof Gutrie");
			Publisher pub3 = new Publisher();
			pub3.setName("Prof Levi");
			
			session.persist(pub1);
			session.persist(pub2);
			session.persist(pub3);
			
			Book2 book1 = new Book2();
			book1.setIsbn("112");
			book1.setTitle("JAVA");
			book1.setAuthor("Rod Jonson");
			book1.setPublisher(pub1);
			
			
			Book2 book2 = new Book2();
			book2.setIsbn("999");
			book2.setTitle("ASD");
			book2.setAuthor("Gig Four");
			book2.setPublisher(pub2);
			
			Book2 book3 = new Book2();
			book3.setIsbn("333");
			book3.setTitle("C#");
			book3.setAuthor("Deitel");
			book3.setPublisher(pub3);
			
			Book2 book4 = new Book2();
			book4.setIsbn("333");
			book4.setTitle("C#");
			book4.setAuthor("Deitel");
			//book4.setPublisher(pub3);
			
			
			
			session.persist(book1);
			session.persist(book2);
			session.persist(book3);
			session.persist(book4);
			
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
