package genericMethods;

public class printArray {
	public static <T> void printAnyArray(T [] tarray){
		for(T t : tarray) System.out.println(t);
	}
}
