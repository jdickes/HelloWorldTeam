
public class Course {

	
	public static void main(String[] args) {
		Student[] students = new Student[2];

		Graduate gradStudent = new Graduate("Bob");
		Undergraduate undergradStudent = new Undergraduate("Joe");
		
		students[0] = gradStudent ;
		students[1] = undergradStudent;
		
		
		System.out.println(students[1].getName() + "'s grade is: " + students[1].computeGrade(65));
		System.out.println(students[0].getName() + "'s grade is: " + students[0].computeGrade(65));
	}

}
