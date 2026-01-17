package New;

class Human3
{
	private String name;
	private int age;
	
	// Default constructor
	public Human3() {
		name = "Singh";
		age= 30;
	}
	
	// parameterized constructor
	
	public Human3(int a, String n) {
		name = n;
		age= a;
	}
	
	public Human3(String n) {
		name = n;
		age= 32;
	}
	
	public void setAge(int age) {
		this.age = age; 
	}
	public void setName(String name) {
		this.name = name; 
	}
	
	
	
	public int getAge() {
		return age;
	}
	
	public String getName() {
		return name;
	}
}

public class Constructor22 {

	public static void main(String[] args) {
		
		Human3 obj = new Human3();
		Human3 obj1 = new Human3(18, "Ankita");
		Human3 obj2 = new Human3("Suraj");
		System.out.println(obj.getName() + " : " +obj.getAge());
		obj.setName("Swechchha");
		obj.setAge(20);
		System.out.println(obj.getName() + " : " +obj.getAge());
		
		System.out.println(obj1.getName() + " : " +obj1.getAge());
		
		System.out.println(obj2.getName() + " : " +obj2.getAge());

	}

}
