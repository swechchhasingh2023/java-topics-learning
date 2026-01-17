// if dont not want to assign data direcltly
package New;


class Human{
	private int age = 11;
	private String name = "Swechchha";
	
	public int getAge() {
		return age;
	}
	
	public String getName() {
		return name;
	}
	
	public void setAge(int a) {
		age = a;
	}
	
	public void setName(String n) {
		name = n;
	}
}

public class EncapsulationIn19 {
	public static void main(String[] args) {
	 Human obj = new Human();
	 
	 obj.setName("Swechchha");
	 obj.setAge(23);
	 System.out.println("Age: "+ obj.getAge());
	 System.out.println("Name: " +obj.getName());
	}

}








//package New;
//
//class Human{
//	private int age = 11;
//	private String name = "Swechchha";
//	
//	public int getAge() {
//		return age;
//	}
//	
//	public String getName() {
//		return name;
//	}
//}
//
//public class encapsulationInJava19 {
//	public static void main(String[] args) {
//	 Human obj = new Human();
////	 System.out.println(obj.name);
//	 System.out.println("Age: "+ obj.getAge());
//	 System.out.println("Name: " +obj.getName());
//	}
//
//}
