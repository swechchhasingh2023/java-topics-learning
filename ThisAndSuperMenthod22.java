package New;

public class ThisAndSuperMenthod22 {

	public static void main(String[] args) {
		
//		B obj = new B();
		B obj = new B(4);
//		B obj = new B();

	}

}

class A{
	public A() {
		System.out.println("In A");
	}
	
	public A(int n) {
		System.out.println("In A INT");
	}
}

class B extends A
{
	public B (){
		super();
		System.out.println("In B");
	}
	
//	public B (int n){
//		super(n);
//		System.out.println("In B INT");
//	}
	
	public B (int n){
		this();
		System.out.println("In B INT");
	}
}