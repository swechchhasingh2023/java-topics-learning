package New;

public class classandobject {
	public static void main(String args[]) {
		
//		int num1 = 10;
//		int num2 = 20;
//		int result = num1 + num2;
//		System.out.println(result);
//		Addition obj = new Addition();
//		int ans = obj.add(2, 3);
//		System.out.println(ans);
		
		int num1 = 4;
		int num2 = 5;
		Addition obj = new Addition();
		int result = obj.add(num1, num2);
		System.out.println("result :"+result);
		
	}
}

class Addition{
	int num;
	public int add(int n1, int n2) {
		return n1+n2;
	}
}
