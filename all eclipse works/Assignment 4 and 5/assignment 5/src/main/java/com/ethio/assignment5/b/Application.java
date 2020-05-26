package com.ethio.assignment5.b;


import java.util.Date;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.ethio.assignment5.a.HibernateUtil;




public class Application {

	public static void main(String[] args) {
		Transaction tx = null;
		Session session = HibernateUtil.getSessionFactory().openSession();
		try {
			tx = session.beginTransaction();
		
			CD product1 = new CD();
		   product1.setName("LCD Screen Monitor1");
		   product1.setDescription("27 inches");
		   product1.setArtist("Sinafikish");
		   
		   DVD product2 = new DVD();
		   product2.setName("LCD Screen Monitor2");
		   product2.setDescription("27 inches");
		   product2.setGenre("Action");
		   
		   
		   Book2 product3 = new Book2();
		   product3.setName("LCD Screen Monitor3");
		   product3.setDescription("27 inches");
		   product3.setTitle("Akel Dama");
			session.persist(product1);
			session.persist(product2);
			session.persist(product3);
			
			
			OrderLine2 orderline1 = new OrderLine2();
			orderline1.setQuantity(5);
			orderline1.setPrice(3333);
			orderline1.setProduct(product1);
			
			OrderLine2 orderline2 = new OrderLine2();
			orderline2.setQuantity(5);
			orderline2.setPrice(3333);
			orderline2.setProduct(product1);
			
			OrderLine2 orderline3 = new OrderLine2();
			orderline3.setQuantity(5);
			orderline3.setPrice(3333);
			orderline3.setProduct(product2);
			
			
			OrderLine2 orderline4 = new OrderLine2();
			orderline4.setQuantity(5);
			orderline4.setPrice(3333);
			orderline4.setProduct(product2);
			
			
			OrderLine2 orderline5 = new OrderLine2();
			orderline5.setQuantity(5);
			orderline5.setPrice(3333);
			orderline5.setProduct(product3);
			
		
			
			session.persist(orderline1);
			session.persist(orderline2);
			session.persist(orderline3);
			session.persist(orderline4);
			session.persist(orderline5);
		
			
			Order2 order1 = new Order2();
			order1.setOrderId("123333");
			order1.setDate(new Date());
			order1.addOrderLine(orderline1);
			order1.addOrderLine(orderline2);
			order1.addOrderLine(orderline3);
			
			
			Order2 order2 = new Order2();
			order2.setOrderId("123333");
			order2.setDate(new Date());
			order2.addOrderLine(orderline1);
			order2.addOrderLine(orderline2);
			order2.addOrderLine(orderline3);
			
			session.persist(order1);
			session.persist(order2);
			
			
			Customer3 cust1 = new Customer3();
			cust1.setFirstName("Yohannes");
			cust1.setLastName("Girma");
			cust1.addOrder(order1);
			
			Customer3 cust2 = new Customer3();
			cust2.setFirstName("Sebsibe");
			cust2.setLastName("Molalign");
			cust2.addOrder(order2);
			
			
			session.persist(cust2);
			session.persist(cust2);
				
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
