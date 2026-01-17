package New;

class Mobile
{
	int price;
	static String name;
	String brand;
	
	public void show() {
		System.out.println(brand + " : " + name + " " + price);
	}
	
	public static void show1() {
		System.out.println("I am static Method");
//		System.out.println(brand + " : " + name + " " + price);
	}
}

public class staticMethod17 {

	public static void main(String[] args) {
		Mobile obj1 = new Mobile();
		Mobile.name = "SmartPhone";
		obj1.brand = "Apple";
		obj1.price = 1500;
		
		Mobile obj2 = new Mobile();
		Mobile.name = "SmartPhone";
		obj2.brand = "Samsung";
		obj2.price = 1700;
		
		obj1.show();
		obj2.show();
//		We can call static method with class
//		Mobile.show1();
		
		Mobile.show1();
		
	}
	

}
