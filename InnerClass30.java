//package New;
//
//class A14{
//	int age;
//	public void show() {
//		System.out.println("In A inner Show");
//	}
//	
//	class B14	{
//		public void config() {
//			System.out.println("In config A Show");
//		}	
//	}
//}
//
//
//
//public class InnerClass30 {
//
//	public static void main(String[] args) {
//		A14 obj = new A14();
//		obj.show();
//		
//		A14.B14 obj1 = obj.new B14();
//		obj1.config();
//		
//
//	}
//
//}



// can make inner class static 
package New;

class A14{
	int age;
	public void show() {
		System.out.println("In A inner Show");
	}
	
	static class B14	{
		public void config() {
			System.out.println("In config A Show");
		}	
	}
}



public class InnerClass30 {

	public static void main(String[] args) {
		A14 obj = new A14();
		obj.show();
		// 
		A14.B14 obj1 = new A14.B14();
		obj1.config();
		

	}

}
