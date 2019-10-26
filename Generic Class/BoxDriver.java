package genericClass;

public class BoxDriver {
	public static void main(String [] args) {
		Box <String> s = new Box <String> ();
		s.set("Saran");
		System.out.println(s.get());
		Box <Integer> i = new Box <Integer> ();
		i.set(100);
		System.out.println(i.get());

	}
}
