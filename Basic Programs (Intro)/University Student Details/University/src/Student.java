
public class Student {
	static int noOfStudents=0;
	String studentNo;
	String studentName;
	Date dateOfBirth;
	int tariffPoints;
	Student(){
		studentNo= "not known";
		studentName = "not known";
		dateOfBirth = new Date();
		tariffPoints=20;
		noOfStudents++;
	}
	Student(String a,String b,String c,int k){
		studentNo= a;
		studentName = b;
		dateOfBirth = new Date(c);
		tariffPoints=k;
		noOfStudents++;
	}
	public void setNumber(String k) {
		this.studentNo=k;
	}
	public String getNumber() {
		return this.studentNo;
	}
	public void setName(String k) {
		this.studentName=k;
	}
	public String getName() {
		return this.studentName;
	}
	public void setDOB(String k) {
		this.dateOfBirth.setDate(k);
	}
	public String getDOB() {
		return this.dateOfBirth.date;
	}
	public void setPoints(int k) {
		this.tariffPoints=k;
	}
	public int getPoints() {
		return this.tariffPoints;
	}
	public static int getStudents() {
		return noOfStudents;
	}
}
