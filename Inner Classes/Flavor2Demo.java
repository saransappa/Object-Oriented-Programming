interface Hello{
	void show();
}

public class Flavor2Demo {
	static Hello d = new Hello() {
		public void show(){
			System.out.println("Inside Flavor2Demo class");
		}
	};
	public static void main(String [] args) {
		d.show();
	}
}
