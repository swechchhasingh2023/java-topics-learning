package New;
//import java.lang.Math;

public class Inhertence25 {

	public static void main(String[] args) {
		VeryAdv calc = new VeryAdv();
		int r1 = calc.add(2, 4);
//		System.out.println(r1);
		int r2 = calc.sub(9, 4);
//		System.out.println(r2);
		int r3 = calc.multi(9, 4);
		int r4 = calc.div(9, 4);
		double r5 = calc.power(6, 2);
		System.out.println(r1 + " " + r2+ " " +r3+ " " +r4 + " " +r5);

	}

}

class Calculator{
	public int add(int n1, int n2) {
		return n1+n2;
	}
	public int sub(int n1, int n2) {
		return n1-n2;
	}
}

class AdvCalc extends Calculator{
	public int multi(int n1, int n2) {
		return n1*n2;
	}
	public int div(int n1, int n2) {
		return n1/n2;
	}
	
}

class VeryAdv extends AdvCalc{
	public double power(int n1, int n2) {
		return Math.pow(4, 2);
	}
}
