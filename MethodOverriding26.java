package New;

class CalculatorAdds{
	public int add(int n1, int n2) {
		return n1+n2;
}
}
	
class advCalcAdds{
	public int add(int n1, int n2) {
		return n1+n2+1;
}
}


public class MethodOverriding26 {

	public static void main(String[] args) {
		advCalcAdds obj = new advCalcAdds();
		int r1= obj.add(2, 7);
		System.out.println(r1);
		
	}
}




//package New;
//
//public class MethodOverriding26 {
//
//	public static void main(String[] args) {
//		B3 obj =new B3();
//		obj.show();
//
//	}
//
//}
//
//class A3{
//	public void show() {
//		System.out.println("In A show");
//	}
//}
//
//class B3 extends A3{
////	public void show() {
////		System.out.println("In B show");
////	}
//}
