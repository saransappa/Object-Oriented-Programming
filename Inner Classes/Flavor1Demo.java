class Demo{
	void show() {
		System.out.println("Inside Demo class");
	}
}

class Flavor1Demo{
	static Demo d = new Demo(){
		void show() {
			super.show();
			System.out.println("Inside Flavor1Demo class");
		}
	};
	public static void main(String [] args) {
		d.show();
	}
}

