package New;

class CalculatorMemory{
	int num = 5;
	public int add(int n1, int n2) {
		return n1 + n2;
	}
}

public class memory {

	public static void main(String[] args) {
		CalculatorMemory obj = new CalculatorMemory();
		int r1 = obj.add(2, 7);
		System.out.println(r1);
	}

}
