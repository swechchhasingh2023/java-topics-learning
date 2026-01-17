//package New;
//
//class Developer{
//	public void devApp() {
//		System.out.println("developing code");
//	}
//}
//
//public class InterFaces32 {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		Developer swechchha = new Developer();
//		swechchha.devApp();
//	}
//
//}



//package New;
//
//class Laptop1{
//	public void code(){
//		System.out.println("code, compile, run...");
//	}
//}
//
//class Developer1{
//	public void devApp(Laptop1 lap) {
//		lap.code();
//	}
//}
//
//public class InterFaces32 {
//
//	public static void main(String[] args) {
//		Laptop1 lap = new Laptop1();
//		Developer1 swechchha = new Developer1();
//		swechchha.devApp(lap);
//	}
//
//}

//package New;
//
//class Computer1{
//	public void code(){
//	}
//}
//
//class Desktop1 extends Computer1{
//	public void code(){
//		System.out.println("code, compile, run... : faster");
//	}
//}
//
//class Laptop1 extends Computer1 {
//	public void code(){
//		System.out.println("code, compile, run...");
//	}
//}
//
//class Developer1{
//	public void devApp(Computer1 lap) {
//		lap.code();
//	}
//}
//
//public class InterFaces32 {
//
//	public static void main(String[] args) {
//		Computer1 lap = new Laptop1();
//		Computer1 desk = new Desktop1();
//		Developer1 swechchha = new Developer1();
//		swechchha.devApp(desk);
//		swechchha.devApp(lap);
//	}
//
//}


//package New;
//
//abstract class Computer1{
//	public abstract void code();
//}
//
//class Desktop1 extends Computer1{
//	public void code(){
//		System.out.println("code, compile, run... : faster");
//	}
//}
//
//class Laptop1 extends Computer1 {
//	public void code(){
//		System.out.println("code, compile, run...");
//	}
//}
//
//class Developer1{
//	public void devApp(Computer1 lap) {
//		lap.code();
//	}
//}
//
//public class InterFaces32 {
//
//	public static void main(String[] args) {
//		Computer1 lap = new Laptop1();
//		Computer1 desk = new Desktop1();
//		Developer1 swechchha = new Developer1();
//		swechchha.devApp(desk);
//		swechchha.devApp(lap);
//	}
//
//}


package New;

interface Computer1{
	public abstract void code();
}

class Desktop1 implements Computer1{
	public void code(){
		System.out.println("code, compile, run... : faster");
	}
}

class Laptop1 implements Computer1 {
	public void code(){
		System.out.println("code, compile, run...");
	}
}

class Developer1{
	public void devApp(Computer1 lap) {
		lap.code();
	}
}

public class InterFaces32 {

	public static void main(String[] args) {
		Computer1 lap = new Laptop1();
		Computer1 desk = new Desktop1();
		Developer1 swechchha = new Developer1();
		swechchha.devApp(desk);
		swechchha.devApp(lap);
	}

}