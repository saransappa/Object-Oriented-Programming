
public class Driver1 { //Driver for MemberInner.java
	public static void main(String [] args) {
		MemberInner.Inner in = new MemberInner().new Inner();
		in.innerMethod();
	}
}
