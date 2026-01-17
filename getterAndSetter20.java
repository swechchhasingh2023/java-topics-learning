package New;

public class getterAndSetter20 {
	public static void main(String[] args) {
		Human1 obj = new Human1();
		 
		 obj.setName("Swechchha");
		 obj.setAge(23);
		 System.out.println("Age: "+ obj.getAge());
		 System.out.println("Name: " +obj.getName());
		
	}

}


class Human1{
	private int age = 11;
	private String name = "Swechchha";
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
	
//	public int getAge() {
//		return age;
//	}
//	
//	public String getName() {
//		return name;
//	}
//	
//	public void setAge(int a) {
//		age = a;
//	}
//	
//	public void setName(String n) {
//		name = n;
//	}
}

