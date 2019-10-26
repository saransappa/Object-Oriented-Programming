public class Student{
	String name;
	int roll;
	void setDetails(String n,int r)
	{
		name=n;
		roll=r;
	}
	
	void putDetails()
	{
		System.out.println("name="+name);
		System.out.println("roll="+roll);
	}
}
