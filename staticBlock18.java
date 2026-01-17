package New;

class Mobile1{
	int price;
	String brand;
	static String name;
	
	static {
		name = "Phone";
		System.out.println("I am static");
	}
	
	public Mobile1() {
		price = 200;
		brand = "";
		System.out.println("I am Constructor");
	}
	public void show() {
		System.out.println(brand + " : "+ name + " "+price);
	}
	
}

public class staticBlock18 {
	public static void main(String[] args) {
		Mobile1 obj1 = new Mobile1();
		obj1.brand = "Apple";
		obj1.price = 1500;
		Mobile1.name = "Smart Phone";
		Mobile1 obj2 = new Mobile1();
	}

}
