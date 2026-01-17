package New;

public class AnonymousObject24 {

	public static void main(String[] args) {
//		new A1();  // Anonymous
		new A1().show();

	}

}

class A1{
	public A1(){
		System.out.println("Object created");
	}
	
	public void show() {
		System.out.println("In a show");
	}
}
