public class Driver {
	public static void main(String [] args) {
		System.out.println(Student.getStudents());
		Student s1 = new Student();
		System.out.println(s1.getName());
		System.out.println(s1.getNumber());
		System.out.println(s1.getDOB());
		System.out.println(s1.getPoints());
		Student s2 = new Student("U4CSE18249","Saran","30th January 2001",280);
		System.out.println(s2.getName());
		System.out.println(s2.getNumber());
		System.out.println(s2.getDOB());
		System.out.println(s2.getPoints());
		System.out.println(Student.getStudents());
	}
}
