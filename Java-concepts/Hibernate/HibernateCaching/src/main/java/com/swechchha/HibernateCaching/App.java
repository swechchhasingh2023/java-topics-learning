//package com.swechchha.HibernateCaching;
//// first level cache
//import org.hibernate.Session;
//import org.hibernate.SessionFactory;
//import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
//import org.hibernate.cfg.Configuration;
//import org.hibernate.service.ServiceRegistry;
//
//public class App 
//{
//    public static void main( String[] args )
//    {
//       Alienn a = null;
//       Configuration con = new Configuration().configure()
//    		   .addAnnotatedClass(Alienn.class);
//       ServiceRegistry registry = new StandardServiceRegistryBuilder()
//   			.applySettings(con.getProperties()).build();
//       SessionFactory sf = con.buildSessionFactory(registry);
//       Session session1 = sf.openSession();
//       session1.beginTransaction();
//       
//       // fire two quries: for 101, 102
//       a = (Alienn) session1.get(Alienn.class, 101);
//       System.out.println(a);     
////       a = (Alienn) session1.get(Alienn.class, 102);
////       System.out.println(a);
//       
//       a = (Alienn) session1.get(Alienn.class, 101);
//       System.out.println(a);
//       session1.getTransaction().commit();
//    }
//}



//package com.swechchha.HibernateCaching;
//// first level cache is not working for different session
//import org.hibernate.Session;
//import org.hibernate.SessionFactory;
//import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
//import org.hibernate.cfg.Configuration;
//import org.hibernate.service.ServiceRegistry;
//
//public class App 
//{
//    public static void main( String[] args )
//    {
//       Alienn a = null;
//       Configuration con = new Configuration().configure()
//    		   .addAnnotatedClass(Alienn.class);
//       ServiceRegistry registry = new StandardServiceRegistryBuilder()
//   			.applySettings(con.getProperties()).build();
//       SessionFactory sf = con.buildSessionFactory(registry);
//       Session session1 = sf.openSession();
//       session1.beginTransaction();
//       
//       a = (Alienn) session1.get(Alienn.class, 101);
//       System.out.println(a);
//       
//       session1.getTransaction().commit();
//       session1.close();
//       
//       Session session2 = sf.openSession();
//       session2.beginTransaction();
//       a= (Alienn) session2.get(Alienn.class, 101);
//       System.out.println(a);
//       
//       session2.getTransaction().commit();
//       session2.close();
//  
//    }
//}

//package com.swechchha.HibernateCaching;
//
//import org.hibernate.Session;
//import org.hibernate.SessionFactory;
//import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
//import org.hibernate.cfg.Configuration;
//import org.hibernate.service.ServiceRegistry;
//
//// second level needs to configure
//
//public class App 
//{
//    public static void main( String[] args )
//    {
//       Alienn a = null;
//       Configuration con = new Configuration().configure()
//    		   .addAnnotatedClass(Alienn.class);
//       ServiceRegistry registry = new StandardServiceRegistryBuilder()
//   			.applySettings(con.getProperties()).build();
//       SessionFactory sf = con.buildSessionFactory(registry);
//       Session session1 = sf.openSession();
//       session1.beginTransaction();  
//   
//       a = (Alienn) session1.get(Alienn.class, 101);
//       System.out.println(a);
//       
//       session1.getTransaction().commit();
//       session1.close();
//       
//       Session session2 = sf.openSession();
//       session2.beginTransaction();
//       a= (Alienn) session2.get(Alienn.class, 101);
//       System.out.println(a);
//       
//       session2.getTransaction().commit();
//       session2.close();
// 
//    }
//}


//Query method 
package com.swechchha.HibernateCaching;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;
import org.hibernate.service.ServiceRegistry;


public class App 
{
    public static void main( String[] args )
    {
       Alienn a = null;
       Configuration con = new Configuration().configure()
    		   .addAnnotatedClass(Alienn.class);
       ServiceRegistry registry = new StandardServiceRegistryBuilder()
   			.applySettings(con.getProperties()).build();
       SessionFactory sf = con.buildSessionFactory(registry);
       
       Session session1 = sf.openSession();
       session1.beginTransaction();
       Query q1= session1.createQuery("from Alienn where aid=101");
       q1.setCacheable(true);
       a = (Alienn)q1.uniqueResult();
       System.out.println(a);
       session1.getTransaction().commit();
       session1.close();
       
       Session session2 = sf.openSession();
       session2.beginTransaction();
       Query q2= session2.createQuery("from Alienn where aid=101");
       q2.setCacheable(true);
       a = (Alienn)q2.uniqueResult();
       System.out.println(a);
       session2.getTransaction().commit();
       session2.close();
 
    }
}

