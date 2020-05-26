package com.ethio.codes.c;

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
			
			Student student1 = new Student();
			student1.setFirstname("Muzeyen1");
			student1.setLastname("Awo1");
			student1.setPhoneNr("232331");
			
			Student student2 = new Student();
			student2.setFirstname("Muzeyen2");
			student2.setLastname("Awo2");
			student2.setPhoneNr("232332");
			
			Student student3 = new Student();
			student3.setFirstname("Muzeyen3");
			student3.setLastname("Awo3");
			student3.setPhoneNr("232333");
			
			Student student4 = new Student();
			student4.setFirstname("Muzeyen4");
			student4.setLastname("Awo4");
			student4.setPhoneNr("232334");
			
			Student student5 = new Student();
			student5.setFirstname("Muzeyen5");
			student5.setLastname("Awo5");
			student5.setPhoneNr("232335");
			
			Student student6 = new Student();
			student6.setFirstname("Muzeyen6");
			student6.setLastname("Awo6");
			student6.setPhoneNr("232336");
			
			
			
			Course course1 = new Course();
			course1.setCoursenumber("3434");
			course1.setName("Angular");
			course1.addStudent(student1);
			student1.addCourse(course1);
			course1.addStudent(student2);
			student2.addCourse(course1);
			
			
			Course course2 = new Course();
			course2.setCoursenumber("222");
			course2.setName("Javascript");
			course2.addStudent(student1);
			student3.addCourse(course2);
			course2.addStudent(student3);
			student4.addCourse(course2);
			
			Course course3 = new Course();
			course3.setCoursenumber("111");
			course3.setName("CSS");
			course3.addStudent(student5);
			student5.addCourse(course3);
			course3.addStudent(student6);
			student6.addCourse(course3);
			
			
			session.persist(student1);
			session.persist(student2);
			session.persist(student3);
			session.persist(student4);
			session.persist(student5);
			session.persist(student6);
		
			session.persist(course1);
			session.persist(course2);
			session.persist(course3);
			
			
			
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
