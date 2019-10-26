public class Circle implements Shape{
	private double radius;
	Circle(double r){
		radius = r;
	}	
	//@Override
	public double area(){
		return pi*radius*radius;
	}
	//@Override
	public double perimeter(){
		return 2*pi*radius;
	}
}
