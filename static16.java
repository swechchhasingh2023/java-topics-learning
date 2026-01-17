package New;

class Mobile{
	int price;
	static String name;
	String brand;
	
	public void show() {
		System.out.println(brand + " : " + name + " : " + price);
	}
}

public class static16 {

	public static void main(String[] args) {
		
		
		Mobile obj1 = new Mobile();
		Mobile.name = "SmartPhone";
		obj1.brand = "Apple";
		obj1.price = 1500;
		
		Mobile obj2 = new Mobile();
		Mobile.name = "SmartPhone";
		obj2.brand = "Samsung";
		obj2.price = 1700;
		
		obj1.name = "Very SmartPhone";
		
		obj1.show();
		obj2.show();

	}

}


//package New;
//
//class Mobile{
//	int price;
//	String name;
//	String brand;
//	
//	public void show() {
//		System.out.println(brand + " : " + name + " : " + price);
//	}
//}
//
//public class static16 {
//
//	public static void main(String[] args) {
//		
//		
//		Mobile obj1 = new Mobile();
//		obj1.name = "SmartPhone";
//		obj1.brand = "Apple";
//		obj1.price = 1500;
//		
//		Mobile obj2 = new Mobile();
//		obj2.name = "SmartPhone";
//		obj2.brand = "Samsung";
//		obj2.price = 1700;
//		
//		obj1.show();
//		obj2.show();
//
//	}
//
//}
