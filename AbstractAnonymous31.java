//package New;
//
//abstract class A16{
//	abstract public void show();
//}
//
//public class AbstractAnonymous31 {
//
//
//	public static void main(String[] args) {
//		A16 obj = new A16()
//		{
//		       public void show() {
//		    	   System.out.println("in New show");
//		       }
//	    };	
//	    obj.show();
//	}
//}

package New;

abstract class A16{
	abstract public void show();
	abstract public void config();
}

public class AbstractAnonymous31 {


	public static void main(String[] args) {
		A16 obj = new A16()
		{
		       public void show() {
		    	   System.out.println("in New show");
		       }
		       public void config() {
		    	   System.out.println("in New config");
		       }
	    };	
	    obj.show();
	    obj.config();
	}
}
