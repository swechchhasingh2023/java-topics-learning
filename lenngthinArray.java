//package New;
//
//public class lenngthinArray {
//
//	public static void main(String[] args) {
//		int nums[] = new int[4];
//		nums[0] = 4;
//		nums[1] = 8;
//		nums[2] = 3;
//		nums[3] = 9;
//		for (int i = 0; i <nums.length; i++) {
//			System.out.println(nums[i]);
//		}
//
//	}
//
//}

// ----------------------------------------------



package New;

class StudentData{
	int rollno;
	String name;
	int marks;
}

public class lenngthinArray {

	public static void main(String[] args) {
		
		StudentData s1 = new StudentData();
		s1.rollno = 1;
		s1.name = "Swechchha";
		s1.marks = 50;
		
		StudentData s2 = new StudentData();
		s2.rollno = 2;
		s2.name = "Abi";
		s2.marks = 60;
		
		StudentData s3 = new StudentData();
		s3.rollno = 3;
		s3.name = "singh";
		s3.marks = 70;
//		System.out.println(s1);
		
		StudentData students[] = new StudentData[3];
		students[0] = s1;
		students[1] = s2;
		students[2] = s3;
		 
		for (StudentData stud : students) {
			System.out.println(stud.rollno+ " : " + stud.name + " " + stud.marks);
		}
		
//		System.out.println();
	}

}
