package New;

class A111{
	public void show() {
		System.out.println("in A show");
	}
}

class B111 extends A111 {
	public void show() {
		System.out.println("in B show");
	}
}

class C111 extends A111 {
	public void show() {
		System.out.println("in C show");
	}
}
public class Polymorphism27 {

	public static void main(String[] args) {
		A111 obj = new A111();
		obj.show();
		
		obj = new B111();
		obj.show();
		
		obj = new C111();
		obj.show();
	}

}
