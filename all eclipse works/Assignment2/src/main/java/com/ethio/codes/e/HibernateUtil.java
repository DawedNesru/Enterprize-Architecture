package com.ethio.codes.e;

import org.hibernate.SessionFactory;

import org.hibernate.boot.MetadataSources;

import org.hibernate.boot.registry.StandardServiceRegistry;

import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class HibernateUtil {

private static final SessionFactory sessionFactory = buildSessionFactory();

private static SessionFactory buildSessionFactory() {

try {
 final StandardServiceRegistry registry = new StandardServiceRegistryBuilder()
		.configure() // configures settings from hibernate.cfg.xml
        .build();

    return new MetadataSources( registry ).buildMetadata().buildSessionFactory();
}
catch(Exception e) {   

    e.printStackTrace();

    throw new RuntimeException("There was an error building the factory...!");
}
}

public static SessionFactory getSessionFactory() {
     return sessionFactory;
 }
}