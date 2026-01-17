package com.swechchha.HibernateFetchEagerLazy;

import java.util.Collection;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class App 
{
    public static void main( String[] args )
    {
       Configuration con = new Configuration().configure()
    		   .addAnnotatedClass(Laptop.class).addAnnotatedClass(Alien.class);
       SessionFactory sf = con.buildSessionFactory();
       Session session = sf.openSession();
       session.beginTransaction();
       Alien a1 = session.get(Alien.class, 1);
      System.out.println(a1.getAname());
      // fetch value of alien not laptop even alien have multiple laptop - Lazy
//       Collection<Laptop> laps = a1.getLap();
//       for (Laptop l :laps) {
//    	   System.out.println(l);
//       }
       session.getTransaction().commit();
   
    }
}
