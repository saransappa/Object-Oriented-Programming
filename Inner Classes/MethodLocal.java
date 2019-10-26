
public class MethodLocal {
	public void outerMethod() {
		final int x=10;
		System.out.println("In outer method");
		class Inner{
			void innerMethod() {
				System.out.println(x+" In inner method");
			}
		}
		Inner in = new Inner();
		in.innerMethod();
	}
}
