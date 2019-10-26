package genericMethods;

public class printGeneric {
	public static  <T> void printAnyType(T t) {
		System.out.println("I am a variable of "+t.getClass());
		System.out.println("I am the child of "+t.getClass().getGenericSuperclass());
		System.out.println(t);
		
	}
}
