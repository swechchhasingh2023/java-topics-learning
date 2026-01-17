package New;

import java.util.Scanner;

public class scannerUseadding {

	public static void main(String[] args) {
//		int n1, n2;
		Scanner sc = new Scanner(System.in);
		System.out.print("please enter first number :");
		int num1 = sc.nextInt();
		System.out.print("please enter second number :");
		int num2 = sc.nextInt();
		AdditionVal obj = new AdditionVal();
		int result = obj.add(num1, num2);
		System.out.println("result :"+ result);
		

	}

}

class AdditionVal
{
	public int add(int n1, int n2)
	{
		return n1 + n2;
	}
}