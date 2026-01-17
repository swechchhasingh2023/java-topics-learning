// AutoWire]
package com.swechchha.SpringDemp_1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class App{
	public static void main(String args[]) {
		ApplicationContext context = new FileSystemXmlApplicationContext("spring.xml");
		Alien obj = (Alien)context.getBean("alien");
		obj.code();
		System.out.println(obj.getAge());
	}
}




// Constuctor args
//package com.swechchha.SpringDemp_1;
//
//import org.springframework.context.ApplicationContext;
//import org.springframework.context.support.FileSystemXmlApplicationContext;
//
//public class App{
//	public static void main(String args[]) {
//		ApplicationContext context = new FileSystemXmlApplicationContext("spring.xml");
//		Alien obj = (Alien)context.getBean("alien");
//		obj.code();
//		System.out.println(obj.age);
//	}
//}




// Ref attribute
//package com.swechchha.SpringDemp_1;
//import org.springframework.context.ApplicationContext;
//import org.springframework.context.support.FileSystemXmlApplicationContext;
//
//public class App{
//	public static void main(String arags[]) {
//		ApplicationContext context = new FileSystemXmlApplicationContext("spring.xml");
//		Alien obj = (Alien)context.getBean("alien");
//		System.out.println("primitive value assigned from property: "+obj.getAge());
//		
//		obj.code();
//	}
//}




//setter injection
//import org.springframework.context.ApplicationContext;
//import org.springframework.context.support.FileSystemXmlApplicationContext;
//
//public class App{
//	public static void main(String arags[]) {
//		ApplicationContext context = new FileSystemXmlApplicationContext("spring.xml");
//		Alien obj = (Alien)context.getBean("alien");
//		System.out.println("primitive value assigned from property: "+obj.getAge());
//		
//	}
//}


//// scope :  1- Singleton(by default) 2- Prototype
//package com.swechchha.SpringDemp_1;
//
//import org.springframework.context.ApplicationContext;
//import org.springframework.context.support.FileSystemXmlApplicationContext;
//
//public class App{
//	public static void main(String args[]) {
//		ApplicationContext context = new FileSystemXmlApplicationContext("spring.xml");
//		// if don't create object it will not call constructor
////		Alien obj1 = (Alien)context.getBean("alien");
////		obj1.age=15;
////		obj1.code();
////		System.out.println(obj1.age);
////		
////		Alien obj2 = (Alien)context.getBean("alien");
////		obj2.code();
////		System.out.println(obj2.age);
//		
//	}
//}




// Singleton

//package com.swechchha.SpringDemp_1;
//
//import org.springframework.context.ApplicationContext;
//import org.springframework.context.support.FileSystemXmlApplicationContext;
//
//public class App 
//{
//    public static void main( String[] args )
//    {	
//    	 ApplicationContext context = new FileSystemXmlApplicationContext("spring.xml");
//    	 
//    	 Alien obj1 = (Alien)context.getBean("alien");
//    	 obj1.age= 15;
//    	 obj1.code();
//    	 System.out.println(obj1.age);
//    	 
//    	 Alien obj2 = (Alien)context.getBean("alien");
//    	 obj2.code();
//    	 System.out.println(obj2.age);
//    	 // both the objects are referring same object
//    }
//}


//package com.swechchha.SpringDemp_1;
//
//import org.springframework.context.ApplicationContext;
//import org.springframework.context.support.FileSystemXmlApplicationContext;
//
//public class App 
//{
//    public static void main( String[] args )
//    {	
//    	  ApplicationContext context =
//                  new FileSystemXmlApplicationContext("spring.xml");
//
//          Alien obj = (Alien) context.getBean("alien");
//          obj.code();
//    }
//}

//
//package com.swechchha.SpringDemp_1;
//
//import org.springframework.beans.factory.BeanFactory;
//import org.springframework.core.io.FileSystemResource;
//
//public class App 
//{
//    public static void main( String[] args )
//    {	
//    	BeanFactory factory = new XmlBeanFactory(new FileSystemResource("spring.xml")); 
//    	 Alien obj = (Alien)factory.getBean("alien");
//    }
//}
