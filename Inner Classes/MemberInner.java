
public class MemberInner {
	public void outerMethod() {
		System.out.println("In outer method");
	}
	class Inner{
		void innerMethod() {
			System.out.println("In inner method");
			outerMethod();
		}
	}
}
