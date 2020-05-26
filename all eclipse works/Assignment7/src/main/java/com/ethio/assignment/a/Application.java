package com.ethio.assignment.a;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Month;
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

			Flight flight1 = new Flight();
			flight1.setFlightnr(3434);
			flight1.setDepartureDate(LocalDate.of(2020, Month.MAY, 25));
			flight1.setDepartureTime(LocalTime.of(12, 40));
			flight1.setArrivalDate(LocalDate.of(2020, Month.MAY, 25));
			flight1.setArrivalTime(LocalTime.of(6, 20));

			Flight flight2 = new Flight();
			flight2.setFlightnr(3434);
			flight2.setDepartureDate(LocalDate.of(2020, Month.JUNE, 12));
			flight2.setDepartureTime(LocalTime.of(4, 50));
			flight2.setArrivalDate(LocalDate.of(2020, Month.JUNE, 12));
			flight2.setArrivalTime(LocalTime.of(8, 35));

			Flight flight3 = new Flight();
			flight3.setFlightnr(3434);
			flight3.setDepartureDate(LocalDate.of(2020, Month.SEPTEMBER, 4));
			flight3.setDepartureTime(LocalTime.of(7, 30));
			flight3.setArrivalDate(LocalDate.of(2020, Month.SEPTEMBER, 4));
			flight3.setArrivalTime(LocalTime.of(5, 25));

			Flight flight4 = new Flight();
			flight4.setFlightnr(3434);
			flight4.setDepartureDate(LocalDate.of(2008, Month.MARCH, 10));
			flight4.setDepartureTime(LocalTime.of(11, 15));
			flight4.setArrivalDate(LocalDate.of(2020, Month.NOVEMBER, 17));
			flight4.setArrivalTime(LocalTime.of(11, 10));

			Airline airline1 = new Airline();
			airline1.setName("American Express");
			airline1.addFlight(flight1);
			flight1.setAirline(airline1);
			airline1.addFlight(flight2);
			flight2.setAirline(airline1);

			Airline airline2 = new Airline();
			airline2.setName("Star Alliance");
			airline2.addFlight(flight3);
			flight3.setAirline(airline2);
			airline2.addFlight(flight4);
			flight4.setAirline(airline2);

			Airport departureAirport1 = new Airport();
			departureAirport1.setAirportcode("CID");
			departureAirport1.setCity("Cedar Rapids");
			departureAirport1.setCountry("USA");
			departureAirport1.setName("Regen");
			departureAirport1.setStatus("departure");

			Airport arrivalAirport1 = new Airport();
			arrivalAirport1.setAirportcode("ABC");
			arrivalAirport1.setCity("No City");
			arrivalAirport1.setCountry("USA");
			arrivalAirport1.setName("No Name");
			arrivalAirport1.setStatus("arrival");

			Airport departureAirport2 = new Airport();
			departureAirport2.setAirportcode("CID2");
			departureAirport2.setCity("Cedar Rapids2");
			departureAirport2.setCountry("USA2");
			departureAirport2.setName("Regen2");
			departureAirport2.setStatus("departure2");

			Airport arrivalAirport2 = new Airport();
			arrivalAirport2.setAirportcode("ABC2");
			arrivalAirport2.setCity("No City2");
			arrivalAirport2.setCountry("USA2");
			arrivalAirport2.setName("No Name2");
			arrivalAirport2.setStatus("arrival2");

			flight1.setDepartureAirport(departureAirport1);
			departureAirport1.addDepartureFlight(flight1);
			arrivalAirport1.addArrivalFlight(flight1);
			flight1.setArrivalAirport(arrivalAirport1);

			flight2.setDepartureAirport(departureAirport2);
			departureAirport2.addDepartureFlight(flight2);
			arrivalAirport2.addArrivalFlight(flight2);
			flight2.setArrivalAirport(arrivalAirport2);

			flight3.setDepartureAirport(departureAirport1);
			departureAirport1.addDepartureFlight(flight3);
			arrivalAirport1.addArrivalFlight(flight3);
			flight3.setArrivalAirport(arrivalAirport1);
			
			flight4.setDepartureAirport(departureAirport2);
			departureAirport2.addDepartureFlight(flight4);
			arrivalAirport2.addArrivalFlight(flight4);
			flight4.setArrivalAirport(arrivalAirport2);

			Airplane airplane1 = new Airplane();
			airplane1.setModel("Boing");
			airplane1.setSerialnr(12333);
			airplane1.setName("Boing");
			airplane1.setCapacity(700);
			airplane1.addFlight(flight1);
			flight1.setAirplane(airplane1);
			airplane1.addFlight(flight2);
			flight2.setAirplane(airplane1);

			Airplane airplane2 = new Airplane();
			airplane2.setModel("A380");
			airplane2.setSerialnr(12333);
			airplane2.setName("Boing");
			airplane2.setCapacity(123);
			airplane2.addFlight(flight3);
			flight3.setAirplane(airplane2);
			airplane2.addFlight(flight4);
			flight4.setAirplane(airplane2);

			session.persist(airline1);
			session.persist(airline2);
			session.persist(airplane1);
			session.persist(airplane2);
			session.persist(departureAirport1);
			session.persist(arrivalAirport1);
			session.persist(departureAirport2);
			session.persist(arrivalAirport2);
			session.persist(flight1);
			session.persist(flight2);
			session.persist(flight3);
			session.persist(flight4);

			tx.commit();
		} catch (HibernateException sc) {
			tx.rollback();
			sc.printStackTrace();
		}

		finally {
			if (session != null)
				session.close();
		}

		// read all data
		session = HibernateUtil.getSessionFactory().openSession();
		try {
			tx = session.beginTransaction();
			// Query query = session.createQuery("from Flight");
			List<Flight> flights = session.createQuery("from Flight", Flight.class).list();
			for (Flight p : flights) {
				System.out.println(p.getFlightnr() + "  " + p.getDepartureAirport().getAirportcode() + " "
						+ p.getDepartureDate() + " " + p.getDepartureTime() + " "
						+ p.getArrivalAirport().getAirportcode() + " " + p.getArrivalDate() + " " + p.getArrivalTime());
			}

			tx.commit();
		} catch (HibernateException sc) {
			tx.rollback();
			sc.printStackTrace();
		}

		finally {
			if (session != null)
				session.close();
		}
		
		
		// read All flights leaving the USA with a capacity > 500 
				session = HibernateUtil.getSessionFactory().openSession();
				try {
					tx = session.beginTransaction();
					// Query query = session.createQuery("from Flight");
					List<Flight> flights = session.createQuery("from Flight f where f.departureAirport.country = 'USA' and f.airplane.capacity > 500", Flight.class).list();
					System.out.println("All flights leaving the USA with a capacity > 500 ");
					for (Flight p : flights) {
						System.out.println(p.getFlightnr() + "  " + p.getDepartureAirport().getAirportcode() + " "
								+ p.getDepartureDate() + " " + p.getDepartureTime() + " "
								+ p.getArrivalAirport().getAirportcode() + " " + p.getArrivalDate() + " " + p.getArrivalTime());
					}

					tx.commit();
				} catch (HibernateException sc) {
					tx.rollback();
					sc.printStackTrace();
				}

				finally {
					if (session != null)
						session.close();
				}
				
				
				// All airlines that use A380 (model) airplanes 
				session = HibernateUtil.getSessionFactory().openSession();
				try {
					tx = session.beginTransaction();
					// Query query = session.createQuery("from Flight");
					List<Flight> flights = session.createQuery("from Flight f where f.airplane.model = 'A380'", Flight.class).list();
					System.out.println("All airlines that use A380 (model) airplanes");
					for (Flight p : flights) {
						System.out.println(p.getFlightnr() + "  " + p.getDepartureAirport().getAirportcode() + " "
								+ p.getDepartureDate() + " " + p.getDepartureTime() + " "
								+ p.getArrivalAirport().getAirportcode() + " " + p.getArrivalDate() + " " + p.getArrivalTime());
					}

					tx.commit();
				} catch (HibernateException sc) {
					tx.rollback();
					sc.printStackTrace();
				}

				finally {
					if (session != null)
						session.close();
				}
				
				// All fights using 747 planes that don’t belong to ‘Star Alliance’ 
				session = HibernateUtil.getSessionFactory().openSession();
				try {
					tx = session.beginTransaction();
					// Query query = session.createQuery("from Flight");
					System.out.println(" All fights using 747 planes that don’t belong to ‘Star Alliance’");
					List<Flight> flights = session.createQuery("from Flight f where f.airline.name <> 'Star Alliance'", Flight.class).list();
					for (Flight p : flights) {
						System.out.println(p.getFlightnr() + "  " + p.getDepartureAirport().getAirportcode() + " "
								+ p.getDepartureDate() + " " + p.getDepartureTime() + " "
								+ p.getArrivalAirport().getAirportcode() + " " + p.getArrivalDate() + " " + p.getArrivalTime());
					}

					tx.commit();
				} catch (HibernateException sc) {
					tx.rollback();
					sc.printStackTrace();
				}

				finally {
					if (session != null)
						session.close();
				}
				// All flights leaving before 12pm on 08/07/2009 
				session = HibernateUtil.getSessionFactory().openSession();
				try {
					tx = session.beginTransaction();
					System.out.println("All flights leaving before 12pm on 08/07/2009 ");
					// Query query = session.createQuery("from Flight");
					List<Flight> flights = session.createQuery("from Flight f where f.departureTime < hour(12) and f.departureDate < year(2009) and f.departureDate < month(07) and f.departureDate < day(8)", Flight.class).list();
					for (Flight p : flights) {
						System.out.println(p.getFlightnr() + "  " + p.getDepartureAirport().getAirportcode() + " "
								+ p.getDepartureDate() + " " + p.getDepartureTime() + " "
								+ p.getArrivalAirport().getAirportcode() + " " + p.getArrivalDate() + " " + p.getArrivalTime());
					}

					tx.commit();
				} catch (HibernateException sc) {
					tx.rollback();
					sc.printStackTrace();
				}

				finally {
					if (session != null)
						session.close();
				}

	}
}
