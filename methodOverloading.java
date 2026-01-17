package New;

class Calculator1{
	public int add(int n1, int n2 , int n3) {
		return n1 +n2 +n3;
	}
	public int add(int n1, int n2) {
		return n1 +n2;
	}
	public double add(double n1, int n2) {
		return n1+ n2;
	}
}

public class methodOverloading {

	public static void main(String[] args) {
		Calculator1 obj = new Calculator1();
		int val = obj.add(2, 3);
		int val1 = obj.add(2, 3, 4);
		double val2 = obj.add(4.3, 2);
		System.out.println(val);
		System.out.println(val1);
		System.out.println(val2);
	}

}
