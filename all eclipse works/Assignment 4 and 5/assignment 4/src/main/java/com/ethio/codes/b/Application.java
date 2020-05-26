package com.ethio.codes.b;

import java.util.Date;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.ethio.codes.a.HibernateUtil;

public class Application {

	public static void main(String[] args) {
		Transaction tx = null;
		Session session = HibernateUtil.getSessionFactory().openSession();
		try {
			tx = session.beginTransaction();
			
			Flight flight1 = new Flight();
			flight1.setFlightnumber(222);
			flight1.setFrom("Cedar");
			flight1.setTo("Washington");
			flight1.setDate(new Date());
			
			Flight flight2 = new Flight();
			flight2.setFlightnumber(222);
			flight2.setFrom("Cedar");
			flight2.setTo("Washington");
			flight2.setDate(new Date());
			
			Flight flight3 = new Flight();
			flight3.setFlightnumber(222);
			flight3.setFrom("Cedar");
			flight3.setTo("Washington");
			flight3.setDate(new Date());
			
			
			
			session.persist(flight1);
			session.persist(flight2);
			session.persist(flight3);
			
			Passenger passenger1 = new Passenger();
			passenger1.setName("John Doe");
			passenger1.addFlight(flight1);
			passenger1.addFlight(flight2);
			
			Passenger passenger2 = new Passenger();
			passenger2.setName("John Doe");
			passenger2.addFlight(flight3);
			
			
			
			session.persist(passenger1);
			session.persist(passenger2);
		
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
