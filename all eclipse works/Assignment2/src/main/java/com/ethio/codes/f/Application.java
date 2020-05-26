package com.ethio.codes.f;

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
			
			Office off1 = new Office();
			off1.setRoomNum(122);
			off1.setBuilding("block141");
			
			Office off2 = new Office();
			off2.setRoomNum(172);
			off2.setBuilding("block142");
			
			Office off3 = new Office();
			off3.setRoomNum(152);
			off3.setBuilding("block143");
			
			Office off4 = new Office();
			off4.setRoomNum(012);
			off4.setBuilding("block144");
			
			Office off5 = new Office();
			off5.setRoomNum(102);
			off5.setBuilding("block145");
			
			Office off6 = new Office();
			off6.setRoomNum(120);
			off6.setBuilding("block146");
				
			session.persist(off1);
			session.persist(off2);
			session.persist(off3);
			session.persist(off4);
			session.persist(off5);
			session.persist(off6);
			
			
			Employee2 emp1 = new Employee2();
			emp1.setEmployeenumber(12);
			emp1.setName("Prof Salek");
			
			emp1.addOffice(off1);
			off1.setEmp(emp1);
			emp1.addOffice(off2);
			off2.setEmp(emp1);
			
			Employee2 emp2 = new Employee2();
			emp2.setEmployeenumber(333);
			emp2.setName("Prof Gutrie");
			emp2.addOffice(off3);
			off3.setEmp(emp2);
			
			Employee2 emp3 = new Employee2();
			emp3.setEmployeenumber(888);
			emp3.setName("Prof Levi");
			emp3.addOffice(off4);
			off4.setEmp(emp3);
			emp3.addOffice(off5);
			off5.setEmp(emp3);
			
			Employee2 emp4 = new Employee2();
			emp4.setEmployeenumber(555);
			emp4.setName("Prof Khan");
			emp4.addOffice(off6);
			off6.setEmp(emp4);
			
			
			session.persist(emp1);
			session.persist(emp2);
			session.persist(emp3);
			session.persist(emp4);
					
			Department2 dept1 = new Department2();
			dept1.setName("CS");
			
			dept1.addEmployee(emp1);
			emp1.setDept(dept1);
			
			dept1.addEmployee(emp2);
			emp2.setDept(dept1);
			
			Department2 dept2 = new Department2();
			dept2.setName("SE");
			
			dept2.addEmployee(emp3);
			emp3.setDept(dept2);
			
			dept2.addEmployee(emp4);
			emp4.setDept(dept2);
			
			
			session.persist(dept1);
			session.persist(dept2);
					
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
