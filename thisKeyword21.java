package New;

public class thisKeyword21 {

		public static void main(String[] args) {
			Human2 obj = new Human2();
			 
			 obj.setName("Swechchha");
			 obj.setAge(23);
			 System.out.println("Age: "+ obj.getAge());
			 System.out.println("Name: " +obj.getName());
			
		}

	}


	class Human2{
		private int age;
		private String name;
		public int getAge() {
			return age;
		}
//		public void setAge(int age, Human2 obj) {
//			Human2 obj1 = obj;
//			obj.age = age;
//		}
		
		public void setAge(int age) {
			this.age = age;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		
	}
