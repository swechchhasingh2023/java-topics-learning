//package New;
//
//public class Object28 {
//
//	public static void main(String[] args) {
//		Laptop obj = new Laptop();
//		obj.model = "Lanavo Yoga";
//		obj.price = 1000;
//		
//		 System.out.println(obj.toString());
//
//	}
//
//}
//
//class Laptop{
//	String model;
//	int price;
//	
//	public String toString() {
//		return "Hey";
//	}
//}


package New;

import java.util.Objects;

public class Object28 {

	public static void main(String[] args) {
		Laptop obj1 = new Laptop();
		obj1.model = "Lanavo Yoga";
		obj1.price = 1000;
		
		Laptop obj2 = new Laptop();
		obj2.model = "Lanavo Yoga1";
		obj2.price = 1000;
		
//		 boolean result = obj1 == obj2;
		 boolean result = obj1.equals(obj2);
		 System.out.println(result);

	}

}

class Laptop{
	String model;
	int price;

	public int hashCode() {
		return Objects.hash(model, price);
	}
	
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Laptop other = (Laptop) obj;
		return Objects.equals(model, other.model) && price == other.price;
	}
	
//	public boolean equals(Laptop that) {
//		return this.model.equals(that.model) && this.price == that.price ;
//	}
	
}