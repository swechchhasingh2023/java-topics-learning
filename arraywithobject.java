package New;

class Student
{
	int rollNo;
	String name;
	int marks;
}

public class arraywithobject {

	public static void main(String[] args) {
		Student s1 = new Student();
		s1.rollNo = 1;
		s1.name = "Swechchha";
		s1.marks = 60;
		
		Student s2 = new Student();
		s2.rollNo = 2;
		s2.name = "Abinash";
		s2.marks = 70;
		
		Student s3 = new Student();
		s3.rollNo = 3;
		s3.name = "Suraj";
		s3.marks = 80;
		
		Student students[] = new Student[3];
		students[0] = s1;
		students[1] = s2;
		students[2] = s3;
		
//		for (int i = 0; i < students.length; i++) {
//			System.out.println(students[i].rollNo+ " : "+ students[i].name + " " + students[i].marks);
//		}
		
		// using enhanced for loop or for each loop
		for (Student stud : students) {
			System.out.println(stud.rollNo+ " : "+ stud.name + " " + stud.marks);
		}

	}

}
