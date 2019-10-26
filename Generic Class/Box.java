package genericClass;

public class Box <T> {
	private T t;
	public void set(T k) {
		t = k;
	}
	public T get() {
		return t;
	}
}
