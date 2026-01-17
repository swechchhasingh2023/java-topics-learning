//package com.swechchha.HibernateDemo;
//
//import org.hibernate.Session;
//import org.hibernate.SessionFactory;
//import org.hibernate.cfg.Configuration;
//
//import jakarta.transaction.Transaction;
//
//public class App 
//{
//    public static void main( String[] args )
//    {
//        System.out.println( "Hello World!" );
//        Alienn swechchha = new Alienn();
//        swechchha.setAid(101);
//        swechchha.setName("swe");
//        swechchha.setColor("Green");
//        Configuration con = new Configuration().configure()
//        		.addAnnotatedClass(Alienn.class);
//        SessionFactory sf =con.buildSessionFactory(); 
//        Session session = sf.openSession();
//        org.hibernate.Transaction tx = session.beginTransaction();
//        session.save(swechchha);
//        tx.commit();
//    }
//}

// database connection
//package com.swechchha.HibernateDemo;
//
//import org.hibernate.Session;
//import org.hibernate.SessionFactory;
//import org.hibernate.boot.registry.StandardServiceRegistry;
//import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
//import org.hibernate.cfg.Configuration;
//
//public class App 
//{
//    public static void main( String[] args )
//    {
//        System.out.println( "Hello World!" );
//        Alienn swechchha = new Alienn();
//        swechchha.setAid(102);
//        swechchha.setName("singh");
//        swechchha.setColor("blue");
//        Configuration con = new Configuration().configure()
//        		.addAnnotatedClass(Alienn.class);
//        StandardServiceRegistry registry = new StandardServiceRegistryBuilder()
//        	    .applySettings(con.getProperties())
//        	    .build();
//        SessionFactory sf =con.buildSessionFactory(registry); 
//        Session session = sf.openSession();
//        org.hibernate.Transaction tx = session.beginTransaction();
//        session.save(swechchha);
//        tx.commit();
//    }
//}

//// fetch data from db
//package com.swechchha.HibernateDemo;
//
//import org.hibernate.Session;
//import org.hibernate.SessionFactory;
//import org.hibernate.Transaction;
//import org.hibernate.boot.registry.StandardServiceRegistry;
//import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
//import org.hibernate.cfg.Configuration;
//
//public class App {
//  public static void main( String[] args )
//  {
//	  Alienn obj = null; 
//	  Configuration con = new Configuration().configure()
//			  .addAnnotatedClass(Alienn.class);
//	  StandardServiceRegistry registry = new StandardServiceRegistryBuilder()
//      	    .applySettings(con.getProperties())
//      	    .build();
//	  SessionFactory sf = con.buildSessionFactory();
//	  Session session = sf.openSession();
//	  Transaction tx = session.beginTransaction();
//	  obj = (Alienn)session.get(Alienn.class, 102); //fetch data from database
//	  tx.commit(); 
//	  System.out.println(obj);
//  }
//}

// how to use embeddable object (name =first, last, middle name)
package com.swechchha.HibernateDemo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

public class App {
  public static void main( String[] args )
  {
	  AlienName an = new AlienName();
	  an.setFname("Kumari");
	  an.setLname("singh");
	  an.setMname("Swechchha");;
	  Alienn obj = new Alienn(); 
	  obj.setAid(101);
	  obj.setColor("Green");
	  obj.setAname(an);
	  Configuration con = new Configuration().configure().addAnnotatedClass(Alienn.class);
	 StandardServiceRegistry registry = new StandardServiceRegistryBuilder()
			 .applySettings(con.getProperties()).build();
	 SessionFactory sf = con.buildSessionFactory();
	 
	Session session = sf.openSession();
	Transaction tx = session.beginTransaction();
	  session.save(obj);
	  tx.commit(); 
	  System.out.println(obj);
  }
}
