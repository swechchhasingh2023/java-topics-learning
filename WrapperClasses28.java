package New;

public class WrapperClasses28 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num = 4;
//		Integer num1 = new Integer(num) ;  // taking premitive value and storing into the object // boxing;
		Integer num1 = num; // number converted to object directly - auto-boxing
		
//		int num2 = num1.intValue();  // from object to primitive - unboxing
//		System.out.println(num1);
//		System.out.println(num2);
		
		int num2 = num1; //  when take out the premitive value to object - auto - unboxing
		System.out.println(num2);
		
		String str = "123"; // no but store in the sting
		int num3 = Integer.parseInt(str);
		System.out.println(num3*2);
		
;
	}

}
