// Autowire
package com.swechchha.SpringDemp_1;

public class Alien{
	private int age;
	private Computer com;
	
	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Computer getCom() {
		return com;
	}

	public void setCom(Computer com) {
		this.com = com;
	}

	public void code() {
		System.out.println("I am coding");
		com.compile();
	}
}


// Constructor args
//package com.swechchha.SpringDemp_1;
//public class Alien{
//	int age;
//	Laptop lap;
//	Pen pen;
//	
//	public Alien(int age) {
//		super();
//		this.age = age;
//	}
//	public int getAge() {
//		return age;
//	}
//	public void setAge(int age) {
//		this.age = age;
//	}
//	public Laptop getLap() {
//		return lap;
//	}
//	public void setLap(Laptop lap) {
//		this.lap = lap;
//	}
//	
//	public Pen getPen() {
//		return pen;
//	}
//	public void setPen(Pen pen) {
//		this.pen = pen;
//	}
//	public void code() {
//		System.out.println("Coding....");
//		lap.compile();
//	}
//	
//}




// Ref attribute
//package com.swechchha.SpringDemp_1;
//
//public class Alien {
//	int age;
//	Laptop laptop;
//	public Alien() {
//		System.out.println("Object created..");
//	}
//	public int getAge() {
//		return age;
//	}
//
//	public void setAge(int age) {
//		this.age = age;
//	}
//
//	public Laptop getLaptop() {
//		return laptop;
//	}
//
//	public void setLaptop(Laptop laptop) {
//		this.laptop = laptop;
//	}
//
//	public void code() {
//		System.out.println("Coding....");
//		laptop.compile();
//	}
//}


// setter injection
//package com.swechchha.SpringDemp_1;
//
//public class Alien {
//	int age;
//	
//	public int getAge() {
//		return age;
//	}
//
//	public void setAge(int age) {
//		this.age = age;
//	}
//
//	public Alien() {
//		super();
//		System.out.println("Object created");
//	}
//
//	public void code() {
//		System.out.println("Coding....");
//	}
//}




//// scope :  1- Singleton(by default) 2- Prototype
//package com.swechchha.SpringDemp_1;
//
//public class Alien {
//	int age;
//	
//	public Alien() {
//		super();
//		System.out.println("Object created");
//	}
//
//	public void code() {
//		System.out.println("Coding....");
//	}
//}


//package com.swechchha.SpringDemp_1;
//
//public class Alien {
//	public void code() {
//		System.out.println("Coding....");
//	}
//}
