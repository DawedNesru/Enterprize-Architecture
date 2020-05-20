package com.ethio.examples;


import java.util.Date;
import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class Application {
	public static void main(String[] args) {
		Transaction tx = null;
		Session session = HibernateUtil.getSessionFactory().openSession();
		try {

			tx = session.beginTransaction();
			Car car = new Car();
			car.setBrand("Toyota");
			car.setYear(new Date());
			car.setPrice(45222022);
			session.persist(car);
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
			List<Car> carList = session.createQuery("from Car", Car.class).list();
			for (Car c : carList) {
				System.out.println("Brand = " + c.getBrand() + ", Year = " + c.getYear() + " , Price = " + c.getPrice());
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