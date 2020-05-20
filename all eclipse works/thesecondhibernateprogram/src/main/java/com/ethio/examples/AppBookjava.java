package com.ethio.examples;


import java.util.Date;
import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class AppBookjava {
	public static void main(String[] args) {
		Transaction tx = null;
		Session session = HibernateUtil.getSessionFactory().openSession();
		
		//this is to insert data
		try {
        
			tx = session.beginTransaction();
		Book book1 = new Book();
		book1.setTitle("C#");
		book1.setISBN("12333333");
		book1.setAuthor("Daniel");
		book1.setPrice(2332);
		book1.setPublish_date(new Date());
		Book book2 = new Book();
		book2.setTitle("C#");
		book2.setISBN("12333333");
		book2.setAuthor("Daniel");
		book2.setPrice(2332);
		book2.setPublish_date(new Date());
		Book book3 = new Book();
		book3.setTitle("C#");
		book3.setISBN("12333333");
		book3.setAuthor("Daniel");
		book3.setPrice(2332);
		book3.setPublish_date(new Date());
				session.persist(book1);
				session.persist(book2);
				session.persist(book3);
			tx.commit();
		} catch (HibernateException e) {
			tx.rollback();
			e.printStackTrace();
		} finally {
			if (session != null)
				session.close();
		}
		
		//this is to display all information
		try {
			session = HibernateUtil.getSessionFactory().openSession();
			tx = session.beginTransaction();
			List<Book> bookList = session.createQuery("from Book", Book.class).list();
			for (Book b : bookList) {
				System.out.println("Title  = " + b.getTitle() + ", ISBN = " + b.getISBN() + 
						" , Author = " + b.getAuthor() + ", Price = " + b.getPrice() + ", Published Date = " + b.getPublish_date());
			}
			tx.commit();
		} catch (HibernateException e) {
			tx.rollback();
			e.printStackTrace();
		} finally {
			if (session != null)
				session.close();
		}
		
		//this is to delete from book
		try {
			session = HibernateUtil.getSessionFactory().openSession();
			tx = session.beginTransaction();
		Book book1 =  (Book)session.load(Book.class, 1); 
		session.delete(book1);
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
			List<Book> bookList = session.createQuery("from Book", Book.class).list();
			for (Book b : bookList) {
				System.out.println("Title  = " + b.getTitle() + ", ISBN = " + b.getISBN() + 
						" , Author = " + b.getAuthor() + ", Price = " + b.getPrice() + ", Published Date = " + b.getPublish_date());
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