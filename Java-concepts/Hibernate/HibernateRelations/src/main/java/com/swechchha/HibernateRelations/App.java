// one to one

//package com.swechchha.HibernateRelations;
//
//import org.hibernate.Session;
//import org.hibernate.SessionFactory;
//import org.hibernate.boot.registry.BootstrapServiceRegistryBuilder;
//import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
//import org.hibernate.cfg.Configuration;
//import org.hibernate.service.ServiceRegistry;
//
///**
// * Hello world!
// *
// */
//public class App 
//{
//    public static void main( String[] args )
//    {
////        System.out.println( "Hello World!" );
//    	
//    	Laptop laptop = new Laptop();
//    	laptop.setLid(101);
//    	laptop.setLname("Dell");
//    	
//    	
//    	Student s = new Student();
//    	s.setName("swe");
//    	s.setRollno(1);
//    	s.setMarks(50);
//    	s.setLaptop(laptop);
//    
//    	
//    	Configuration con = new Configuration().configure()
//    		.addAnnotatedClass(Student.class).addAnnotatedClass(Laptop.class);
//    	
//    	ServiceRegistry registry = new StandardServiceRegistryBuilder()
//    			.applySettings(con.getProperties()).build();
//    	SessionFactory sf= con.buildSessionFactory();
//    	Session session = sf.openSession();
//    	session.beginTransaction();
//    	session.save(laptop);
//    	session.save(s);
//    	session.getTransaction().commit();
//    }
//}


// one to many
//package com.swechchha.HibernateRelations;
//
//import org.hibernate.Session;
//import org.hibernate.SessionFactory;
//import org.hibernate.boot.registry.BootstrapServiceRegistryBuilder;
//import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
//import org.hibernate.cfg.Configuration;
//import org.hibernate.service.ServiceRegistry;
//
//public class App 
//{
//    public static void main( String[] args )
//    {
////        System.out.println( "Hello World!" );
//    	
//    	Laptop laptop = new Laptop();
//    	laptop.setLid(101);
//    	laptop.setLname("Dell");
//    	
//    	
//    	Student s = new Student();
//    	s.setName("swe");
//    	s.setRollno(1);
//    	s.setMarks(50);
//    	s.getLaptop().add(laptop);
//    
//    	
//    	Configuration con = new Configuration().configure()
//    		.addAnnotatedClass(Student.class).addAnnotatedClass(Laptop.class);
//    	
//    	ServiceRegistry registry = new StandardServiceRegistryBuilder()
//    			.applySettings(con.getProperties()).build();
//    	SessionFactory sf= con.buildSessionFactory();
//    	Session session = sf.openSession();
//    	session.beginTransaction();
//    	session.save(laptop);
//    	session.save(s);
//    	session.getTransaction().commit();
//    }
//}


////  many to one
//package com.swechchha.HibernateRelations;
//
//import org.hibernate.Session;
//import org.hibernate.SessionFactory;
//import org.hibernate.boot.registry.BootstrapServiceRegistryBuilder;
//import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
//import org.hibernate.cfg.Configuration;
//import org.hibernate.service.ServiceRegistry;
//
//public class App 
//{
//    public static void main( String[] args )
//    {
////        System.out.println( "Hello World!" );
//    	
//    	Laptop laptop = new Laptop();
//    	laptop.setLid(101);
//    	laptop.setLname("Dell");
//    	
//    	
//    	Student s = new Student();
//    	s.setName("swe");
//    	s.setRollno(1);
//    	s.setMarks(50);
//    	s.getLaptop().add(laptop);
//    
//    	
//    	Configuration con = new Configuration().configure()
//    		.addAnnotatedClass(Student.class).addAnnotatedClass(Laptop.class);
//    	
//    	ServiceRegistry registry = new StandardServiceRegistryBuilder()
//    			.applySettings(con.getProperties()).build();
//    	SessionFactory sf= con.buildSessionFactory();
//    	Session session = sf.openSession();
//    	session.beginTransaction();
//    	session.save(laptop);
//    	session.save(s);
//    	session.getTransaction().commit();
//    }
//}

//  many to many
package com.swechchha.HibernateRelations;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.BootstrapServiceRegistryBuilder;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

public class App 
{
    public static void main( String[] args )
    {
//        System.out.println( "Hello World!" );
    	
    	Laptop laptop = new Laptop();
    	laptop.setLid(101);
    	laptop.setLname("Dell");

    	Student s = new Student();
    	s.setName("swe");
    	s.setRollno(1);
    	s.setMarks(50);
    	s.getLaptop().add(laptop);
    	
    	laptop.getStudent().add(s);
  	
    	Configuration con = new Configuration().configure()
    		.addAnnotatedClass(Student.class).addAnnotatedClass(Laptop.class);
    	
    	ServiceRegistry registry = new StandardServiceRegistryBuilder()
    			.applySettings(con.getProperties()).build();
    	SessionFactory sf= con.buildSessionFactory();
    	Session session = sf.openSession();
    	session.beginTransaction();
    	session.save(laptop);
    	session.save(s);
    	session.getTransaction().commit();
    }
}
