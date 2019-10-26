public class Driver{
	public static void main(String [] args){
		Circle c=new Circle(1.22);
		double a = c.area();
		double p = c.perimeter();
		System.out.println("The value of pi is "+ Circle.pi);
		System.out.println("The area of circle is "+a);
		System.out.println("The perimeter of Circle is "+p);
	}
}
