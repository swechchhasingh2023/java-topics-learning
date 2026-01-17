//package New;
//
//
//abstract class Car{
////	public void drive() {
////		
////	}
//	
//	
//   abstract public void drive();
//   public void playMusic() {
//	 System.out.println("Playing music...");
// }
//
//}
//
//
//class WagnoR extends Car{
//	public void drive() {
//		System.out.println("driving ..");
//	}
//}
//
//
//public class AbstractUse {
//
//	public static void main(String[] args) {
//		
//		WagnoR obj = new WagnoR();
//		obj.drive();
//		
//	}
//
//}

//package New;
//
//
//abstract class Car{
//	
//   abstract public void drive();
//   abstract public void fly();
//   public void playMusic() {
//	 System.out.println("Playing music...");
// }
//
//}
//
//
//class WagnoR extends Car{
//	public void drive() {
//		System.out.println("driving ..");
//	}
//	
//	public void fly() {
//		System.out.println("flying ..");
//	}
//}
//
//
//public class AbstractUse {
//
//	public static void main(String[] args) {
//		
//		Car obj = new WagnoR();
//		
//		obj.drive();
//		obj.fly();
//		obj.playMusic();	
//	}
//
//}


package New;


abstract class Car{
	
   abstract public void drive();
   abstract public void fly();
   public void playMusic() {
	 System.out.println("Playing music...");
 }

}


abstract class WagnoR extends Car{
	public void fly() {
		System.out.println("flying ..");
	}
}

class updatedWagnoR extends WagnoR{   // concreate class
	public void drive() {
		System.out.println("driving ..");
	}
}

public class AbstractUse29 {

	public static void main(String[] args) {
		
		Car obj = new updatedWagnoR();
		
		obj.drive();
		obj.fly();
		obj.playMusic();	
	}

}