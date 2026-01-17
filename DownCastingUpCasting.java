//package New;
//
//public class DownCastingUpCasting {
//
//	public static void main(String[] args) {
//		double d = 4.5;
//		int n = (int)d;
//		System.out.println(n);
//
//	}
//
//}


package New;

class A13{
	public void show1() {
		System.out.println("In A.. show");
	}
}

class B13 extends A13{
	public void show2() {
		System.out.println("In B show");
	}
}

public class DownCastingUpCasting {

	public static void main(String[] args) {
//		A13 obj = new A13();
//		obj.show1();
//		obj.show2();  // not working
		
//		A13 obj = (A13) new B13(); // impilitly type casting done - upcasting
//		obj.show1();
//		obj.show2();  // not working
		
		// why downcasting even after creating object B13 but still can't see the method show2 - bcz refrence is A type
		
		A13 obj = new B13(); 
		B13 obj1 = (B13) obj;
		obj1.show2();  // not working
	}

}