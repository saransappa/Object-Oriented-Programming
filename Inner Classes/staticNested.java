
public class staticNested {
	public static void outerMethod() {
		System.out.println("In outer method");
	}
	static class Inner{
		public static void main(String [] args) {
			System.out.println("In inner method");
			outerMethod();
		}
	}
}
