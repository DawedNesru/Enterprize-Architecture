package com.ethio.assignment5.a;


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
		
		   Product product1 = new Product();
		   product1.setName("LCD Screen Monitor1");
		   product1.setDescription("27 inches");
		   Product product2 = new Product();
		   product2.setName("LCD Screen Monitor2");
		   product2.setDescription("27 inches");
		   Product product3 = new Product();
		   product3.setName("LCD Screen Monitor3");
		   product3.setDescription("27 inches");
		   Product product4 = new Product();
		   product4.setName("LCD Screen Monitor4");
		   product4.setDescription("27 inches");
		   Product product5 = new Product();
		   product5.setName("LCD Screen Monitor5");
		   product5.setDescription("27 inches");
		
			session.persist(product1);
			session.persist(product2);
			session.persist(product3);
			session.persist(product4);
			session.persist(product5);
			
			
			OrderLine orderline1 = new OrderLine();
			orderline1.setQuantity(5);
			orderline1.setPrice(3333);
			orderline1.setProduct(product1);
			
			OrderLine orderline2 = new OrderLine();
			orderline2.setQuantity(5);
			orderline2.setPrice(3333);
			orderline2.setProduct(product1);
			
			OrderLine orderline3 = new OrderLine();
			orderline3.setQuantity(5);
			orderline3.setPrice(3333);
			orderline3.setProduct(product2);
			
			
			OrderLine orderline4 = new OrderLine();
			orderline4.setQuantity(5);
			orderline4.setPrice(3333);
			orderline4.setProduct(product2);
			
			
			OrderLine orderline5 = new OrderLine();
			orderline5.setQuantity(5);
			orderline5.setPrice(3333);
			orderline5.setProduct(product3);
			
			
			OrderLine orderline6 = new OrderLine();
			orderline6.setQuantity(5);
			orderline6.setPrice(3333);
			orderline6.setProduct(product4);
			
			
			session.persist(orderline1);
			session.persist(orderline2);
			session.persist(orderline3);
			session.persist(orderline4);
			session.persist(orderline5);
			session.persist(orderline6);
			
			Order order1 = new Order();
			order1.setOrderId("123333");
			order1.setDate(new Date());
			order1.addOrderLine(orderline1);
			order1.addOrderLine(orderline2);
			order1.addOrderLine(orderline3);
			
			
			Order order2 = new Order();
			order2.setOrderId("123333");
			order2.setDate(new Date());
			order2.addOrderLine(orderline1);
			order2.addOrderLine(orderline2);
			order2.addOrderLine(orderline3);
			
			session.persist(order1);
			session.persist(order2);
			
			
			Customer cust1 = new Customer();
			cust1.setFirstName("Yohannes");
			cust1.setLastName("Girma");
			cust1.addOrder(order1);
			
			Customer cust2 = new Customer();
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
