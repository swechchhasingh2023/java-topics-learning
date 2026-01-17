//package New;
//
//class A15{
//	public void show() {
//		System.out.println("in A show");
//	}
//}
//
//public class AnnonymousInnerClass31 {
//
//	public static void main(String[] args) {
//	
//		A15 obj = new A15();
//		obj.show();
//
//	}
//
//}

// if we want to change the show method
// overroding the behaviour of show method

//package New;
//
//class A15{
//	public void show() {
//		System.out.println("in A show");
//	}
//}
//
//// this class only used once to override method
//
//class B15 extends A15{
//	public void show() {
//		System.out.println("in B show");
//	}
//}
//
//public class AnnonymousInnerClass31 {
//
//	public static void main(String[] args) {
//	
//		A15 obj = new B15();
//		obj.show();
//
//	}
//
//}


package New;

class A15{
	public void show() {
		System.out.println("in A show");
	}
}


public class AnnonymousInnerClass31 {

	public static void main(String[] args) {
	
		A15 obj = new A15() 
		{
			public void show() {
			System.out.println("in A Anonymous show");
		}	
		};
		obj.show();

	}

}

