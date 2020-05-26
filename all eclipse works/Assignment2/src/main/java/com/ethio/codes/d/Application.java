package com.ethio.codes.d;

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
		
			
			Reservation2 reservation1 = new Reservation2();
			reservation1.setDate(new Date());
			
			
			Reservation2 reservation2 = new Reservation2();
			reservation2.setDate(new Date());
		
			Reservation2 reservation3 = new Reservation2();
			reservation3.setDate(new Date());
			
			Reservation2 reservation4 = new Reservation2();
			reservation4.setDate(new Date());
			
			
			Reservation2 reservation5 = new Reservation2();
			reservation5.setDate(new Date());
		
			Reservation2 reservation6 = new Reservation2();
			reservation6.setDate(new Date());
		
			
			session.persist(reservation1);
			session.persist(reservation2);
			session.persist(reservation3);
			session.persist(reservation4);
			session.persist(reservation5);
			session.persist(reservation6);
			
			
			Customer2 customer1 = new Customer2();
			customer1.setName("dawed");
			customer1.addReservation(reservation1);
			customer1.addReservation(reservation2);
		
		
			
			Customer2 customer2 = new Customer2();
			customer2.setName("nesru");
			customer2.addReservation(reservation3);
			customer2.addReservation(reservation4);
		
		
			Customer2 customer3 = new Customer2();
			customer3.setName("muzeyen");
			customer3.addReservation(reservation5);
			customer3.addReservation(reservation6);
		
			
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
